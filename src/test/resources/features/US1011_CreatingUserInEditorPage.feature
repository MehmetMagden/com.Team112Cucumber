@US1011 @p1
Feature: US1011 Creating Users


  Scenario Outline: TC16 Creating a lot of users in editor page

    Given user goes to "editorUrl" homepage
    Then user clicks on new button
    Then user enters "<firstName>" to firstName box
    Then user enters "<lastName>" to lastName box
    Then user enters "<position>" to position box
    Then user enters "<office>" to office box
    Then user enters "<extension>" to extension box
    Then user enters "<startdate>" to startdate box
    Then user enters "<salary>" to salary box
    And user clicks on create button
    And user sends the "<firstName>" to search box
    Then tests that user's "<firstName>" is in the list
    Then closes the page



    Examples:
      | firstName | lastName | position  | office | extension | startdate  | salary |
      | Ahmet     | Brown    | QA        | USA    | Canada    | 2023-05-03 | 2500   |
      | Hasan     | Yellow   | Director  | Eu     | Eng       | 2023-05-05 | 3000   |
      | Murat     | Black    | Developer | Eu     | TR        | 2022-05-03 | 3500   |
      | Ali       | Can      | QA        | USA    | Canada    | 2021-05-03 | 2500   |
      | Ayse      | Flower   | QA        | USA    | Tex       | 2023-05-03 | 4000   |
      | Elcin     | Brown    | QA        | USA    | Canada    | 2023-05-03 | 2500   |



