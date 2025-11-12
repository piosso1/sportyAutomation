Feature: User Place a Bet on 247Bet

  Background:
    #Given user is navigated to 247bet
    When user enters username and password
    And  user clicks on login button
    Then user is successfully logged in


  @placebet
  Scenario: User place a bet
    When user select odd
    Then user places a bet with stake "500"
    And  bet reference ID should be generated
    And  bet timestamp should be displayed
    Then wallet balance should reduce by 500