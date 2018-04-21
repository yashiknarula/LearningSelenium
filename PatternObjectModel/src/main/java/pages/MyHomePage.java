package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{
	
	public MyHomePage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//a[text()='Leads']")
	private WebElement eleMyLeads;
	 
	@And("Click on the Lead tab")
	public MyLeadsPage clickLeads() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleMyLeads);
		MyLeadsPage myLp=new MyLeadsPage();
		return myLp;	
	}
	

}
