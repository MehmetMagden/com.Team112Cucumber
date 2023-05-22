@wip
Feature: US1009 To test more than one data, use Scenario Outline

  Scenario Outline: TC14 amazon Search Test

    Given user goes to "amazonUrl" homepage
    Then searches for "<Items>" in amazon searchBox
    And tests that result text contains "<Item>" words
    Then closes the page

    Examples:
      | Java        |
      | Apple       |
      | Math        |
      | Samsung     |
      | Tv          |
      | GPU         |
      | PowerSupply |