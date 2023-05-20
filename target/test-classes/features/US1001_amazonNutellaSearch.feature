Feature: US 1001 User will search for Nutella in Amazon

  Scenario: TC01 User will search for Nutella

    Given user goes to amazon homepage
    Then user searchs for Nutella in search box
    And tests that result text contains Nutella word
    Then closes the page



#    in feature section we need enter user story
#   in scenario we should write the test case
