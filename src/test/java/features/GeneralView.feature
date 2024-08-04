@Regression
Feature: General View

  Scenario: Validate general user is able to view products without logging in
    Given User navigates to the Online products page
    When User clicks on Formal Shoes drop down
    Then User should be able to view the Products