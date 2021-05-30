package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.SignUp_page;
import utilities.Driver;

public class SignUp_ErrorsDefs {

    @Given("The user navigates to Create Account page to SignUp")

    public void the_user_navigates_to_create_account_page_to_SignUp() throws InterruptedException {
        new SignUp_page().SignUPClick();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//h2[.='Sign up']")).isDisplayed());
    }

    @When("Enter the ShortPassword info")
    public void enter_the_ShortPassword_info () throws InterruptedException {
        SignUp_page shortPassword_try = new SignUp_page();
        shortPassword_try.ShortPaswordCheck();
        String expectAlertText = shortPassword_try.getAlertMessageSignUp();
        String alertText = "password should not be less than";
        Assert.assertTrue(expectAlertText.contains(alertText));

//    }
//    @Then("The user should get alert of incorrect password")
//    public void the_user_should_get_alert_of_incorrect_password () {

    }
    @When("Enter the duplicatePhone info")
    public void enter_the_duplicatePhone_info () throws InterruptedException {
        SignUp_page PhoneAlreadyRegistered = new SignUp_page();
        PhoneAlreadyRegistered.PhoneAlreadyRegisteredCheck();
        String expectAlertText = PhoneAlreadyRegistered.getAlertMessageSignUp();
        String alertText = "Phone number already registered";
        Assert.assertEquals(expectAlertText, alertText);

    }

    @When("Enter the duplicateEmail info")
        public void enter_the_duplicateEmail_info () throws InterruptedException {
        SignUp_page emailAlreadyExist = new SignUp_page();
        emailAlreadyExist.EmailAlreadyExistCheck();
        String expectAlertText = emailAlreadyExist.getAlertMessageSignUp();
        String alertText = "Email is already ";
        Assert.assertEquals(expectAlertText, alertText);

        }



        @Then("The user should get alert of incorrect or duplicate info")
        public void the_user_should_get_alert_of_incorrect_or_duplicate_info () throws InterruptedException {
        SignUp_page alertMessageAppeared = new SignUp_page();
        Assert.assertTrue(alertMessageAppeared.unacceptableInfo.isDisplayed());


        }

    }
