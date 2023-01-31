package freecrm;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class TestSignUp extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestLogin.class.getName());

    @Test

    public void loginTest() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        SignUpPage signUpPage=new SignUpPage(getDriver());

        homePage.clickOnSignUpButton();
        signUpPage.typeEmail();
        signUpPage.acceptTerms();
        signUpPage.notARobotCheck();
        Thread.sleep(3000);
        signUpPage.clickOnSignUpButton();
    }
}
