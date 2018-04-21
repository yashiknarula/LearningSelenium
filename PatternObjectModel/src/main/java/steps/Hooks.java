package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.ProjectMethods;

public class Hooks extends ProjectMethods{
    @Before
	public void runTest() {
    	startResult();
		startTestModule("Create lead", "Creating a lead");
		test = startTestCase("lead");
		test.assignCategory("smoke");
		test.assignAuthor("balaji");
		startApp("chrome");	
	}
		
    @After
	public void after() {
		endResult();
		closeAllBrowsers();
	 }
	
}
