package task2;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import task2.Steps.TestSteps;

public class TestsWithPageObject {
    private TestSteps testSteps;
    static final String USERNAME = "maven.test";
    static final String PASSWORD = "Qwerty123";
    String to = "maven.test@mail.ru";
    String suject = "Test email";
    String messageBody = "Hello Maven!";

    @BeforeTest
    public void setUp()
    {
        testSteps = new TestSteps();
        testSteps.initBrowser();
    }

    @Test(priority = 0)
    public void loginInMailBox(){
        testSteps.login(USERNAME, PASSWORD);
    }

    @Test(priority = 1)
    public void createEmail(){
        testSteps.createEmail(to, suject, messageBody);
    }

    @Test(priority = 2)
    public void saveAsDraft() throws InterruptedException {
        testSteps.saveAsDraft();
        Assert.assertTrue(testSteps.isSavedToDrafts());
    }

    @Test(priority = 3)
    public void goToDrafts(){
        testSteps.goToDrafts();
    }

    @Test(priority = 4)
    public void chooseEmail(){
        testSteps.chooseEmail();
    }

    @Test(priority = 5)
    public void senEmail(){
        testSteps.sendEmail();
    }

    @AfterTest
    public void CleanUp(){
        testSteps.closeDriver();

    }






}
