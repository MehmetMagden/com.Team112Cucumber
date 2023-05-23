Feature: US1012 Website Wait Test
  @wip
  Scenario: TC17 User should wait to see buttons

    Given user goes to "herOkuAppUrl" homepage
    Then user clicks on addElement Button
    And user waits until delete button appears
    Then tests that delete button is visible
    And deletes delete button by clicking delete button
    Then tests that delete button is not visible