package PerfectWard.PerfectWard.Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	//Globally declared variables
	public static WebDriver driver;
	public static Properties props;

	public TestBase() throws IOException {
		
		props = new Properties();
    	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
				+ "/src/main/java/PerfectWard.PerfectWard.Config/PerfectWard.properties");
		props.load(fis);

	}

		 public void initialisation(String browser) throws Exception {

	            switch (browser){

	                case "chrome":
	                    System.setProperty("webdriver.chrome.driver","resources/chromedriver");
	                    ChromeOptions options = new ChromeOptions();
	                    driver = new ChromeDriver(options);
	                    break;

	                case "firefox":
	                    System.setProperty("webdriver.gecko.driver","resources/geckodriver");
	                    driver = new FirefoxDriver();
	                    break;

	                default:
	                    throw new Exception("No implementation for Browser: "+browser);
	            }

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // set implicit timeout for @FindBy
		
		driver.get(props.getProperty("url"));
	}
	
}