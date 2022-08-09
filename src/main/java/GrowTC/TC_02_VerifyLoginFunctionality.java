package GrowTC;

import org.testng.annotations.Test;

import GrowPOM.LoginOpoUpPOM;
import GrowPOM.MainPagePOM;

public class TC_02_VerifyLoginFunctionality extends TB
{
	@Test
	public void verifyLoginFunctionality()
	{
		MainPagePOM mp = new MainPagePOM(driver);
		mp.ClickOnLogin();
		
		LoginOpoUpPOM lpPoP = new LoginOpoUpPOM(driver);
		lpPoP.EmailEnter();
		System.out.println("EmailEntered");
		lpPoP.ClickContinue();
		System.out.println("ClickOnContinue");
		lpPoP.PasswordEnter();
		System.out.println("PasswordEntered");
		lpPoP.ClickSubmit();
		System.out.println("ClickOnSubmit");
		lpPoP.PIN1();
		lpPoP.PIN2();
		lpPoP.PIN3();
		lpPoP.PIN4();
		System.out.println("EnteredPIN");
			
	}

}
