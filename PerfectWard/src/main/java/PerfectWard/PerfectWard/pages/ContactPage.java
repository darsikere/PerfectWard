package PerfectWard.PerfectWard.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import PerfectWard.PerfectWard.Util.TestBase;
import junit.framework.Assert;

public class ContactPage extends TestBase{


	public ContactPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath = "//input[@id='form-input-firstName']")
	public  WebElement firstName;
	
	@FindBy(xpath = "//input[@id='form-input-lastName']")
	public WebElement lastname;
	
	@FindBy(xpath = "//input[@name='email']")
	public WebElement email;
	
	@FindBy(xpath = "//input[@id='form-input-telephone']")
	public WebElement telephone;
	
	@FindBy(xpath = "//select[@id='form-input-roles']")
	public WebElement role;
	

	@FindBy(xpath = "//select[@id='form-input-sectors']")
	public WebElement sector;
	
	@FindBy(xpath = "//input[@id='form-input-companyName']")
	public WebElement organiation;
	
	@FindBy(xpath = "//select[@id='form-input-referralChannel']")
	public WebElement howDidYouHearAboutUs;
	
	@FindBy(xpath = "//*[@id='form-input-gdpr']")
	public WebElement PrivacyAndTermsLink;
	
	@FindBy(xpath = "//*[@id='General Enquiry']/div[9]/div/button")
	public WebElement SubmitButton;
	
	@FindBy(xpath = "//*[@id='General Enquiry']/div[8]/div/ul/li")
	public WebElement MessageError;
	
	@FindBy(xpath = "//*[@id='General Enquiry']/div[8]/div/ul/li")
	public WebElement ValidateMessageErrorText;


	public void ContactDetials(String FirstName, String LastName, String Email, String Telephone, String Role,
			String Sector, String Organiation, String HowDidYouHearAboutUs) {
		// TODO Auto-generated method stub
		firstName.sendKeys(FirstName);
		lastname.sendKeys(LastName);
		email.sendKeys(Email);
		role.sendKeys(Role);
		telephone.sendKeys(Telephone);
		sector.sendKeys(Sector);
		organiation.sendKeys(Organiation);
		howDidYouHearAboutUs.sendKeys(HowDidYouHearAboutUs);
	}
	

	public void PrivacyAndTermsLink() {
		// TODO Auto-generated method stub
		PrivacyAndTermsLink.click();
	}


	public void SubmitButton() {
		// TODO Auto-generated method stub
		SubmitButton.click();
	}


	public boolean MessageError() {
		// TODO Auto-generated method stub
		System.out.println(" This field is required" + MessageError.getText());
		System.out.println(" This field is required is displayed = " + MessageError.isDisplayed());
		return MessageError.isDisplayed();
		
	}
	
	public boolean ValidateMessageErrorText() {
		// TODO Auto-generated method stub
		Assert.assertEquals(MessageError.getText(), props.getProperty("This field is required"));
		return true;
		
	}
}