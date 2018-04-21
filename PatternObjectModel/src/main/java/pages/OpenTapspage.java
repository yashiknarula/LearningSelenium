package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class OpenTapspage extends ProjectMethods{
	
	public OpenTapspage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement elecmpnyname;
	@And("Edit the company name as(.*)")
	public OpenTapspage editcmpnyname(String data) {
		type(elecmpnyname,data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//input[@class='smallSubmit'])[1]")
	private WebElement eleupdate;
	@When("click on the update button")
	public ViewLead clickUpdatebutton() {
		click(eleupdate);
		ViewLead viewlead=new ViewLead();
		return viewlead;
	}
	
	
}
