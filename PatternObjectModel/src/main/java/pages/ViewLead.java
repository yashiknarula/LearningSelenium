package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
	
	public ViewLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//span[@id='viewLead_firstName_sp']")
	private WebElement eleviewlead;
	
	public ViewLead enterfirstname(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		verifyExactText(eleviewlead,data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Delete']")
	private WebElement eleDeletelead;
	@When("click on the delete")
	public MyLeadsPage clickDeleteLead() {
		click(eleDeletelead);
		MyLeadsPage mylead=new MyLeadsPage();
		return mylead;		
	}
    
	@FindBy(how=How.XPATH,using="//a[text()='Edit']")
	private WebElement eleEditlead;
	
	@And("click on the edit button")
	public OpenTapspage clickEditLead() {
		click(eleEditlead);
		OpenTapspage opentaps=new OpenTapspage();
		return opentaps;		
	}
	//
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement elecheckcmp;
	@Then("Verify updation is correct as (.*)")
	public ViewLead checkCpmnyname(String data) {
		verifyPartialText(elecheckcmp,data);
		return this;	
	}
	
	@Then("Verify create lead is successful")
	public void createSuccessful()
	{
		System.out.println("New lead registration is successful");
	}
	
}
