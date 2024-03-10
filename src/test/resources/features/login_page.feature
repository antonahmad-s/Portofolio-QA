@login
Feature: WebDriver University - Login Page

  Scenario Outline: validate - login as a registered and unregistered user
    Given user access the webDriver university login page
    When user enter a username <username>
    And user enter a password <password>
    And user click on the button login
    Then user should be presented with a validation <status>

    Examples:
      | username   | password       | status               |
      | webdriver  | webdriver123   | validation succeeded |
      |            |                | validation failed    |
      | webdriver  |                | validation failed    |
      | tester123  |                | validation failed    |
      |            | webdriver123   | validation failed    |
      |            | tester1456     | validation failed    |
      | myporto123 | myportopass123 | validation failed    |
