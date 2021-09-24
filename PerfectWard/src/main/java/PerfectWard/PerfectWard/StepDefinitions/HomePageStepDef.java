package PerfectWard.PerfectWard.StepDefinitions;

import java.io.IOException;
import PerfectWard.PerfectWard.pages.Home_Page;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageStepDef extends PerfectWard.PerfectWard.Util.TestBase {
	
	public HomePageStepDef() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	Home_Page homepage;
	
	@Before		//hooks
	public void setup() throws Exception {
		initialisation(null);
	}
	
	@After
	public void tearDown() {
		driver.quit(); 
	}	
	
	
	@Given("^I am on the Home Page, I should see Free up time to care$")
	public void i_am_on_the_Home_Page_I_should_see_Free_up_time_to_care() throws InterruptedException, IOException {
		homepage = new Home_Page();
		homepage.HomePageText();
		homepage.BookADemoDisplay();
		homepage.BookADemoEnabled();
	
	}
	
	@Then("^Validate IPC is displayed in navigation bar$")
    public void Validate_IPC_is_displayed_in_navigation_bar() throws InterruptedException, IOException {
    	homepage = new Home_Page();
    	homepage.IPLButton();
    }
	
	@Then("^Click on IPC section in header$")
	public void click_on_IPC_section_in_header() throws Throwable {
		homepage = new Home_Page();
    	homepage.IPLLink();
    	homepage.BookADemoDisplay();
		homepage.BookADemoEnabled();
	}

	@Then("^Validate Book a Demo button is displayed$")
	public void validate_Book_a_Demo_button_is_displayed() throws Throwable {
		homepage = new Home_Page();
    	homepage.BookADemoDisplay();
	}

	@Then("^Validate Book a Demo button is enabled$")
	public void validate_Book_a_Demo_button_is_enabled() throws Throwable {
		homepage = new Home_Page();
    	homepage.BookADemoEnabled();
	}

	@Then("^Click on Features section in header$")
	public void click_on_Features_section_in_header() throws Throwable {
		homepage = new Home_Page();
    	homepage.FeatureLink();
    	homepage.BookADemoDisplay();
		homepage.BookADemoEnabled();
	}

	@Then("^Click on Our Solution section in header$")
	public void click_on_Our_Solution_section_in_header() throws Throwable {
		homepage = new Home_Page();
    	homepage.OurSolutionLink();
    	homepage.BookADemoDisplay();
		homepage.BookADemoEnabled();
	}

	@Then("^Click on Resources section in header$")
	public void click_on_Resources_section_in_header() throws Throwable {
		homepage = new Home_Page();
    	homepage.ResourcesLink();
    	homepage.BookADemoDisplay();
		homepage.BookADemoEnabled();
	}

	@Then("^Click on Contact section in header$")
	public void click_on_Contact_section_in_header() throws Throwable {
		homepage = new Home_Page();
    	homepage.ContactLink();
    	homepage.BookADemoDisplay();
		homepage.BookADemoEnabled();
	}

}