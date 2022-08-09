package GrowPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPagePOM 
{
	public WebDriver driver;
	public Actions act;
	public MainPagePOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}
	
	@FindBy(xpath = "//span[text()='Login/Register']")
	WebElement ClickOnLogin;
	public void ClickOnLogin()
	{
		 act.click(ClickOnLogin).perform();
	}
	
	
	
}
