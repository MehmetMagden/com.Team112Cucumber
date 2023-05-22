
Feature: US1008 Negative Login Test

  Scenario: TC11 Negative Login Test with valid Email and Invalid Password

    Given user goes to "qdUrl" homepage
    Then user click on qdHomePage login button
    And user enters a "qdValidUserName" to emailTextBox
    And user enters a "qdInvalidPassword" to passwordTextBox
    And user click on loginPage login button
    And test that user could not be able to login
    And closes the page

  Scenario: TC12 Negative Login Test with Invalid Email and Valid Password

    Given user goes to "qdUrl" homepage
    Then user click on qdHomePage login button
    And user enters a "qdInvalidUserName" to emailTextBox
    And user enters a "qdValidPassword" to passwordTextBox
    And user click on loginPage login button
    And test that user could not be able to login
    And closes the page

  Scenario: TC13 Negative Login Test with Invalid Email and Invalid Password

    Given user goes to "qdUrl" homepage
    Then user click on qdHomePage login button
    And user enters a "qdInvalidUserName" to emailTextBox
    And user enters a "qdInvalidPassword" to passwordTextBox
    And user click on loginPage login button
    And test that user could not be able to login
    And closes the page