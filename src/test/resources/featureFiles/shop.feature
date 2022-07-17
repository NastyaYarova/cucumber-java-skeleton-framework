Feature: Automated End2End Tests
  Description: The purpose of this feature is to test End 2 End integration.

#  Scenario Outline: Customer place an order by purchasing an item from search
#    Given user is on Home Page
#    Then check page "Home Page" was opened
#    When user search for "dress"
#    And choose to buy the first item with parameters: "white", "medium"
#    And moves to checkout from mini cart
#    And enter "<customer>" personal details on checkout page
##    And select same delivery address
##    And select payment method as "check" payment
#    And place the order
#    Then verify the order details
#    Examples:
#      | customer |
#      | Lakshay  |

  @Smoke @Regression
  Scenario: Customer able to open Home page
    Given user is on Home Page
    Then check page "Home Page" was opened

  @Regression
  Scenario: Customer able to open Home page yep
    Given user is on Home Page
    Then check page "Home Page" was opened

  Scenario: Customer able to open Home page one more time
    Given user is on Home Page
    Then check page "Home Page" was opened