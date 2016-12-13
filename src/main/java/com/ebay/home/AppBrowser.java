package com.ebay.home;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AppBrowser {
	static RemoteWebDriver driver=null;
	static DesiredCapabilities dataCap=null;
	static AppProp configurations=new AppProp();
	public static RemoteWebDriver browserSetup(){
		dataCap=DesiredCapabilities.firefox();
		dataCap.setBrowserName("FireFox");
		driver=new FirefoxDriver(dataCap);
		driver.get(configurations.prop.getProperty("hostUrl"));
		return driver;
	}
}
