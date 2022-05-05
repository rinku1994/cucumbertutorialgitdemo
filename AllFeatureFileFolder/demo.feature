Feature: Test Orange HRM Login page and home Page Functionality

  Scenario: Test Login page functionality
    Given user is on present on login page
    When user enter valid credentails
    Then user is on home page of application

  Scenario: test Home page Functionality
    Then validate user on home page by using title
    And validate user on home page by using Url
    And validate user on home page by using logo

  Scenario: test PIM Page functionality
    Given user is on pim page and click on add  button
    When create a new employee
    Then fillup more personal details
    And search user by using employee id
    Then delete newly created user
