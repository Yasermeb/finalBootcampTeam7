package freecrm;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

	Logger LOG = LogManager.getLogger(HomePage.class.getName());

	// Initializing the Page Objects:
	public HomePage(WebDriver driver){      //This will initiate all elements of this class
		PageFactory.initElements(driver,this);
	}


	@FindBy(xpath = "//a[text()='Log In']")
	WebElement loginButton;

	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement SignUpButton;

	@FindBy(xpath = "//a[contains(text(),'Compare')]")
	WebElement CompareButton;

	@FindBy(xpath = "//i[@class='trash alternate outline icon']")
	WebElement TrashIcon;


	public String verifyHomePageTitle(){
		return driver.getTitle();
	}

	public void clickOnLoginButton(){
		clickOn(loginButton);
		LOG.info("click on login button success");
	}

	public void clickOnSignUpButton(){
		clickOn(SignUpButton);
		LOG.info("click on Sign Up button success");
	}

	public void clickOnCompareButton(){
		clickOn(CompareButton);
		LOG.info("click on Compare button success");
	}

	public void clickOnTrashIcon(){
		clickOn(TrashIcon);
		LOG.info("click on Trash Icn success");
	}
}
