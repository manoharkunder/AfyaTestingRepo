package com.niveus;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest extends Base{
	public LoginPage logp;
	public Registeration registerp;
	public Carddetails card;
	FileLib flib = new FileLib();
	public ProfilePage propage;

	@Test()
	public void loginPageTest() {

		logp = PageFactory.initElements(driver, LoginPage.class);
		card = PageFactory.initElements(driver, Carddetails.class);
		propage = PageFactory.initElements(driver, ProfilePage.class);

		Assert.assertEquals(logp.getloginbtn().getText(), "Login");
		Reporter.log("Login page is sucessfully displayed", true);
	
		driver.navigate().refresh();
		
		WebDriverWait wait = new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions.elementToBeClickable(logp.getUsername()));
		logp.getUsername().sendKeys("alvin@wise.healthcare");
		logp.getpassword().sendKeys("Aa123456@");
		logp.getpswdview().click();
		logp.getloginbtn().click();

		WebDriverWait wait1 = new WebDriverWait(driver, 90);
		wait1.until(ExpectedConditions.visibilityOf(propage.getmailId()));

		Assert.assertEquals(propage.getmailId().getText(), "alvin@wise.healthcare");
		Reporter.log("sucessfully loged in and Home page is displayed", true);
	}

}
