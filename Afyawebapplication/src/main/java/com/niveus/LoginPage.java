package com.niveus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	@FindBy(id="userName")
	private WebElement username;

	@FindBy(id="password")
	private WebElement pwd;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement logbtn;

	@FindBy(xpath="//span[text()='auto log-in']/preceding-sibling::span//input")
	private WebElement autolog;

	@FindBy(xpath="//span[@role='img' and contains(@class,'password-icon')]")
	private WebElement pwdview;

	@FindBy(xpath="//a[text()='Register account']")
	private WebElement register;

	@FindBy(xpath="//span[text()='User status is changed to Active']")
	private WebElement statusChange;

	@FindBy(xpath="//div[text()='Login']")
	private WebElement logpage;

	public WebElement getlogPage()
	{	
		return logpage;
	}

	public WebElement getStatusChange()
	{
		return statusChange;
	}

	public WebElement getregisteration()
	{
		return register;
	}

	public WebElement getpswdview()
	{
		return pwdview;
	}
	public WebElement getautolog()
	{
		return autolog;
	}
	public WebElement getUsername()
	{
		return username;
	}
	public WebElement getpassword()
	{
		return pwd;
	}
	public WebElement getloginbtn()
	{
		return logbtn;
	}

	@FindBy(xpath="//span[contains(text(),'User status is changed to')]")
	private WebElement statuschange;

	public WebElement getUpdateChange()
	{
		return statuschange;
	}

	@FindBy(xpath="//span[text()='Documents successfully uploaded']")
	private WebElement sucess;

	public WebElement getSucess()
	{
		return sucess;
	}
	public void login(String email,String password)
	{
		username.sendKeys(email);
		pwd.sendKeys(password);
		pwdview.click();
		logbtn.click();
	}
}
