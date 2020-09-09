package com.niveus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterSection {
	@FindBy(xpath="//span[@aria-label='filter']")
	private WebElement filter;
	
	public WebElement getFilter()
	{
		return filter;
	}
	
	@FindBy(xpath="//li[text()='All Chats']")
    private WebElement alchat;
	
	public WebElement getAllchat()
	{
		return alchat;
	}
	
	@FindBy(xpath="//li[text()='Unresponded Chats']")
    private WebElement unresponded;
	
	public WebElement getUnrespond()
	{
		return unresponded;
	}
	
	@FindBy(xpath="//li[text()='Unread Chats']")
    private WebElement unread;
	
	public WebElement getUnread()
	{
		return unread;
	}
	
	@FindBy(xpath="//li[text()='Closed Chats']")
    private WebElement close;
	
	public WebElement getClose()
	{
		return close;
	}
	
	@FindBy(xpath="//li[text()='Live Chats']")
    private WebElement live;
	
	public WebElement getLivechat()
	{
		return unresponded;
	}
	
	@FindBy(xpath="//span[@aria-label='sort-ascending']")
	private WebElement sort;
	
	public  WebElement getSorting()
	{
		return sort;
	}
	
	@FindBy(xpath="//li[text()='Newest']")
     private WebElement newest;
	
      public WebElement getNewest()
      {
    	  return newest;
      }
      
      @FindBy(xpath="//li[text()='Oldest']")
      private WebElement oldest;
 	
       public WebElement getOldest()
       {
     	  return oldest;
       }
       
       @FindBy(xpath="//span[contains(text(),'old')]")
       private WebElement timestamp;

       public  WebElement getTimeStamp()
       {
    	   return timestamp;
       }
}
