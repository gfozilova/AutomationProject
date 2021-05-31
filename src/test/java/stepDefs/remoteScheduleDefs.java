package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.remoteSchedulePages;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class remoteScheduleDefs {

    @Given("launch a browser")
    public void launch_a_browser() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("clicks on the button {string}")
    public void clicks_on_the_button(String string) {
        remoteSchedulePages acceptbutton = new remoteSchedulePages();
        acceptbutton.Accept.click();
    }

    @Then("The user is in the homepage")
    public void the_user_is_in_the_homepage() {
        remoteSchedulePages verify = new remoteSchedulePages();
        String actual = verify.mainPage.getText();
        String expected = "Notarize documents online or in person at your convenient time and location";

        Assert.assertEquals(actual, expected);
    }

    // 2.Scenarios
    @Given("user launch a browser")
    public void user_launch_a_browser() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("The user click on the Remote Notarization")
    public void Remote_Notarization() {
        remoteSchedulePages remNot = new remoteSchedulePages();
        remNot.Remote.click();
    }

    @When("The user clicks on Schedule")
    public void Schedule() {
        remoteSchedulePages schedule = new remoteSchedulePages();
        schedule.schudele.click();
    }

    @Then("The page contains Order Info")
    public void Order_Info() {
        String actual = Driver.getDriver().findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div[1]/div[1]/div[2]")).getText();
        Assert.assertTrue(actual.equals("Order Info"));
    }
// 3.scenarios
    @When("The user click on the Enter title of the document")
    public void title_of_the_document() {
        String doc = "Driver Licence";
        remoteSchedulePages document = new remoteSchedulePages();
        document.titleDoc.sendKeys(doc + Keys.ENTER);
    }

    @When("The user click on the Increase number of documents to be notarized")
    public void number_of_documentincrease() {
        remoteSchedulePages numberOfdocument = new remoteSchedulePages();
        int x = 1;
        for (int i = 0; i < x; i++) {
            numberOfdocument.increase.click();
        }
    }

    @When("The user click on the Decrease number of documents to be notarized")
    public void number_of_documentdecrease() {
        remoteSchedulePages numberOfdocument = new remoteSchedulePages();
        int x = 1;
        for (int i = 0; i < x; i++) {
            numberOfdocument.decrease.click();
        }
    }
// 4.scenarios
    @When ("The user click on the Upload your document")
    public void Upload_documents(){
        remoteSchedulePages uploadDoc = new remoteSchedulePages();
       uploadDoc.upload.sendKeys("C:\\Users\\gundo\\OneDrive\\Desktop\\Shortcuts.docx");
    }
    @When ("The user click on the Checkbox")
    public  void checkbox(){
        remoteSchedulePages Checkbox = new remoteSchedulePages();
        Checkbox.checkbox.click();
    }
    @Then ("The user click on the Nextbutton")
    public void NextButton(){
        remoteSchedulePages Nextbutton = new remoteSchedulePages();
        Nextbutton.nextButton.click();
    }
}