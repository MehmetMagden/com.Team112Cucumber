
Feature: US1009 To test more than one data, use Scenario Outline

  Scenario Outline: TC14 amazon Search Test

    Given user goes to "amazonUrl" homepage
    Then searches for "<Items>" in amazon searchBox
    And tests that result text contains "<Items>" words
    Then closes the page


    Examples:
      | Items        |
      | Apple        |
      | Math         |
      | Samsung      |
      | Tv           |
      | GPU          |
      | Power Supply |