package freecrm;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends CommonAPI{
    Logger LOG = LogManager.getLogger(TestLogin.class.getName());

    @Test

    public void loginTest(){
        HomePage homePage=new HomePage(getDriver());
        LoginPage loginPage=new LoginPage(getDriver());

        homePage.clickOnLoginButton();
        loginPage.typeEmail();
        loginPage.typePassword();

        loginPage.clickOnLoginButton();
        LOG.info("click On Login Success");

        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "Cogmento CRM");
        LOG.info("Test Login Success");
    }

}
