package pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class SignUp_page {

    public SignUp_page() throws InterruptedException {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='menuBlock']")
    public WebElement homePageMenu;

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//div[@class='labelBlockModal']")
    public WebElement keepMeLogInButton;

    @FindBy(xpath = "//button[@type='submit'")
    public WebElement submitButton;

    @FindBy(id = "u44diff8yz")
    public WebElement errorMessage;
    //div[@class='hasAccount']

    @FindBy(xpath = "//span[.='Create account']")
    public WebElement SignUpButton;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement FirstName_SignUp;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement LastName_SignUp;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement email_SignUp;
    @FindBy(xpath = "//input[@name='phoneNumber']")
    public WebElement phone_SignUp;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password_SignUp;
    @FindBy(xpath = "//input[@name='prePassword']")
    public WebElement prePassword_SignUp;
    @FindBy(xpath = "//div[@class='labelBlockModal rightControl']")
    public WebElement termsOfServiceBox_SignUp;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit_SignUp;
    @FindBy(xpath = "//span[@class='align-self-center alert-body']")
    public WebElement RegistrationAlert;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement unacceptableInfo;



    public void SignUPClick() {
        SignUpButton.click();
    }

    public String getRegistrationMessage() {
        return RegistrationAlert.getText();


    }public String getAlertMessageSignUp() throws InterruptedException {
        Thread.sleep(5000);
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
        return unacceptableInfo.getText();
    }
    public void ShortPaswordCheck (){
        FirstName_SignUp.sendKeys("Elena");
        LastName_SignUp.sendKeys("Kazakova");
        email_SignUp.sendKeys("elenakazakova@yahoo.com");
        phone_SignUp.sendKeys("7033895189");
        password_SignUp.sendKeys("test");
        prePassword_SignUp.sendKeys("test");
        termsOfServiceBox_SignUp.click();
        submit_SignUp.click();
    }
    public void PhoneAlreadyRegisteredCheck (){
        FirstName_SignUp.sendKeys("Elena");
        LastName_SignUp.sendKeys("Kazakova");
        email_SignUp.sendKeys("elenakazakova@yahoo.com");
        phone_SignUp.sendKeys("7033895189");
        password_SignUp.sendKeys("Tester21");
        prePassword_SignUp.sendKeys("Tester21");
        termsOfServiceBox_SignUp.click();
        submit_SignUp.click();

    }
    public void EmailAlreadyExistCheck(){
        FirstName_SignUp.sendKeys("Elena");
        LastName_SignUp.sendKeys("Kazakova");
        email_SignUp.sendKeys("elenakazakova@yahoo.com");
        phone_SignUp.sendKeys("2067359843");
        password_SignUp.sendKeys("Tester21");
        prePassword_SignUp.sendKeys("Tester21");
        termsOfServiceBox_SignUp.click();
        submit_SignUp.click();

    }


    public void SignIn() throws InterruptedException {
        homePageMenu.click();
        Thread.sleep(2000);
        usernameBox.sendKeys(ConfigReader.getProperty("username"));
        password.sendKeys(ConfigReader.getProperty("password"));
        keepMeLogInButton.click();
        submitButton.click();

    }


        }



