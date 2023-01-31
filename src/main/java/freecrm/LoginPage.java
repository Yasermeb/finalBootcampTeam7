package freecrm;

import base.CommonAPI;
import com.mysql.cj.log.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends CommonAPI {

	Logger LOG = LogManager.getLogger(HomePage.class.getName());

	// Initializing the Page Objects:
	public LoginPage(WebDriver driver){      //This will initiate all elements of this class
		PageFactory.initElements(driver,this);
	}



//	@FindBy(name="username")
//	WebElement username;

	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//div[contains(text(),'Login')]")
	WebElement loginButton;

	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement signUpButton;

	//Actions:
	public void typeEmail() {
		email.sendKeys("yasermeb@gmail.com");
	}

	public void typePassword() {
		password.sendKeys("Relayrelay0");
	}

	public void clickOnLoginButton(){
		loginButton.click();
	}

	public void clickOnSignUpButton(){
		signUpButton.click();}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

//	public HomePage login(String un, String pwd){
//		username.sendKeys(un);
//		password.sendKeys(pwd);
//		//loginBtn.click();
//		    	JavascriptExecutor js = (JavascriptExecutor)driver;
//		    	js.executeScript("arguments[0].click();", loginBtn);
//
//		//return new HomePage();
//	}
}
