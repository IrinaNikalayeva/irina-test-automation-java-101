package task2.Pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Iryna on 1/17/2016.
 */
public abstract class AbstractPage {

    protected String PAGE_NAME;
    protected WebDriver webDriver;

    public AbstractPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }


    abstract void openPage();
}
