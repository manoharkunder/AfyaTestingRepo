package com.niveus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CloseCode {

	@FindBy(xpath = "//span[text()='Consultation Complete']")

	private WebElement closecomplete;

	public WebElement getCloseComplete() {
		return closecomplete;
	}

	@FindBy(xpath = "//span[text()='In-Person Visit']")

	private WebElement closeinperson;

	public WebElement getCloseInPerson() {
		return closeinperson;
	}

	@FindBy(xpath = "//span[text()='Video Visit']")

	private WebElement closevideo;

	public WebElement getCloseVideo()
	{
		
		return closevideo;
	}

	@FindBy(xpath = "//span[text()='Limited Access']/following-sibling::span[text()='Patient can only view chats']/ancestor::div[@class='middle list-sort-demo-text']")

	private WebElement limited;

	public WebElement getLimitAcces() {
		return limited;
	}

	@FindBy(xpath = "//span[text()='Full Access']/following-sibling::span[text()='Patient can submit chats']/ancestor::div[@class='middle list-sort-demo-text']")

	private WebElement fullaccess;

	public WebElement getFullAccess() {
		return fullaccess;
	}

	@FindBy(xpath = "//span[text()='No Access']/following-sibling::span[text()='Patient receives status updates']/ancestor::div[@class='middle list-sort-demo-text']")

	private WebElement noAccess;

	public WebElement getNoAccess() {
		return noAccess;
	}
	
	@FindBy(xpath="//div[@class='pop_content']/div")
	private WebElement specilaity;
	
	public WebElement getSpeciality()
	{
		return specilaity;
	}
	@FindBy(xpath="//span[contains(text(),'consultation as Complete')]")
	private WebElement conscomplete;
	public WebElement getConsultcomplete()
	{
		return conscomplete;
	}
	@FindBy(xpath="//span[contains(text(),'consultation as recommending an In Person Visit')]")
	private WebElement inperson;
	
	public WebElement getInPerson()
	{
		return inperson;
	}
	@FindBy(xpath="//span[contains(text(),'consultation as recommending a Video Visit')]")
	private WebElement  videovisit;
	
	public WebElement getVideovisit()
	{
		return videovisit;
	}
	@FindBy(xpath="//span[text()='No Access']")
	private WebElement no;
	
	public WebElement getPArticipantNo()
	{
		return no;
	}
	@FindBy(xpath="//span[text()='Limited Access']")
    private WebElement  access;
	
	public WebElement getPArticipantLimit()
	{
		return access;
	}
	@FindBy(xpath="//span[text()='Full Access']")
	private WebElement full;
	
	public WebElement getParticipantFull()
	{
		return full;
	}
	
}

