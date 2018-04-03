set projectLocation=C:\SalesforceGarage\TGF-DevOps\POC\POC\QA-Automation
cd %projectLocation%
set classpath=%projectLocation%\target\classes;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause


