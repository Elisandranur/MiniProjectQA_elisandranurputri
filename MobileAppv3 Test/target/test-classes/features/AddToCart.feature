Feature: As a user i have be able choose product and  fill my cart

  Scenario: User able to add some product to cart
    Given Im on the Home page
    When I click Beli1
    And I click Beli2
    Then Number of product in cart increase