package GrowPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOpoUpPOM 
{
	public WebDriver driver;
	Actions act;
	
	public LoginOpoUpPOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}
	
	@FindBy(xpath = "//input[@id='login_email1']")
	WebElement EmailEnter;
	public void EmailEnter()
	{
		EmailEnter.sendKeys("dudhyalnaveen7@gmail.com");
	}

	@FindBy (xpath = "(//span[@class='absolute-center'])[1]")
	WebElement ClickContinue;
	public void ClickContinue()
	{
		act.click(ClickContinue).perform();
	}
	
	@FindBy(xpath = "//input[@id='login_password1']")
	WebElement PasswordEnter;
	public void PasswordEnter()
	{
		PasswordEnter.sendKeys("Danceismylife7");
	}
	
	@FindBy(xpath = "//span[text()='Submit']")
	WebElement ClickSubmit;
	public void ClickSubmit()
	{
		act.click(ClickContinue).perform();
	}
	
	@FindBy(xpath = "//html/body/div/div/div[1]/div[1]/div[1]/div[2]/div/div/div/div[4]/div/div[1]/input")
	WebElement PIN1;
	public void PIN1()
	{
		PIN1.sendKeys("1");
	}
	
	@FindBy(xpath = "/html/body/div/div/div[1]/div[1]/div[1]/div[2]/div/div/div/div[4]/div/div[2]/input")
	WebElement PIN2;
	public void PIN2()
	{
		PIN2.sendKeys("9");
	}
	
	@FindBy(xpath = "/html/body/div/div/div[1]/div[1]/div[1]/div[2]/div/div/div/div[4]/div/div[3]/input")
	WebElement PIN3;
	public void PIN3()
	{
		PIN3.sendKeys("9");
	}
	
	@FindBy(xpath = "/html/body/div/div/div[1]/div[1]/div[1]/div[2]/div/div/div/div[4]/div/div[4]/input")
	WebElement PIN4;
	public void PIN4()
	{
		PIN4.sendKeys("7");
	}

}
