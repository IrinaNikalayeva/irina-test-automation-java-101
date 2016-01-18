package task2.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MailBoxPage extends AbstractPage {

    protected static final String BASE_URL = "https://e.mail.ru/messages/inbox/";

    @FindBy(css = "span.b-toolbar__btn__text.b-toolbar__btn__text_pad")
    private WebElement createEmail;

    @FindBy(xpath = "//textarea[2]")
    private WebElement toField;

    @FindBy(css = "compose__labels__label__text js-label-text")
    private WebElement toFieldAfterInput;

    @FindBy(name = "Subject")
    private WebElement subjectField;

    @FindBy(xpath = "//iframe[starts-with(@id, 'compose_')]")
    private WebElement bodyFrame;

    @FindBy(id = "tinymce")
    private WebElement bodyField;

    @FindBy(xpath = "//div[@data-name='saveDraft']")
    private WebElement saveDraftButton;

    @FindBy(xpath = "//a[contains(@href, '/messages/drafts/')]")
    private WebElement draftsButton;



    public MailBoxPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(this.webDriver, this);
    }

    public void createEmail(String to, String subject, String body){
        createEmail.click();
        toField.sendKeys(to);
        subjectField.sendKeys(subject);
        webDriver.switchTo().frame(bodyFrame);
        bodyField.clear();
        bodyField.sendKeys(body);
        webDriver.switchTo().defaultContent();

    }

    public void saveAsDraft() throws InterruptedException {
        saveDraftButton.click();
        Thread.sleep(1000);
    }

    public DraftsPage openDraftsPage(){
        draftsButton.click();
        return PageFactory.initElements(webDriver, DraftsPage.class);
    }

    public String getToFieldText(){
        System.out.println(toField.getText());
        return toField.getText();

    }

    public String getSubjectFieldText(){
        return subjectField.getText();
    }

    public String getBodyFieldText(){
        return bodyField.getText();
    }

    public String getSaveButtonStatus(){
       return saveDraftButton.getAttribute("aria-disabled").toString();
    }



    @Override
    public void openPage(){
        webDriver.get(BASE_URL);

    }


}
