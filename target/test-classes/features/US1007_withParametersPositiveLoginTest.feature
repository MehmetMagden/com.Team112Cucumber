

Feature: US1007 PositiveLoginTest

  Scenario: TC10 Positive login test with valid username and valid password

    Given user goes to "qdUrl" homepage
    Then user click on qdHomePage login button
    And user enters a email to emailTextBox
    And user enters a password to passwordTextBox
    And user click on loginPage login button
    And test that user could be able to login





