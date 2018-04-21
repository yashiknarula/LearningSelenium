package pages;

//import org.bson.util.AbstractCopyOnWriteMap.View;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{
	
	public FindLeadsPage() {		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement elePhnTab;
	@And("click on the phone tab")
	public FindLeadsPage clickPhoneTab() {
		click(elePhnTab);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement elePhoneNumber;
	@And ("Enter phn number as (.*)")
	public FindLeadsPage clickPhoneNumberText(String data) {
		type(elePhoneNumber,data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindlead;
	@And("click on the find lead button")
	public FindLeadsPage clickFindLeadButton() {
		click(eleFindlead);
		return this;
	}
	String str1="";
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleclickFirstID;
	@And ("click on the first lead ID")
	public ViewLead clickFirstID() {
//		str1=getText(eleclickFirstID); 
//		System.out.println("Element to be deleted or edited"+str1);
		click(eleclickFirstID);
		ViewLead view=new ViewLead();
		return view;
	}
	
	@FindBy(how=How.XPATH,using="(//label[text()='Lead ID:']/following::input)[1]")
	private WebElement eleLeadID;
	public FindLeadsPage enterLeadID(String data) {
		type(eleLeadID,data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement elefirstname;
	@And("Enter value in the first name as(.*)")
	public FindLeadsPage enterFirstName(String data) {
		type(elefirstname,data);
		//ViewLead viewlead=new ViewLead();
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-paging-info']")
	private WebElement eleErrorMessage;
	public FindLeadsPage verifyErrorMessage(String data){
		verifyPartialText(eleErrorMessage,data);
		return this;
	}
	
	
}


