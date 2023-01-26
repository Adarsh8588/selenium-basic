package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPage 
{
	//declaration
	@FindBy(xpath = "//input[@id='username']")
	private WebElement usernameTB;
	
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement passwordTB;
	
	@FindBy(xpath = "//a[@id='loginButton']")
	private WebElement loginbutton;
	 
	//Initialization
	//create a constructor
	public ActiTimeLoginPage(WebDriver driver) 
	{
		 PageFactory.initElements(driver,this); //in it element initialize the new address so we can avoid stale element exception

	}
	//utilization
	public WebElement getUsernameTB() {
		return usernameTB;
	}
	
	public WebElement getPasswordTB() {
		return passwordTB;
	}


	public WebElement getLoginbutton() {
		return loginbutton;
	}


	//business library
	public void actiTimeLogin(String username, String password)
	{
		usernameTB.sendKeys(username);
		passwordTB.sendKeys(password);
		loginbutton.click();	
	}	
}
