package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import pom.ActitimeHomePage;
import pom.ActitimeLogInPage;


public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
	
	System.setProperty("webdriver.chrome.driver","./drivers2/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
    }
	@BeforeMethod 
	 public void logintoApp()
	 {
		ActitimeLogInPage login = new ActitimeLogInPage(driver);
		login.loginMethod();
		
		ActitimeHomePage report = new ActitimeHomePage(driver);
		report.reportsMethod();
				
	 }

	@BeforeSuite
	public void startExecution()
	{
		Reporter.log("exe started",true);
	}

	@AfterSuite
	public void stopExecution()
	{
		Reporter.log("exe competed",true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	
	
}
