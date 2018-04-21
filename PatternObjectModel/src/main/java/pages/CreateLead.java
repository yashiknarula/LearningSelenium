package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
//import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {	 	
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement elecmpname;
	
	@And("Enter the company name(.*)")
	public CreateLead enterCmpnyname(String data) {
		type(elecmpname,data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='createLeadForm_firstName']")
	private WebElement elefirstname;
	
	@And("Enter the first name(.*)")
	public CreateLead enterFirstname(String data) {
		type(elefirstname,data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='createLeadForm_lastName']")
	private WebElement elelastname;
	
	@And("Enter the Last name(.*)")
	public CreateLead enterlastname(String data) {
		type(elelastname,data);
		return this;	
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement elephone;
	
	@And("Enter phone number(.*)")
	public CreateLead enterPhoneNumber(String data) {
		type(elephone,data);
		return this;	
	}
	
	
	
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
	private WebElement elecreatelead;
	
	@When("Click on the create lead")
	public ViewLead clickCreatelead() {
		click(elecreatelead);
		ViewLead viewlead=new ViewLead();
		return viewlead;	
	}
  
}

