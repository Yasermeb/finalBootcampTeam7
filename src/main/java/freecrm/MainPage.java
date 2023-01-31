package freecrm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends CommonAPI {

    @FindBy(xpath = "//span[contains(text(),'Yaser Mebarki')]")
    WebElement userNameLabel;

    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement SearchBar;

    @FindBy(xpath = "//i[@class='home icon']")
    WebElement HomeBtn;

    @FindBy(xpath = "//i[@class='calendar icon']")
    WebElement CalendarBtn;

    @FindBy(xpath = "//span[normalize-space()='Contacts']")
    WebElement contactsLink;

    @FindBy(xpath = "//i[@class='money icon']")
    WebElement dealsLink;

    @FindBy(xpath = "//a[contains(text(),'Tasks')]")
    WebElement tasksLink;


    //Initializing the Page Objects:
    public MainPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    //Actions:
    public String verifyMainPageTitle(){
        return driver.getTitle();
    }

    public boolean verifyCorrectUserName(){
		return userNameLabel.isDisplayed();
	}

	public ContactsPage clickOnContactsLink(){
		contactsLink.click();
		return new ContactsPage();
	}

	public DealsPage clickOnDealsLink(){
		dealsLink.click();
		return new DealsPage();
	}
}
