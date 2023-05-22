Feature: US 1002 Tea Pot Search

  Scenario: TC02 User will search for Tea Pot in Amazon

    Given user goes to amazon homepage
    Then user searchs for TeaPot in search box
    And tests that result text contains TeaPot word
    Then closes the page