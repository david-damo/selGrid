package com.ebay.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataCapture {
	//*****************************Home Page **********************************
	@FindBy(xpath="//input[@data-reactid='46']")
	WebElement searchItem;
	@FindBy(xpath="//button[@data-reactid='48']")
	WebElement searchButton;
	@FindBy(xpath="//span[@class='W-gt5y']")
	WebElement searchResult;
	//*****************************End of Home Page ***************************
	//*****************************Login Page *********************************
	@FindBy(xpath="//a[@_sp='m570.l1524']")
	WebElement userLoginLink;
	@FindBy(xpath="//input[@type='text' and @placeholder='Email or username']")
	WebElement userEmail;
	@FindBy(xpath="//input[@type='password' and @placeholder='Password']")
	WebElement userPassword;
	@FindBy(xpath="//span[@id='csi' and @title='Stay signed in']")
	WebElement userInfoUncheck;
	@FindBy(xpath="//input[@id='sgnBt']")
	WebElement userLoginButton;
	@FindBy(xpath="//b[text(),'Sanjeev']")
	WebElement userLoggedIn;
	//*****************************End of Login Page **************************
	
	//*****************************Home Page **********************************	
	public WebElement getSearchItem(){
		return searchItem;
	}
	public WebElement getSearchButton(){
		return searchButton;
	}
	public WebElement getSearchResult(){
		return searchResult;
	}
	//*****************************End of Home Page ***************************
	//*****************************Login Page *********************************
	public WebElement getUserLoginLink(){
		return userLoginLink;
	}
	public WebElement getUserEmail(){
		return userEmail;
	}
	public WebElement getUserPassword(){
		return userPassword;
	}
	public WebElement getUserInfoUncheck(){
		return userInfoUncheck;
	}
	public WebElement getUserLoginButton(){
		return userLoginButton;
	}
	public WebElement getUserLoggedIn(){
		return userLoggedIn;
	}
	//*****************************End of Login Page **************************
	
}
