@Login
Feature: User able to see Home Page

  Scenario: POST LOGIN  success to login with valid data
    Given I set endpoint for login
    When Iam send POST HTTP request for valid data
    Then seeing status code 200
    And get validation data and token

  Scenario: POST LOGIN should failed to login with invalid data
    Given I set endpoint for login
    When Iam send POST HTTP request for invalid data
    Then get the status code 400
    And  get error message for failed login

  @Register

  Scenario: POST REGISTER success to create account with valid input
    Given Iam set endpoint for register
    When I send created account with valid data input
    Then get status code 200 after send register
    And I see new detail account

  @invalid-register
  Scenario: POST REGISTER failed to create account with empty fullname
    Given Iam set endpoint for register
    When I send HTTP request with empty FULLNAME data register
    Then I see status code 400