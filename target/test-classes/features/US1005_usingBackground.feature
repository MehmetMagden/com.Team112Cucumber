Feature: US1004 Using parameters in test steaps

#  IF you are planing to use same steps at the begining of each Scenario
#  you can use Background
# Whatever method you use here will be executed before each Scenario
#  So we dont need to write same begining steps again and again in each Scenario

  Background: Before each Scenario this method will be executed
    Given user goes to amazon homepage

  Scenario: TC04 We will create new methods where we can use parameters

    And user searchs for "Java" in search box
    Then tests that result text contains "Java" word
    Then closes the page

  Scenario: TC05 searches for TeaPot

    And user searchs for "Apple" in search box
    Then tests that result text contains "Apple" word
    Then closes the page

  Scenario: TC06 searches for Flower

    And user searchs for "TV" in search box
    * tests that result text contains "TV" word
    * closes the page
