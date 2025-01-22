package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;






public class LoginValidationSteps extends CommonMethods {
    @When("user leaves username box empty {string} and enters {string}")
    public void user_leaves_username_box_empty_and_enters(String username, String password) {
        loginValidationPage.usernameBox.sendKeys(username);
        loginValidationPage.passwordBox.sendKeys(password);

    }


    @When("user submits")
    public void user_submits() {
       loginValidationPage.loginButton.click();
    }
    @Then("user is getting error message")
    public void user_is_getting_error_message() {
        System.out.println(loginValidationPage.getAutomatedErrorMessage().toString());
    }
    @When("user enters {string} and empty password field {string}")
    public void user_enters_and_empty_password_field(String usrName, String passWord) {
        loginValidationPage.usernameBox.sendKeys(usrName);
        loginValidationPage.passwordBox.sendKeys(passWord);
    }
    @When("user enters wrong credentials {string} and {string}")
    public void user_enters_wrong_credentials_and(String usr, String pass) {
        loginValidationPage.usernameBox.sendKeys(usr);
        loginValidationPage.passwordBox.sendKeys(pass);
    }
    @When("user enters correct credentials {string} and {string}")
    public void user_enters_correct_credentials_and(String usernameInput, String passInput) {
        loginValidationPage.usernameBox.sendKeys(usernameInput);
        loginValidationPage.passwordBox.sendKeys(passInput);
    }
    @Then("user lands on dashboard page and gets welcome message")
    public void user_lands_on_dashboard_page_and_gets_welcome_message() {
        System.out.println(loginValidationPage.getWelcomeMessage());
    }

}
