package task2.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import task2.Pages.DraftsPage;
import task2.Pages.EmailDetailsPage;
import task2.Pages.HomePage;
import task2.Pages.MailBoxPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Iryna on 1/17/2016.
 */
public class TestSteps {
    private WebDriver webDriver;

    public void initBrowser()
    {
        System.setProperty("webdriver.chrome.driver",
            "D:\\TA\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void login(String username, String passwrod){
        HomePage homePage = new HomePage(webDriver);
        homePage.openPage();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePage.loginInMailBox(username, passwrod);

    }

    public void createEmail(String to, String subject, String body){
        MailBoxPage mailBoxPage = new MailBoxPage(webDriver);
        mailBoxPage.createEmail(to, subject, body);
    }

    public Boolean isToFieldFilledIn(String to){
        MailBoxPage mailBoxPage = new MailBoxPage(webDriver);
        return mailBoxPage.getToFieldText().contains(to);

    }
    public Boolean isSubjectFieldFilledIn(String subject){
        MailBoxPage mailBoxPage = new MailBoxPage(webDriver);
        return mailBoxPage.getSubjectFieldText().equals(subject);
    }
    public Boolean isBodyFieldFilledIn(String message){
        MailBoxPage mailBoxPage = new MailBoxPage(webDriver);
        return mailBoxPage.getBodyFieldText().equals(message);
    }

    public void saveAsDraft() throws InterruptedException {
        MailBoxPage mailBoxPage = new MailBoxPage(webDriver);
        mailBoxPage.saveAsDraft();
    }
    public Boolean isSavedToDrafts(){
        MailBoxPage mailBoxPage = new MailBoxPage(webDriver);
        return mailBoxPage.getSaveButtonStatus().equals("disabled");

    }

    public void goToDrafts(){
        MailBoxPage mailBoxPage = new MailBoxPage(webDriver);
        mailBoxPage.openDraftsPage();
    }

    public void chooseEmail(){
        DraftsPage draftsPage = new DraftsPage(webDriver);
        draftsPage.chooseLastEmail();
    }

    public void sendEmail(){
        EmailDetailsPage emailDetailsPage = new EmailDetailsPage(webDriver);
        emailDetailsPage.sendEmail();
    }

    public void closeDriver(){
        webDriver.close();
    }
}
