Feature: Place an order

Scenario: using default payment option

Given I am guest customer
And I have product in cart
And I am on the checkout page
When I provide billing details
And I place an order
Then The order should be placed successfully