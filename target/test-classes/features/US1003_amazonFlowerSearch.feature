Feature: US 1003 Amazon Flower Search

  Scenario: TC03 User will search for flower in amazon

    Given user goes to amazon homepage
    And user searchs for Flower in search box
    Then tests that result text contains Flower word
    Then closes the page