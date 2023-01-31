package freecrm;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.CommonAPI;

public class SignUpPage extends CommonAPI {

    //Initializing the Page Objects:
    public SignUpPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailAddress;

    @FindBy(id="terms")
    WebElement termsAgree;

    @FindBy(id="recaptcha-anchor")
    WebElement notARobot;

    @FindBy(xpath = "//button[contains(text(),'Sign up')]")
    WebElement signUpButton;

    //Actions:
    public void typeEmail() {
        emailAddress.sendKeys("yasermeb@gmail.com");
    }

    public void acceptTerms(){
        clickOn(termsAgree);
    }

    public void notARobotCheck(){
        clickOn(notARobot);
    }

    public void clickOnSignUpButton(){
        clickOn(signUpButton);
    }

}
