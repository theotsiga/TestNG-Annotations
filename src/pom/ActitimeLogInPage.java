package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLogInPage {

	//Declaration
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepmeloggedinCheckbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[contains(.,'Forgot your password?')]")
	private WebElement forgotyourpasswordLink;
	
	@FindBy(xpath="//a[contains(text(),'actiTIME Inc.')]")
	private WebElement actitimeinclink;
	
	//initialisation
	
	public ActitimeLogInPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilisation
	
	public void loginMethod() {
	usernameTextfield.sendKeys("admin");
	passwordTextfield.sendKeys("manager");
	keepmeloggedinCheckbox.click();
	loginButton.click();
	}
	
	public void forgotpasswordMethod() {
		forgotyourpasswordLink.click();
	}
	
	public void actitimeinclinkMethod() {
		actitimeinclink.click();
	}
	
}
