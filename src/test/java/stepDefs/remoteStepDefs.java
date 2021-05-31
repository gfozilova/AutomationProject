package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class remoteStepDefs {
    @Given("The user launch a browser")
    public void the_user_launch_a_browser() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.getDriver().get("http://70.32.24.165/");

    }
    @When("The user clicks on the button {string}")
    public void the_user_clicks_on_the_button(String string) {

        Driver.getDriver().findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[3]/button")).click();

    }
    @Then("The user is on the home page")
    public void the_user_is_on_the_home_page() {

    }
    @When("The user click on the {string}")
    public void the_user_click_on_the(String string) {

        Driver.getDriver().findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div[2]/a[1]/h4")).click();

    }
    @Then("The user is on services page")
    public void the_user_is_on_services_page() {

    }
    @When("The user clicks on {string}")
    public void the_user_clicks_on(String string) {
        Driver.getDriver().findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div")).click();

    }
    @Then("The page contains {string}")
    public void the_page_contains(String string) {

        String actual = Driver.getDriver().findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div[1]/div[1]/div[2]")).getText();
        Assert.assertEquals(actual,"Order Info");

    }


}
