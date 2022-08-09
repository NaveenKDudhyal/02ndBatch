package GrowPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOM 
{
	public WebDriver driver;
	Actions act ;
	public HomePagePOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}
	
	@FindBy(xpath = "/html/body/div/div/"
			+ "div[1]/div/div[2]/div/div[2]/div/"
			+ "div[1]/div[2]/div/div/div[1]/div"
			+ "[1]/div/input")
	WebElement SearchTab;
	public void SearchTab()
	{
		SearchTab.sendKeys("Zamato");
	}
	
	@FindBy(xpath = "//span[text()='Zomato Ltd.']")
	WebElement ZomatoLTD;
	public void ZomatoLTD()
	{
		ZomatoLTD.click();
	}
	
}
