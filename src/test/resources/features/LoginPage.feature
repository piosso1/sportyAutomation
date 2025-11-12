Feature: Login functionality

  @login
  Scenario: validating user login
    #Given user is navigated to 247bet
    When user enters username and password
    And  user clicks on login button
    Then user is successfully logged in