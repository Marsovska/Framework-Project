Feature: Login Validation for HRMs portal
Background:
 # Given user is able to navigate to HRMs

  @1
  Scenario: Login with empty username field
    When user leaves username box empty "" and enters "password"
    And user submits
    Then user is getting error message


    @2
    Scenario: Login with empty password field
      When user enters "Admin" and empty password field ""
      And user submits
      Then user is getting error message


      @3
      Scenario: Login with wrong credential
        When user enters wrong credentials "Admi" and "Humanhrm123"
        And user submits
        Then user is getting error message


        @4
        Scenario: Login with valid credentials
          When user enters correct credentials "Admin" and "Hum@nhrm123"
          And user submits
          Then user lands on dashboard page and gets welcome message

