package com.ebay.home;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ebayLogin extends AppHomeTest{
	@Test
	public void validLoginCredential() throws InterruptedException{
		cap.getUserLoginLink().click();
		Thread.sleep(15000);
		cap.getUserEmail().sendKeys("XXXXXXX");
		cap.getUserPassword().sendKeys("XXXXX");
		cap.getUserInfoUncheck().click();
		cap.getUserLoginButton().click();
		try{
			Assert.assertEquals(cap.getUserLoggedIn().getText(), "Sanjeev");
		}catch(Exception e){}
	}

}
