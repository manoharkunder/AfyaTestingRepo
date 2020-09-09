package com.niveus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registeration {

	@FindBy(id = "firstName")
	private WebElement fnme;

	public WebElement getFname() {
		return fnme;
	}

	@FindBy(id = "middleName")
	private WebElement mnme;

	public WebElement getMname() {
		return mnme;
	}

	@FindBy(id = "lastName")
	private WebElement lnme;

	public WebElement getLaname() {
		return lnme;
	}

	@FindBy(id = "dob")
	private WebElement dob;

	public WebElement getdob() {
		return dob;
	}

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement nxt1;

	public WebElement getnext1() {
		return nxt1;
	}

	@FindBy(xpath="//input[@id='gender']")
	private WebElement gen;

	public WebElement getgender() 
	{
		return gen;
	}
		
	@FindBy(xpath="//div[text()='Male']")
	private WebElement mle;
	
	public WebElement getGenmale()
	{
		return  mle;
	}
	
	@FindBy(id = "email")
	private WebElement email;

	public WebElement getMail() {
		return email;
	}

	@FindBy(id = "password")
	private WebElement pwd;

	public WebElement getpassword() {
		return pwd;
	}

	@FindBy(id = "confirm")
	private WebElement cpwd;

	public WebElement getcpwd() {
		return cpwd;
	}

	@FindBy(xpath = "//button[@type='submit']/span[text()='Next']")
	private WebElement nbut2;

	public WebElement getnxt2() {
		return nbut2;
	}

	@FindBy(xpath = "//button[@type='submit']/span[text()='Previous']")
	private WebElement prebtn1;

	public WebElement getPrebtn1() {
		return prebtn1;
	}

	@FindBy(xpath = "//input[@id='password']/following-sibling::span//span[@role='img']")
	private WebElement paswdview1;

	public WebElement getpasview1() {
		return paswdview1;
	}

	@FindBy(xpath = "//input[@id='confirm']/following-sibling::span//span[@role='img']")
	private WebElement pwdview2;

	public WebElement getpasview2() {
		return pwdview2;
	}

	@FindBy(id = "address")
	private WebElement add;

	public WebElement getaddress() {
		return add;
	}

	@FindBy(id = "zipcode")
	private WebElement zip;

	public WebElement getZip() {
		return zip;
	}

	@FindBy(xpath = "//input[@placeholder='Phone number']")
	private WebElement phno;

	public WebElement getPhonenumber() {
		return phno;
	}

	@FindBy(id = "mrn")
	private WebElement mrn;

	public WebElement getMrn() {
		return mrn;
	}

	@FindBy(xpath = "//div[@class='selected-flag']")
	private WebElement cntryimg;

	public WebElement getCntryChange() {
		return cntryimg;
	}

	@FindBy(xpath = "//span[text()='Previous']")
	private WebElement previousbtn;

	public WebElement getPrevousbtn() {
		return previousbtn;
	}

	@FindBy(xpath = "//span[text()='Next']")
	private WebElement next;

	public WebElement getNext3() {
		return next;
	}
	
	@FindBy(xpath="//span[text()='could not create a patient']")
	private WebElement createdoc;
	
	public WebElement getCouldNotDoc() 
	{
		return createdoc;
	}
   WebDriver driver;
   
	public void userRegisteration(String fname, String middlename, String lname, String dateOfBirth, 
			String mail, String password, String confirPwd, String Add, String zipcode, String Mob, String Mrn) throws Exception

	{
       fnme.sendKeys(fname);
       mnme.sendKeys(middlename);
       lnme.sendKeys(lname);
       dob.sendKeys(dateOfBirth);
       nxt1.click();
       gen.click();
       mle.click();
       
       email.sendKeys(mail);
       pwd.sendKeys(password);
       paswdview1.click();
       cpwd.sendKeys(confirPwd);
       pwdview2.click();
       nbut2.click();
       Thread.sleep(3000);
       add.sendKeys(Add);
       zip.sendKeys(zipcode);
       phno.sendKeys(Mob);
       mrn.sendKeys(Mrn);
       next.click();
       
       }

}
