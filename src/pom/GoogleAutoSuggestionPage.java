package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleAutoSuggestionPage {

	@FindBy(xpath="//input[@name='q']")
	private WebElement searchTextfield;
	
	@FindBy(xpath="//span[contains(text(),'selenium')]")
	private List<WebElement> suggestions;
	
	public GoogleAutoSuggestionPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchMethod() throws InterruptedException {
			searchTextfield.sendKeys("selenium");
			Thread.sleep(5000);
			System.out.println(suggestions.size());
			for (int i = 0; i < suggestions.size(); i++)
			{
				if (suggestions.get(i).getText().equalsIgnoreCase("selenium python"))
				{
					suggestions.get(i).click();
				}
			}
			
				
			}
		

}
