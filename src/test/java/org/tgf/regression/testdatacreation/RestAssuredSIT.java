package org.tgf.regression.testdatacreation;

//import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class RestAssuredSIT extends GenericFunctions
{
    static Response response         ;
    static JsonPath jsonPath         ;
    static String access_Token       ;
    static String instance_URL       ;
    static String json_As_String     ;
    static String soql_Query         ;
    static String bearer_AccesToken  ;
    static String base_URI           ;
    
	static String strAccess_Token = "access_token" ;
	static String strInstance_URL = "instance_url" ;
	
	static String username_SysAdmin_AlokSingh = "alok.singh1@theglobalfund.org.sit";
	static String password_SysAdmin_AlokSingh = "Tgf@2017";
	
	static Header authHeader         ;
	static Header contentType_Header ;
	
    static String CLIENT_ID     = "3MVG9pHRjzOBdkd.Rd77onkWExgNELEDmYWYB3GHo2oO8GK96AsWHT9Q2Qk9PeohqC8cBF80_xQ==";    //Also know as "Consumer Key".
    static String CLIENT_SECRET = "63624774999845774";     //Also know as "Consumer Secret"
    static String USERNAME      = "alok.singh1@theglobalfund.org.sit";
    static String PASSWORD      = "Tgf@2017";
    static String BASE_URL      = "https://test.salesforce.com"; // Testing instance url
    static String GRANTSERVICE  = "/services/oauth2/token?grant_type=password";
    static String REST_ENDPOINT = "/services/data" ;
    static String API_VERSION   = "/v39.0" ;
	
	String lfa_Work_Plan_Object_ID = "01Ib0000000ZA2l";
	
	void get_AccessToken_n_InstanceURL(String username , String password)
	{
		//@formatter:off
		String loginURL = BASE_URL +
			              GRANTSERVICE      +
			              "&client_id="     + CLIENT_ID +
			              "&client_secret=" + CLIENT_SECRET +
			              "&username="      + username +
			              "&password="      + password;
		//@formatter:on	
		
		response =	given().contentType("application/json").when().post(loginURL).then().extract().response();
		
		access_Token  = get_Json_Value(response.asString(),strAccess_Token);
		instance_URL  = get_Json_Value(response.asString(),strInstance_URL);
		
		System.out.println("Access Token :" + access_Token);
		System.out.println("Instance URL :" + instance_URL);
	}
	
	String get_Json_Value (String json_As_String , String key)
	{
		jsonPath = new JsonPath(json_As_String);
		return  jsonPath.get(key);
	}
	
	@BeforeClass
	void init_Basic_Parameters()
	{
		get_AccessToken_n_InstanceURL(username_SysAdmin_AlokSingh, password_SysAdmin_AlokSingh);
		bearer_AccesToken  = "Bearer " + access_Token;
		authHeader         = new Header("Authorization", bearer_AccesToken);
		contentType_Header = new Header("Content-Type" , "application/json; charset=UTF-8");
		base_URI           = instance_URL + REST_ENDPOINT + API_VERSION ;
	}
	
	@Test
	void lfa_WorkPlan_Creation ()
	{
		
		
		JSONObject jsonTest_LFA_Work_Plan_Record = new JSONObject();
		
        jsonTest_LFA_Work_Plan_Record.put("Name"         , "Test LFA WP" + randomTokenID );
        jsonTest_LFA_Work_Plan_Record.put("LFA__c"       , "001Q0000013VuQKIA0");
        jsonTest_LFA_Work_Plan_Record.put("Country__c"   , "a0Ab0000000oNLMEA2");
        jsonTest_LFA_Work_Plan_Record.put("Start_Date__c", "2018-01-01");
        jsonTest_LFA_Work_Plan_Record.put("End_Date__c"  , "2018-12-31");
        jsonTest_LFA_Work_Plan_Record.put("Year__c"      , "2018");
        jsonTest_LFA_Work_Plan_Record.put("Status__c"    , "CT Planning");
		
		json_As_String = jsonTest_LFA_Work_Plan_Record.toString();
		
		String uriCreate_LFA_WP_Record = base_URI + "/sobjects/LFA_Work_Plan__c/" ; 
		response = execute_Post(json_As_String, uriCreate_LFA_WP_Record);
//		response = given().header(contentType_Header).header(authHeader).body(json_As_String).when().post(uriCreate_LFA_WP_Record).then().extract().response();
		
		json_As_String = response.asString();
		String id = get_Json_Value(json_As_String, "id");
		System.out.println(id);
		
	}
	
	@Test
	void country_Creation()
	{
		JSONObject jsonTest_Country_Record = new JSONObject();
		
		jsonTest_Country_Record.put("Name" , "Test Country" + randomTokenID);
		
		json_As_String = jsonTest_Country_Record.toString();
		
		String uriCreate_Country_Record = base_URI + "/sobjects/Country__c";
		
		response = execute_Post(json_As_String, uriCreate_Country_Record);
		
		json_As_String = response.asString();

		String id = get_Json_Value(json_As_String, "id");
		System.out.println(id);
	}

	Response execute_Post(String body_Json_As_String , String uri)
	{
		return given().header(contentType_Header).header(authHeader).body(body_Json_As_String).when().post(uri).then().extract().response();
	}
	
}
