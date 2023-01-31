package freecrm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TasksPage extends CommonAPI {


    //Initializing the Page Objects:
    public TasksPage(){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }


    //Actions:

}
