package com.niveus;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {
	WebDriver driver;
	Utility ut = new Utility();

	@FindBy(xpath = "//div[@class='drp ant-dropdown-trigger']")
	private WebElement proflehover;

	public WebElement getProfilehov() {
		return proflehover;
	}

	@FindBy(xpath = "//li[text()='sign out']")
	private WebElement sigout;

	public WebElement getSignOut()

	{
		return sigout;
	}

	@FindBy(id = "first_name")
	private WebElement fname;

	public WebElement getFname()

	{
		return fname;
	}

	@FindBy(id = "last_name")
	private WebElement lname;

	public WebElement getLastname() {
		return lname;
	}

	@FindBy(id = "dob")
	private WebElement dobid;

	public WebElement getDobirth() {
		return dobid;
	}

	@FindBy(xpath = "//div[@class='ant-select-selector']")
	private WebElement gnder;

	public WebElement getGender() {
		return gnder;
	}

	@FindBy(xpath = "//div[text()='Male']")
	private WebElement genmale;

	public WebElement getGenMale() {
		return genmale;
	}

	@FindBy(xpath = "//div[text()='Female']")
	private WebElement genFemale;

	public WebElement getFemale() {
		return genFemale;
	}

	@FindBy(xpath = "//div[text()='Choose not to specify']")
	private WebElement notspecify;

	public WebElement getGenNotspecify() {
		return notspecify;
	}

	@FindBy(xpath = "//input[@placeholder='Phone number']")
	private WebElement phono;

	public WebElement getPhoneNO() {
		return phono;
	}

	@FindBy(xpath = "//textarea[@id='bio']")
	private WebElement bio;

	public WebElement getBioData() {
		return bio;
	}

	@FindBy(xpath = "//button[@type='submit' and text()='Update Information']")
	private WebElement updatebtn;

	public WebElement getUpdatebtn() {
		return updatebtn;
	}

	@FindBy(xpath = "//div[@class='avatar___KHRKi']")
	private WebElement profile;

	public WebElement getProfileImage() {
		return profile;
	}

	@FindBy(xpath = "//span[text()='Uploading in progress..']")
	private WebElement updateinfo;

	public WebElement getUpdateInfo() {
		return updateinfo;
	}

	@FindBy(xpath = "//span[contains(text(),'@')]")
	private WebElement mail;

	public WebElement getmailId() {
		return mail;
	}
    @FindBy(xpath="//span[text()='information successfully Updated']")
    
    private WebElement updateprofile;
    
    public WebElement getUpdateinformtion()
    {
    	return updateprofile;
    }
	
    public void updateProfile(String firstname, String lastName, String dateofbirth, String gender, String biodata)
			throws Exception {



		fname.sendKeys(firstname);

		
		lname.sendKeys(lastName);

		dobid.sendKeys(dateofbirth, Keys.ENTER);
		gnder.click();
		
		Thread.sleep(4000);

		if (gender.equals("Male")) {
			genmale.click();
		} else if (gender.equals("Female")) {
			genFemale.click();
		} else {
			notspecify.click();
		}
		Thread.sleep(4000);

	    bio.sendKeys(biodata);

	}

}
