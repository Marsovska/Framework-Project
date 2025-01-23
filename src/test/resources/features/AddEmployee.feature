Feature: Add Employee to HRMs portal

  Background:
    #Given user is able to navigate to HRMs

    When user enters "Admin" and "Hum@nhrm123"
    And user clicks on save button
    Then user lands on Dashboard successfully
    When user is on dashboard page click PIM option
    And user click on AddEmployee tag


  @first
  Scenario: Add Employee by first, middle and last name
    #When user enters "Admin" and "Hum@nhrm123"
    #And user clicks on save button
    #Then user lands on Dashboard successfully
    #When user is on dashboard page click PIM option
    #And user click on AddEmployee tag
    And user enter "Tom", "JT" and "Brady"
    Then employee is added successfully

  @second
  Scenario: Add Employee with first and last name and EmployeeID
    And user enter "Tom" and "Brady " and "78905"
    Then employee is added successfully

    @third
    Scenario: Adding employee with incomplete information
      When user enter  only middle name "JT"
      And user click on enter
      Then user can see clear error message