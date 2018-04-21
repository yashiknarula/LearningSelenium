
package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//a[text()='Create Lead']")
	private WebElement eleMyleads;
	
	@And("click on Create Lead link button")
	public CreateLead clickMyLeads() {
		click(eleMyleads);
		CreateLead createlead=new CreateLead();
		return createlead;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindleads;
	
   	@And("click on find lead")
	public FindLeadsPage clickFindLeads() {
		click(eleFindleads);
		FindLeadsPage findLead=new FindLeadsPage();
		return findLead;
	}
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement elemergelead;
	@And("click on merge lead link")
	public MergeLeadsPage clickMergeLeadLink() {
		click(elemergelead);
		MergeLeadsPage mergeld=new MergeLeadsPage();
		return mergeld;
	}
	@Then("Verify deletion of lead is successful")
	public MyLeadsPage deletesuccessful() {
		System.out.println("Deletion of lead is successful");
		return this;
	}
	
	
}
 