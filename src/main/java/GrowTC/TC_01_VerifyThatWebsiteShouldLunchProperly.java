package GrowTC;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_01_VerifyThatWebsiteShouldLunchProperly extends TB
{
	@Test
	public void verifyThatWebsiteShouldLunchProperly()
	{
		String ExpectURL = "https://groww.in/";
		String ActualURL = driver.getCurrentUrl();
		
		Assert.assertEquals(ActualURL , ExpectURL);
		
	}

}
