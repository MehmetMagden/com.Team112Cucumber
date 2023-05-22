
Feature: How to use Configuration Properties File

#  To reach any value from configuration.properties file we need to use parameters.Scenario:
#  Then in the method we use that parameter to get the value from configuration.properties file


  Scenario: TC07 User goes to Amazon and tests that has been reached amazon.com

    Given user goes to "amazonUrl" homepage
    Then tests that Url has "amazon" word
    Then closes the page


  Scenario: TC08 User goes to Amazon and tests that has been reached amazon.com

    Given user goes to "wqUrl" homepage
    Then tests that Url has "wisequarter" word
    Then closes the page

  Scenario: TC09 User goes to Amazon and tests that has been reached amazon.com

    Given user goes to "facebookUrl" homepage
    Then tests that Url has "facebook" word
    Then closes the page