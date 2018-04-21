package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_DeleteLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC004_Delete Lead";
		testDescription="Login For delete lead";
		testNodes=" Create Leads";
		category="Sanity";
		authors="Gopi";
		browserName="chrome";
		dataSheetName="TC004_DeleteLead";
	}
	
	@Test(dataProvider="fetchData")
	public void DeleteLead(String uName,String pwd,String phn,String lId,String errMsg) {
		
		new LoginPage().enterUserName(uName).enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickPhoneTab()
		.clickPhoneNumberText(phn)
		.clickFindLeadButton()
		.clickFirstID()
        .clickDeleteLead()
		.clickFindLeads()
	    .enterLeadID(lId)
	    .clickFindLeadButton()
	    .verifyErrorMessage(errMsg);
	}
	
}
