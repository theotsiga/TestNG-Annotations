package pom;

import org.apache.xalan.trace.EndSelectionEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ActitimeTypesOfWorkPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsLink;
	
	@FindBy(xpath="//a[contains(text(),'Types of Work')]")
	private WebElement typesofworkLink;
	
	@FindBy(xpath="//span[contains(text(),'Create Type of Work')]")
	private WebElement createtypeofworkLink;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement employeenameTextfield;
	
	
	@FindBy(xpath="//body/div/table/tbody/tr/td/table/tbody/tr/td/form/table/tbody/tr/td/input[1]")
	private WebElement submitbuttonLink;
	
	@FindBy(xpath="//a[contains(text(),'Theo')]/../../.")
	private WebElement deleteuserLink;
	
	
	public  ActitimeTypesOfWorkPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void settingslinkMethod() 
	{
		
		settingsLink.click();
	}
	@Test(dependsOnMethods = "settingslinkMethod")
	public void typesofworkLinkMethod()
	{
		typesofworkLink.click();
	}
	
	public void createtypeofworkLinkMethod() 
	{
		createtypeofworkLink.click();
	}
	
	public void employeenameTextfieldMethod() 
	{
		employeenameTextfield.sendKeys("Theo");
	}
	
	public void submitbuttonLinkMethod() 
	{
		submitbuttonLink.click();
	}
	
	public void deleteuserLinkMethod()
	{
		deleteuserLink.click();
	}
	
	
	
	
	
}