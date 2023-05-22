Feature: US1004 Using parameters in test steaps

  Scenario: TC04 We will create new methods where we can use parameters

#    If we want to create a dynamic method we can enter parameters when we create the method
#    we should enter parameter between double quats

#    After preparing the methods names we need to create them in a stepDefinition class
#    To create them there are a few ways

#    1) we can come over it and create the method from popup message
#    2) we can run the test and system will print missing methods on colse so we can get the methods from the console

#    This will create a parameter gate which can receive value from method text
#    so we can change the parameter and use the method




    Given user goes to amazon homepage
    And user searchs for "Java" in search box
    Then tests that result text contains "Java" word
    Then closes the page

  Scenario: TC05 searches for TeaPot

    Given user goes to amazon homepage
    And user searchs for "Apple" in search box
    Then tests that result text contains "Apple" word
    Then closes the page

  Scenario: TC06 searches for Flower

    Given user goes to amazon homepage
    And user searchs for "TV" in search box
    * tests that result text contains "TV" word
    * closes the page
