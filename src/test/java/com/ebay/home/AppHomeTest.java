package com.ebay.home;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class AppHomeTest {
	DataCapture cap=new DataCapture();
    public void launchBrowser(){
    	cap=PageFactory.initElements(AppBrowser.browserSetup(), DataCapture.class);
    }
    @Test
    public void firstTest(){
    	launchBrowser();
    }
}
