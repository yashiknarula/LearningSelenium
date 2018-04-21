
package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MergeFindleadPage extends ProjectMethods{
	
	public MergeFindleadPage() {		
		PageFactory.initElements(driver,this);
	}
	////input[@class=' x-form-text x-form-field ']
	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[1]")
	private WebElement eleleadId;
	@And("Enter merge lead id as(.*)")
	public MergeFindleadPage enterMergeleadId(String data) {
		type(eleleadId,data);
		return this;
	}
	
 
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement elefindleadbutton;
	@And("click on merge page find lead button")
	public MergeFindleadPage clickMergeFindLeadButton() {
		click(elefindleadbutton);
		return this;
	}
    
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleFirstID;
	@And("click on merge page first lead id")
	public MergeLeadsPage clickMergeFirstId() {
		click(eleFirstID);
		switchToWindow(0);
		MergeLeadsPage mrlead=new MergeLeadsPage();
		return mrlead;
	}
	
	
}
