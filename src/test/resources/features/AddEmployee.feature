Feature: Add Employee to HRMs portal

  Background:
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
    And user passes info from data table and click on save button
      | FIRSTNAME | MIDDLENAME | LASTNAME |
      | Tom       | JT         | Brady    |
      | Bill      | MM         | Clinton  |
      | Harry     | Wizzard    | Potter   |

    Then employee is added successfully

  @second
  Scenario: Add Employee with first and last name and EmployeeID
    And user enters info from data table and click on save button
      | FIRSTNAME | LASTNAME | EMPLOYEEID |
      | Tom       | Brady    | 5050       |
      | Bill      | Clinton  | 4040       |
      | Harry     | Potter   | 3030       |

    Then employee is added successfully

    @third
    Scenario: Adding employee with incomplete information
      When user enter "Jason" as first name and "JT" as middle name
      And user click on enter
      Then user can see clear error message