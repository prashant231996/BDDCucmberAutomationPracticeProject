Feature: Add To Cart
@scenario2
Scenario Outline: Add To Cart From Store Page
Given I am on Store Page
When I add a "<product_Name>" in cart
Then I see <quantity> Blue Shoes in Cart
Then I see successfull message on screen.

Examples:
|"product_Name"|quantity|
|"Blue Shoes"  |1         |
|"Blue Shoes"  |2         |

Scenario Outline: Add To Cart From Product Page
Given I am on Product Page
When I add a "<product_Name>" in cart
Then I see <quantity> Blue Shoes in Cart
Then I see successfull message on screen.

Examples:
|"product_Name"|quantity|
|"Blue Shoes"  |1         |
|"Blue Shoes"  |2         |

Scenario: Add To Cart NegativeScenario
Given I am on Product Page/Store Page
When I add a "<product_Name>" in cart
When I enter 0 in quantity field
Then Erro message should be displayed as "Quantity should be greater than 0"
When I press up arrow of quantity
Then quantity should increase
When I press down arrow of quantity
Then quantity should decrease



