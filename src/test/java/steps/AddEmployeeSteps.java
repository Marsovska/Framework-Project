package steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AddEmployeeSteps extends CommonMethods {

    @When("user enters login credentials and submit")
    public void user_enters_login_credentials_and_submit() {
        addEmployeePage.usernameBox.sendKeys(ConfigReader.read("username"));
        addEmployeePage.passwordBox.sendKeys(ConfigReader.read("password"));
        addEmployeePage.loginButton.click();
    }


    @Then("user lands on Dashboard successfully")
    public void user_lands_on_dashboard_successfully() {
      String actualMessage=addEmployeePage.dashboard.getText();
        Assert.assertEquals("Dashboard", actualMessage);
    }

    @When("user is on dashboard page click PIM option")
    public void user_is_on_dashboard_page_click_pim_option() {
        addEmployeePage.PIMTag.click();
    }

    @When("user click on AddEmployee tag")
    public void user_click_on_add_employee_tag() {
        addEmployeePage.AddEmpTag.click();
    }

    @When("user enter {string}, {string} and {string}")
    public void user_enter_and(String firstName, String middleName, String lastName) {
        addEmployeePage.firstNameBox.sendKeys(firstName);
        addEmployeePage.middleNameBox.sendKeys(middleName);
        addEmployeePage.lastNameBox.sendKeys(lastName);
        addEmployeePage.saveButton.click();
    }

    @Then("employee is added successfully")
    public void employee_is_added_successfully() {
        String actualMessage= addEmployeePage.personalDetail.getText();
        Assert.assertEquals("Personal Details",actualMessage);

    }

    @When("user enter {string} and {string} and {string}")
    public void user_enter_and_and(String firstName, String lastName, String EmployeeID) {
        addEmployeePage.firstNameBox.sendKeys(firstName);
        addEmployeePage.lastNameBox.sendKeys(lastName);
        addEmployeePage.empIDBox.sendKeys(EmployeeID);
    }


    @When("user enter  only middle name {string}")
    public void user_enter_only_middle_name(String middleName) {
        addEmployeePage.middleNameBox.sendKeys(middleName);
    }

    @When("user click on enter")
    public void user_click_on_enter() {
        addEmployeePage.saveButton.click();
    }

    @Then("user can see clear error message")
    public void user_can_see_clear_error_message() {
        String actualMessage = addEmployeePage.emptyFieldError.getText();
        String expectedMessage = "Required";
        assertTrue("The error message does not match. The actual message is: " + actualMessage, expectedMessage.contains(actualMessage));

    }

}
