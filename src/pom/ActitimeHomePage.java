package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage {

	//declaration
	@FindBy(xpath="//div[@id='container_tt']")
	private WebElement timetrackLink;
	
	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement taskLink;
	
	@FindBy(id="container_reports")
	private WebElement reportsLink;
	
	@FindBy(id="//div[@id='container_users']")
	private WebElement usersLink;
	
	@FindBy(xpath="//div[contains(@class,'popup_menu_button popup_menu_button_calendar')]"
			+ "//div[contains(@class,'popup_menu_icon')]//div[contains(@class,'menu_icon')]")
	private WebElement calenderslink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[3])")
	private WebElement intergrationlink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[4])")
	private WebElement helpandsupportLink;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	//initialisation
	public ActitimeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilisation
	public void timetrackMethod() {
		timetrackLink.click();
	}
	public void taskMethod() {
		taskLink.click();
	}
	public void reportsMethod() {
		reportsLink.click();
	}

	 public void usersMethod() {
		usersLink.click();
	}
	 public void calendersMethod() {
		calenderslink.click();
	}
	 public void settingsMethod() {
		settingsLink.click();
	}
	 public void intergrationMethod() {
		intergrationlink.click();
	 }
		
	 public void helpandsupportMethod() {
		helpandsupportLink.click();
	}
	
	 public void logoutMethod() {
			logoutLink.click();
		}

	
	}

	

