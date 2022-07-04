Feature: Login feature
  This feature ....
  @Smoke
  Scenario: Login with right username and password
    Given Go to home page
    When I write username
    And I write password
    And I click on login button
    Then I should see my profile

  Scenario: Login with username and password
    Given Go home page2
    When I write username YuriGagarin
    And I write password strongPassword
    And I click on login
    Then I logged in

  Scenario: Login username and password      // chi ashxadi
    Given Go to home page3
    When I write username plus password
      | username | password |
      | U1       | P1       |
      | U2       | P2       |
      | U3       | P3       |
    And I click on login
    Then I logged in

  Scenario Outline: Login username & password
    Given Go home
    When I write "<username>" and "<password>"
    And I click on login
    Then I logged in
    Examples:
      | username | password |
      | U1       | P1       |
      | U2       | P2       |
      | U3       | P3       |