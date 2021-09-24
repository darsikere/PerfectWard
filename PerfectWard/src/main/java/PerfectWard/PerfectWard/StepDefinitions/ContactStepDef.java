package PerfectWard.PerfectWard.StepDefinitions;

import java.io.IOException;
import PerfectWard.PerfectWard.pages.ContactPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;

public class ContactStepDef extends PerfectWard.PerfectWard.Util.TestBase{

	public ContactStepDef() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	ContactPage  contactPage;
	
	@Before		//hooks
	public void setup() throws Exception {
		initialisation(null);
	}
	
	@After
	public void tearDown() {
		driver.quit(); 
	}	
	
	@Then("^I fill in the Contact details with \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_fill_in_the_Contact_details_with(String FirstName, String LastName, String Email, String Telephone, String Role, String Sector, String Organiation, String HowDidYouHearAboutUs) throws Throwable {
		
		contactPage = new ContactPage();				
		contactPage.ContactDetials(FirstName, LastName, Email, Telephone, Role, Sector, Organiation, HowDidYouHearAboutUs);
   
	}

	@Then("^I click on agree for Privacy and terms$")
	public void i_click_on_agree_for_Privacy_and_terms() throws Throwable {
		contactPage = new ContactPage();
		contactPage.PrivacyAndTermsLink();
	}

	@Then("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
		contactPage = new ContactPage();
		contactPage.SubmitButton();
	}

	@Then("^Validate the error for message$")
	public void validate_the_error_for_message() throws Throwable {
		contactPage = new ContactPage();
		contactPage.MessageError();
		contactPage.ValidateMessageErrorText();
	}


}
