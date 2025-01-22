package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runners.AddEmployeeRunner;
import utils.CommonMethods;
import utils.ConfigReader;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {
    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        addEmployeePage.usernameBox.sendKeys(username);
        addEmployeePage.passwordBox.sendKeys(password);
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        addEmployeePage.loginButton.click();
    }

    @Then("user lands on Dashboard successfully")
    public void user_lands_on_dashboard_successfully() {

        System.out.println(addEmployeePage.welcomeMsg.getText().toString());
    }

    @When("user is on dashboard page click PIM option")
    public void user_is_on_dashboard_page_click_pim_option() {
        addEmployeePage.PIMTag.click();
    }

    @When("user click on AddEmployee tag")
    public void user_click_on_add_employee_tag() {
        addEmployeePage.AddEmpTag.click();
    }

    @When("user passes info from data table and click on save button")
    public void user_passes_info_from_data_table_and_click_on_save_button(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> employees = dataTable.asMaps();
        for (Map<String, String> employee : employees) {
            addEmployeePage.firstNameBox.sendKeys(employee.get("FIRSTNAME"));
            addEmployeePage.middleNameBox.sendKeys(employee.get("MIDDLENAME"));
            addEmployeePage.lastNameBox.sendKeys(employee.get("LASTNAME"));
            addEmployeePage.empIDBox.clear();
            addEmployeePage.saveButton.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            addEmployeePage.AddEmpTag.click();
        }
    }

    @Then("employee is added successfully")
    public void employee_is_added_successfully() {
        System.out.println("Employee successfully added");
    }

    @When("user enters info from data table and click on save button")
    public void user_enters_info_from_data_table_and_click_on_save_button(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> employeeslist = dataTable.asMaps();
        for (Map<String, String> Emp : employeeslist) {
            addEmployeePage.firstNameBox.sendKeys(Emp.get("FIRSTNAME"));
            addEmployeePage.lastNameBox.sendKeys(Emp.get("LASTNAME"));
            addEmployeePage.empIDBox.clear();
            addEmployeePage.empIDBox.sendKeys(Emp.get("EMPLOYEEID"));
            addEmployeePage.saveButton.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            addEmployeePage.AddEmpTag.click();

        }
    }
    @When("user enter {string} as first name and {string} as middle name")
    public void user_enter_as_first_name_and_as_middle_name(String firstname, String middlename) {
      addEmployeePage.firstNameBox.sendKeys(firstname);
      addEmployeePage.middleNameBox.sendKeys(middlename);

    }
    @When("user click on enter")
    public void user_click_on_enter() {
        addEmployeePage.saveButton.click();
    }
    @Then("user can see clear error message")
    public void user_can_see_clear_error_message() {
        System.out.println(addEmployeePage.requiredField.getText().toString()+" field");
    }

}
