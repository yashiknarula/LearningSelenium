package pages;

//import org.bson.util.AbstractCopyOnWriteMap.View;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods {

	public MergeLeadsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "(//img[@alt='Lookup'])[1]")
	private WebElement elefromlead;
	@And("click on from lead image")
	public MergeFindleadPage clickFromLeadImg() {
		click(elefromlead);
		switchToWindow(1);
		MergeFindleadPage mflead = new MergeFindleadPage();
		return mflead;	
	}
	
	@FindBy(how = How.XPATH, using = "(//img[@alt='Lookup'])[2]")
	private WebElement eletolead;
	@And("click on to lead image")
	public MergeFindleadPage clickToLeadImg() {
		click(eletolead);
		switchToWindow(1);
		MergeFindleadPage mflead = new MergeFindleadPage();
		return mflead; 
	} 
 //Merge
	@FindBy(how = How.XPATH, using = "//a[text()='Merge']")
	private WebElement elemergelead;
	public ViewLead clickMergeleadButton() {
		clickWithNoSnap(elemergelead);
		acceptAlert();
		ViewLead viewlead = new ViewLead();
		return viewlead;
	}
}
