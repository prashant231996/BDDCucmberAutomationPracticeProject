Feature: Add To Cart With Parameter Type

@PrameterTypeExample
Scenario Outline: Add to cart from store page
Given I am on strore page
When I add "<product_name>"  in cart
Then I see <quantity> quantity in cart
And Successfully added to cart message

Examples:
|product_name|quantity|
|Blue Shoes |1       |
|Jeans    |2       |