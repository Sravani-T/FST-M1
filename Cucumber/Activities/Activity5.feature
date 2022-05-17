@activity5
Feature: Data driven test with Example

  Scenario Outline: Testing with Data from Scenario
    Given User on Login page
    When "<Usernames>" and "<Passwords>"
    Then page title and confirmation message
    And Quit Browser

    Examples:
      | Usernames | Passwords |
      | admin     | password  |
      | adminUser | Password  |