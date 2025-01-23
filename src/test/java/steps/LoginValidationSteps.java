package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class LoginValidationSteps extends CommonMethods {

    @When("user enter {string} and {string}")
    public void user_enter_and(String username, String password) {
       loginValidationPage.usernameBox.sendKeys(username);
       loginValidationPage.passwordBox.sendKeys(password);
    }
    @When("user submits")
    public void user_submits() {
      loginValidationPage.loginButton.click();
    }
    @Then("user is getting error message")
    public void user_is_getting_error_message() {
       String actualMessage=loginValidationPage.automatedErrorMessage.getText();

        List<String> expectedMessage= Arrays.asList("Password is Empty",
                "Username cannot be empty",
                "Invalid credentials");

       assertTrue("Error message does not match expected. Actual message: "+actualMessage,expectedMessage.contains(actualMessage));
    }

    @Then("user lands on dashboard page and gets welcome message")
    public void user_lands_on_dashboard_page_and_gets_welcome_message() {
       String actualMessage=loginValidationPage.dashboard.getText();
       String expectedMessage="Dashboard";
       assertEquals("The welcome message does not match!",expectedMessage,actualMessage);

    }

}
