package com.niveus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Carddetails {


	@FindBy(id="card")
	private WebElement cardno;
	
	@FindBy(xpath="//input[@id='card' and contains(@placeholder,'Card holder')]")
	private WebElement holdername;
	
	@FindBy(id="cardmonth")
	private WebElement cardmon;
	
	@FindBy(id="cardyear")
	private WebElement cardyer;
	
	@FindBy(id="cardccv")
   private WebElement cvv;
	
	@FindBy(xpath="//span[text()='Register']")
	private WebElement regstr;
	
	@FindBy(xpath="//span[text()='Previous']")
	
	private WebElement preveous;
	
	public WebElement register()
	{
		return  regstr;
		
	}
	
	public void  cardDetails(String cardnumber,String name,String month,String cvvno,String year)
	{
		cardno.sendKeys(cardnumber);
		holdername.sendKeys(name);
		cardmon.sendKeys(month);
		cardyer.sendKeys(year);
		cvv.sendKeys(cvvno);
		register().click();
			
		
	}

	

}
