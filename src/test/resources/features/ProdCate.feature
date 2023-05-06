Feature: Product Category

  Scenario: POST category want to create a new category
    Given I set endpoint for categorry
    And I success login with valid account
    When I input the token authorization
    And I send request to endpoint category
    Then get status code 200 product category
    And I saw new category response

  Scenario: GET CATEGORY get all categories
    Given I set endpoint for categorry
    When Iam send request categorry
    Then get status code 200 product category
    And I see all category