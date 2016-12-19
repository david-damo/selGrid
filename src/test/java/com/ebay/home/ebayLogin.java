package com.ebay.home;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ebayLogin extends AppHomeTest{
	@Test
	public void validLoginCredential() throws InterruptedException{
		cap.getUserLoginLink().click();
		Thread.sleep(15000);
		cap.getUserEmail().sendKeys("cgi.test.mail@gmail.com ");
		cap.getUserPassword().sendKeys("MyNew@Pass1");
		cap.getUserInfoUncheck().click();
		cap.getUserLoginButton().click();
		try{
			Assert.assertEquals(cap.getUserLoggedIn().getText(), "Sanjeev");
		}catch(Exception e){}
	}
	//To DO
	//Test
}
