Feature: Add To Cart Test

@ScenarioAddToCart
Scenario: Add one quantity from store
Given I am on store page
When I add a "Blue Shoes" to cart
Then I should see 1 "Blue Shoes" in the cart
