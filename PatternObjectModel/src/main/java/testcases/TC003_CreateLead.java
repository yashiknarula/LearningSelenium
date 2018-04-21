package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC003_Create Lead";
		testDescription="Login For create lead";
		testNodes=" Create Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC003_CreateLead";
	} 
	
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd,String cmpName,String fName,String lName) {
		
		new LoginPage().enterUserName(uName).enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickMyLeads()
		.enterCmpnyname(cmpName)
		.enterFirstname(fName).
		enterlastname(lName);
	
		
				
	}

}
