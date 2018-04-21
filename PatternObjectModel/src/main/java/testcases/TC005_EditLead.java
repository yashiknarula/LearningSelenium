package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_EditLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC005_EditLead";
		testDescription="Login For edit lead";
		testNodes=" Edit Leads";
		category="Sanity";
		authors="Gopi";
		browserName="chrome";
		dataSheetName="TC005_EditLead";
	}
	
	@Test(dataProvider="fetchData")
	public void EditLead(String uName,String pwd,String fname,String editCmp,String newCmp) {
		
		new LoginPage().enterUserName(uName).enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.enterFirstName(fname)
	    .clickFindLeadButton()
	    .clickFirstID()
	    .clickEditLead()
	    .editcmpnyname(editCmp)
	    .clickUpdatebutton()
	    .checkCpmnyname(newCmp);	
	}
	
}
