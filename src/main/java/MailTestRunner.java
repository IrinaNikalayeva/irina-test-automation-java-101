import org.testng.TestNG;
import org.testng.xml.Parser;
import org.testng.xml.XmlSuite;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class MailTestRunner {
    public static void main(String[] args) throws InterruptedException, IOException, SAXException, ParserConfigurationException {
     TestNG testng =new TestNG();
     for (XmlSuite suite :  new Parser("./testng.xml").parseToList()) {
      testng.setCommandLineSuite(suite);
     }
     testng.run();
       /* TestSteps testSteps = new TestSteps(;
        testSteps.SignIn();
        testSteps.createAnEmail();
        testSteps.saveDraft();
        testSteps.navigateToDraftEmail();
        testSteps.sendAnEmail();*/


        /*System.setProperty("webdriver.chrome.driver",
                "D:\\TA\\Module5\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 30);
        final String USERNAME = "maven.test";
        final String PASSWORD = "Qwerty123";
        String to = "maven.test@mail.ru";
        String suject = "Test email";
        String messageBody = "Hello Maven!";
        webDriver.get("https://mail.ru");
        webDriver.findElement(By.id("mailbox__login")).sendKeys(USERNAME);
        webDriver.findElement(By.id("mailbox__password")).sendKeys(PASSWORD);
        webDriver.findElement(By.id("mailbox__auth__button")).click();
        webDriver.findElement(By.cssSelector("span.b-toolbar__btn__text.b-toolbar__btn__text_pad")).click();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.findElement(By.xpath("//textarea[2]")).sendKeys(to);
        webDriver.findElement(By.name("Subject")).sendKeys(suject);

        webDriver.switchTo().frame(webDriver.findElement(By.xpath("//iframe[starts-with(@id, 'compose_')]")));
        webDriver.findElement(By.id("tinymce")).sendKeys(messageBody);
        webDriver.switchTo().defaultContent();
        webDriver.findElement(By.xpath("//div[@data-name='saveDraft']")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//a[contains(@href, '/messages/drafts/')]")).click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String email = (webDriver.findElement(By.xpath("//a[starts-with(@href, 'https://e.mail.ru/compose/')]")).getAttribute("href").toString());
        webDriver.get(email);
        webDriver.findElement(By.xpath("//div[@data-name='send']")).click();

        //webDriver.findElements(By.xpath("//div[contains(@data-id, *)]"));
        //Object[] emails = webDriver.findElements(By.xpath("//div[contains(@data-id, *)]")).toArray();

        // for (int i = 0; i< emails.length; i++){
        // System.out.println(emails[i]);
        //}
        // webDriver.findElement(By.xpath("//div[@data-name='send']")).click();

        //webDriverWait.until(ExpectedConditions.elementToBeSelected(webDriver.findElement(By.xpath("//div[@data-name='saveDraft']"))));

  /*catch (UnhandledAlertException e){
            org.openqa.selenium.Alert alert = webDriver.switchTo().alert();
            alert.accept();
}*/

        //webDriver.findElement(By.xpath("//a[contains(@href, '/messages/drafts/')]")).click();


        //System.out.println(webDriver.findElements(By.xpath("//div[contains(@data-id, *)]")).toArray());
        //  Object[] emails = webDriver.findElements(By.xpath("//div[contains(@data-id, *)]")).toArray();
        //  for (int i = 0; i< emails.length; i++){
        //   System.out.println(emails[i]);
        // }

        //synchronized (webDriver){
        //    webDriver.wait(20);
        // }

        //webDriver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        // webDriver.findElement(By.xpath("//a[contains(@href, '/messages/drafts/')]")).click();
        //System.out.println("fffff");


        //webDriver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        //webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // final Wait<WebDriver> wait = new WebDriverWait(webDriver, 10, 10000);
        //wait.until(ExpectedConditions.elementToBeSelected(webDriver.findElement(By.xpath("//div[@data-name='saveDraft']"))));


        //webDriver.findElements(By.xpath("//div[contains(@data-id)]")).size();
        // webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // webDriver.findElement(By.xpath("//a[contains(@href, '/messages/drafts/')]")).click();
        //webDriver.findElements(By.xpath("//div[contains(@data-id)]")).size(); */


    }
}
