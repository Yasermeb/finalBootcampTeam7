package freecrm;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class MainPageTest extends CommonAPI {

    LoginPage loginPage;
    HomePage homePage;
    ContactsPage contactsPage;
    DealsPage dealsPage;
    MainPage mainPage;


    public MainPageTest() {
        super();
    }


    @Test(priority=1)
    public void verifyMainPageTitleTest(){
        String homePageTitle = mainPage.verifyMainPageTitle();
        Assert.assertEquals(homePageTitle, "Cogmento CRM","Main page title not matched");
    }

    @Test(priority=2)
    public void verifyUserNameTest(){
        Assert.assertTrue(mainPage.verifyCorrectUserName());
    }

    @Test(priority=3)
    public void verifyContactsLinkTest(){
        contactsPage = mainPage.clickOnContactsLink();
    }

    @Test(priority=4)
    public void clickOnDealsLink(){
        dealsPage=mainPage.clickOnDealsLink();
    }
}
