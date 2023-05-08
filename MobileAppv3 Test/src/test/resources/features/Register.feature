Feature: As a user i have be able to register new account so that i can login to buy product

  Scenario: User not able to register with existing data register
    Given Im on the login page
    And I click register account to registering new account
    When I fill the data register with already exist
    And I click register account to regist the new account
    Then I got message GAGAL on screen