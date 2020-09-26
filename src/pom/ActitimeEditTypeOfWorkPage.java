package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeEditTypeOfWorkPage {

	public WebDriver driver;

	@FindBy(xpath="//a[.='Theo TsigaTheo']")
	private WebElement worknameLink;
	
	
	@FindBy(xpath="//body/div[@id='container']/table/tbody/tr/td/table/tbody/tr/td/div/div/"
			+ "table/tbody/tr/td/table/tbody/tr/td/input[1]")
	private WebElement deletetypeofworkbuttonLink;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement edittypeofworkTextfield;
	
	@FindBy(xpath="//body/div/table/tbody/tr/td/table/tbody/tr/td/form/table/tbody/tr/td/input[1]")
	private WebElement savechangesbuttonLink;
	
	public ActitimeEditTypeOfWorkPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void typeofworknameLinkMethod() 
	{
		worknameLink.click();
	}
	
	public void deletetypeofworkbuttonLinkMethod() 
	{
		deletetypeofworkbuttonLink.click();
	}
	
	public void edittypeofworkTextfieldMethod()
	{
		for (int i = 0; i < 13; i++) 
		{
			edittypeofworkTextfield.sendKeys(Keys.RIGHT);
			edittypeofworkTextfield.sendKeys(Keys.BACK_SPACE);
		}
		//edittypeofworkTextfield.sendKeys("Baseline");
	}
	
	public void savechangesbuttonLinkMethod() 
	{
		savechangesbuttonLink.click();
	}
	
}
