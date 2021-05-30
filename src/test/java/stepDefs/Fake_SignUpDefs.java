package stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.SignUp_page;
import utilities.Driver;

public class Fake_SignUpDefs {

    String firstFake;
    String lastFake;
    String passwordFake;


    @Given("The user is on the homepage")
    public void the_user_is_on_the_homepage() throws InterruptedException {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Duo Notary"));
    }

    @When("The user navigates to Create Account page")
    public void the_user_navigates_to_create_account_page() throws InterruptedException {
        new SignUp_page().SignUPClick();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//h2[.='Sign up']")).isDisplayed());

    }

    @When("The user passes the valid info and clicks on Sign Up")
    public void the_user_passes_the_valid_info_and_clicks_on_sign_up() throws InterruptedException {

        Faker fakeData = new Faker();
        SignUp_page fakeSignUp = new SignUp_page();
        firstFake=fakeData.name().firstName();
        fakeSignUp.FirstName_SignUp.sendKeys(firstFake);
        lastFake=fakeData.name().lastName();
        fakeSignUp.LastName_SignUp.sendKeys(lastFake);
        String emailFake = firstFake+lastFake+"@test.com";
        fakeSignUp.email_SignUp.sendKeys(emailFake);
        fakeSignUp.phone_SignUp.sendKeys(fakeData.phoneNumber().cellPhone());
        passwordFake=fakeData.internet().password();
        fakeSignUp.password_SignUp.sendKeys(passwordFake);
        fakeSignUp.prePassword_SignUp.sendKeys(passwordFake);
        fakeSignUp.termsOfServiceBox_SignUp.click();
        fakeSignUp.submit_SignUp.click();

    }

    @Then("The user should get message of success registration")
    public void the_user_should_get_message_of_success_registration() throws InterruptedException {
        SignUp_page registrMessage = new SignUp_page();
        String actualMessage = registrMessage.getRegistrationMessage();
        String containMessage = "Congratulations!";
        Assert.assertTrue(actualMessage.contains(containMessage));


    }
}
