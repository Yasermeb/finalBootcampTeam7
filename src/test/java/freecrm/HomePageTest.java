package freecrm;

import base.CommonAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {

	HomePage homePage=new HomePage(getDriver());
	LoginPage loginPage=new LoginPage(getDriver());


	public HomePageTest() {
		super();
	}

	@Test(priority=1)

	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Cogmento CRM","Home page title not matched");
	}


}