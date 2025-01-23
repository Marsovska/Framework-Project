Feature: Login Validation for HRMs portal
Background:
 # Given user is able to navigate to HRMs

  @first
  Scenario: Login with empty username field
    When user enter "" and "password"
    And user submits
    Then user is getting error message


    @second
    Scenario: Login with empty password field
      When user enter "Admin" and ""
      And user submits
      Then user is getting error message


      @third
      Scenario: Login with wrong credential
        When user enter "Admi" and "Humanhrm123"
        And user submits
        Then user is getting error message


        @fourth
        Scenario: Login with valid credentials
          When user enter "Admin" and "Hum@nhrm123"
          And user submits
          Then user lands on dashboard page and gets welcome message

