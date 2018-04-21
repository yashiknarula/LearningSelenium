package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_MergeLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC006_MergeLead";
		testDescription="Login For merge lead";
		testNodes=" merge Leads";
		category="Sanity";
		authors="Gopi";
		browserName="chrome";
		dataSheetName="TC006_MergeLead";
	}
	
	@Test(dataProvider="fetchData")
	public void MergeLead(String uName,String pwd,String frmId,String toId) {
		
		new LoginPage().enterUserName(uName).enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeadLink()
		.clickFromLeadImg()
		.enterMergeleadId(frmId)
		.clickMergeFindLeadButton()
		.clickMergeFirstId()
		.clickToLeadImg()
		.enterMergeleadId(toId)
		.clickMergeFindLeadButton()
		.clickMergeFirstId()
		.clickMergeleadButton();
	}
	
}
