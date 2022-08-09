package GrowTC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TB 
{
	public WebDriver driver;

	@BeforeMethod
	public void setup()
	{
		  System.setProperty("webdriver.chrome.driver", "./DriversFolder/chromedriver.exe");
		  driver = new ChromeDriver();
		  System.out.println("Browser Opened");
		  driver.manage().window().maximize();
		  System.out.println("Window Get Maximized");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.get("https://groww.in/");
		  System.out.println("Entered URL");
		  String ActualURL = driver.getCurrentUrl();
		  System.out.println(ActualURL);
	}
	
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//		System.out.println("Brower Closed");
//	}

}
