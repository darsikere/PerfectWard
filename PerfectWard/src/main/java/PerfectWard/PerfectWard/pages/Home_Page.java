package PerfectWard.PerfectWard.pages;

import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



import PerfectWard.PerfectWard.Util.TestBase;


public class Home_Page extends TestBase {
	
	public Home_Page() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[contains(text(),'care')]")
    public WebElement HomePageText;
	
	@FindBy(xpath = "//header/div[@id='navbar']/div[1]/div[2]/ul[1]/li[1]/a[1]")
	public WebElement IPLLink;
	
	@FindBy(xpath = "//header/div[@id='navbar']/div[1]/div[2]/ul[1]/li[1]/a[1]")
	public WebElement IPLButton;
	
	@FindBy(xpath = "//header/div[@id='navbar']/div[1]/div[2]/ul[1]/li[2]/a[1]")
	public WebElement FeatureLink;

	@FindBy(xpath = "//header/div[@id='navbar']/div[1]/div[2]/ul[1]/li[3]/a[1]")
	public WebElement OurSolutionLink;

	@FindBy(xpath = "//header/div[@id='navbar']/div[1]/div[2]/ul[1]/li[4]/a[1]")
	public WebElement ResourcesLink;

	@FindBy(xpath = "//header/div[@id='navbar']/div[1]/div[2]/ul[1]/li[5]/a[1]")
	public WebElement ContactLink;
	
	@FindBy(xpath = "//header/div[@id='navbar']/div[1]/div[3]/a[1]")
	public WebElement BookADemoButton;

	

	public boolean HomePageText() {
		System.out.println(" Free up time to care" + HomePageText.getText());
		System.out.println(" Free up time to care displayed = " + HomePageText.isDisplayed());
		return HomePageText.isDisplayed();
	}
	
	public boolean IPLButton() {
		System.out.println(" IPL button " + IPLButton.getText());
		System.out.println(" IPL button is Displayed = " + IPLButton.isDisplayed());
		return IPLButton.isDisplayed();
	}

	public void IPLLink() {
		Assert.assertTrue(IPLLink.isDisplayed());
		IPLLink.click();	
	}

	public boolean BookADemoDisplay() {
		System.out.println(" Book A Demo" + BookADemoButton.getText());
		System.out.println(" Book A Demo displayed = " + BookADemoButton.isDisplayed());
		return BookADemoButton.isDisplayed();
	}

	public boolean BookADemoEnabled() {
		System.out.println(" Book A Demo" + BookADemoButton.getText());
		System.out.println(" Book A Demo Enabled = " + BookADemoButton.isDisplayed());
		return BookADemoButton.isEnabled();
		
	}

	public void FeatureLink() {
		Assert.assertTrue(FeatureLink.isDisplayed());
		FeatureLink.click();
		
	}

	public void OurSolutionLink() {
		Assert.assertTrue(OurSolutionLink.isDisplayed());
		OurSolutionLink.click();
		
	}

	public void ResourcesLink() {
		Assert.assertTrue(ResourcesLink.isDisplayed());
		ResourcesLink.click();
		
	}

	public void ContactLink() {
		Assert.assertTrue(ContactLink.isDisplayed());
		ContactLink.click();
		
	}
	
}
