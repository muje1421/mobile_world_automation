import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage {
	
    WebDriver driver;
    public Landingpage(WebDriver driver) {
	this.driver =driver;
	PageFactory.initElements(driver, this);
	}
    //---------------------------SIGN IN-----------------------------------
	    @FindBy(xpath= "//button[@class='btn btn-warning my-2 my-sm-0']")
	    WebElement signin;
	
    	@FindBy(id = "username")
       	WebElement  username;
    	
    	@FindBy(id= "password")
    	WebElement password;
    	
        @FindBy(xpath="//*[@id=\"submitForm\"]/div[4]/a")
    	WebElement login;
 //------------------------SIGN UP-----------------------------------------   
        
        @FindBy(xpath= "//button[@class='btn btn-warning my-2 my-sm-0']")
	    WebElement Signin;
        
        @FindBy(linkText = "Sign up")
       	WebElement  Signup;
        
        @FindBy(css = "input[type='text']")
       	WebElement  firstname;
        
        @FindBy(xpath= "//input[@placeholder='Last Name']")
       	WebElement  lastname;
        
        @FindBy(xpath = "//input[@placeholder='Enter Email']")
       	WebElement  email;
        
        @FindBy(xpath = "//input[@type='Password']")
       	WebElement  passwords;
        
        @FindBy(xpath = "//input[@type='date']")
       	WebElement DOB;
        
        @FindBy(xpath="//input[@type='radio']")
        WebElement  gender;
        
        @FindBy(xpath = "//input[@min='0']")
       	WebElement  phonenumber;
        
        @FindBy(xpath = "//textarea[@rows='3']")
       	WebElement  bio;
        
        @FindBy(xpath = "//button[@type='submit']")
       	WebElement  registers;
        
        
  //--------------------------CONTACT US----------------------------------------------------------- 
        @FindBy(xpath= "/html/body/nav/div/ul/li[4]/a")
	    WebElement support;
        
        @FindBy(linkText = "Contact Us")
	    WebElement contactus;
        
        @FindBy(xpath= "/html/body/div/div/div[2]/form/div[1]/input")
	    WebElement Username;
        
        @FindBy(css = "input[placeholder='Email']")
       	WebElement  Email;
        
        @FindBy(xpath= "//input[@type='tel']")
	    WebElement phone;
        
        @FindBy(css = "textarea[placeholder='Message']")
       	WebElement message;
        
        @FindBy(css = "input[type='submit']")
       	WebElement submit;
        
//-------------------------------------------------------------------------------------
    public void loginpage(String name, String pass) throws InterruptedException {
    	signin.click();
		username.sendKeys(name);
		Thread.sleep(1000);
		password.sendKeys(pass);
		Thread.sleep(1000);
		login.click();
		Thread.sleep(1000);
		driver.quit();
    }
    //--------------------------------------------------------------------------------
    public void register(String fname,String lname,String emailaddress,String pwd,String dob,String phone,String bioshort) throws InterruptedException {
    	Signin.click();
    	Signup.click();
    	firstname.sendKeys(fname);
    	lastname.sendKeys(lname);
    	email.sendKeys(emailaddress);
    	passwords.sendKeys(pwd);
    	DOB.sendKeys(dob);
    	gender.click();
    	phonenumber.sendKeys(phone);
    	bio.sendKeys(bioshort);
    	registers.click();	
    	driver.switchTo().alert().accept();
    	Thread.sleep(1000);
    	driver.quit();
    }
    //---------------------------------------------------------------------------------------
    public void send(String uname,String emailid,String phoneno,String msg) throws InterruptedException {
    	
    	support.click();
    	contactus.click();
    	String parenthandle = driver.getWindowHandle();
	    Set<String> handles = driver.getWindowHandles();
	    for(String handle : handles) {
	        if(!handle.equals(parenthandle)) {
	            driver.switchTo().window(handle);
    	Username.sendKeys(uname);
    	Email.sendKeys(emailid);
    	phone.sendKeys(phoneno);
        message.sendKeys(msg);
        Thread.sleep(2000);
        submit.click();
        Thread.sleep(1000);
        driver.quit();
	        }
    	
	    }}
    

	}
