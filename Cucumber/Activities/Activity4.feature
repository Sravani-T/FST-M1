@activity4
Feature: Data driven test without Example

  Scenario: Testing with Data from Scenario
    Given Login page
    When Enter "admin" and "password"
    Then Read  page title and confirm message
    And Quit the Browser