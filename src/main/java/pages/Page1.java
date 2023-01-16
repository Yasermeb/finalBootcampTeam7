package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page1 extends CommonAPI {
    public Page1 (WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
