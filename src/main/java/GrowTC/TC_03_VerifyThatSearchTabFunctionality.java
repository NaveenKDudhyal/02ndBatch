package GrowTC;

import org.testng.annotations.Test;

import GrowPOM.HomePagePOM;
import GrowPOM.LoginOpoUpPOM;
import GrowPOM.MainPagePOM;

public class TC_03_VerifyThatSearchTabFunctionality extends TB
{
	@Test 
	public void verifyThatSearchTabFunctionality()
	{
		MainPagePOM mp = new MainPagePOM(driver);
		mp.ClickOnLogin();
		
		LoginOpoUpPOM lppop = new LoginOpoUpPOM(driver);
		lppop.EmailEnter();
		System.out.println("EmailEnter");
		lppop.ClickContinue();
		System.out.println("ClickContinue");
		lppop.PasswordEnter();
		System.out.println("PaawordEnter");
		lppop.ClickSubmit();
		System.out.println("ClickSubmit");
		lppop.PIN1();
		lppop.PIN2();
		lppop.PIN3();
		lppop.PIN4();
		System.out.println("EnterPIN");
		
		HomePagePOM hp = new HomePagePOM(driver);
		hp.SearchTab();
		hp.ZomatoLTD();
		
	}

}
