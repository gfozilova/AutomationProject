package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class remoteSchedulePages {

    public remoteSchedulePages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement Accept;

    @FindBy(xpath = "//h4[text()='Remote Notarization']")
    public WebElement Remote;

    @FindBy(xpath = "//h1[text()='Notarize documents online or in person at your convenient time and location']")
    public WebElement mainPage;

    @FindBy(xpath = "//div[@style='background: url(\"/assets/img/traveling-notarization.png\") center center no-repeat;']")
    public WebElement  schudele;

    @FindBy(id = "titleDoc")
    public WebElement titleDoc;

    @FindBy(xpath = "//i[@class= 'fas fa-plus']")
    public WebElement increase;

    @FindBy(xpath = "//i[@class='fas fa-minus']")
    public WebElement decrease;

    @FindBy(id = "documentOnline")
    public WebElement upload;

    @FindBy(id = "defaultUnchecked")
    public WebElement checkbox;

    @FindBy(xpath = "//button[contains(text(), 'Next' )]")
    public WebElement nextButton;

}
