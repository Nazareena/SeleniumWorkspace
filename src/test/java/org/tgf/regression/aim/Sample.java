package org.tgf.regression.aim;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name="EUR 12,660,948";
		
		String name1="12,660,948";
		
		String[] name3= name.split("\\s+");
		String name2=name3[1];
		System.out.println(name2);
		if(name1.equals(name2)){
			System.out.println("PASS");
		}else{
			System.out.println("FAIL");
		}
		
		String name4="(49)";
		name4=name4.replace("(", "");
		name4=name4.replace(")", "");
		System.out.println(name4);
		
		
		DateFormat dateFormat = new SimpleDateFormat("dd/M/yyyy");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //19/3/2018
		
		
	}

}
