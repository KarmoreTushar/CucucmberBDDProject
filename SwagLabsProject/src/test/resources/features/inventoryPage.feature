Feature: Verify Inventory Page add to cart functionality

  Background: 
    When User is already on login page

  #@Smoke @Regression
  Scenario: 
    When user enter username and password and click on login btn
    Then Verify that user is on inventory page
    When user click on add to cart button of Sauce Lab Backpack
    Then Verify that sauce Lab Backpack product is added to the cart
    And Click on continue shopping link
    Then Verify that user is on inventory page
