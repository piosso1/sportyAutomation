package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Constants;

import java.time.Duration;

public class LoginPageSteps extends CommonMethods {

    @Given("user is navigated to 247bet")
    public void user_is_navigated_to_247bet() {
        openBrowserAndLunchApplication();
    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        sendText(ConfigReader.read("userName"), login.usernameField);
        sendText(ConfigReader.read("password"), login.passwordField);
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        click(login.loginButton);
    }
    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        getwait().until(ExpectedConditions.visibilityOf(login.myAccount));
        Assert.assertTrue(login.myAccount.isDisplayed());
        System.out.println("My test has pass");
    }
}
