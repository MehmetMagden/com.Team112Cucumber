Feature: US1010 Negative Login test with a few InvalidUserMail and InvalidUserPassword


  Scenario Outline: TC15 Try to login with a lot of invalid userMail and password

    Given user goes to "qdUrl" homepage
    Then user click on qdHomePage login button
    And user enters "<InvalidEmail>" on loginpage email text box
    And user enters "<InvalidPassword>" on loginpage password text box
    And waitFor 1 seconds
    And user click on loginPage login button
    Then test that user could not be able to login
    And closes the page

    Examples:
      | InvalidEmail          | InvalidPassword      |
      | asdfasdf@asdf.com     | 654asdfasdEsdf.      |
      | asdsdfasdf@asdf.com   | 654aswerdfasdEsdf.   |
      | asdsdfasdf@asdsdf.com | 654aswerdfawesdEsdf. |
      | 234@asdsdf.com        | 654as234fawesdEsdf.  |
      | 234@as435sdf.com      | 654as234fa24Esdf.    |
      | 234@as432333df.com    | 654as23433Esdf.      |