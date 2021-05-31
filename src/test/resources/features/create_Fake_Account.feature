Feature: Create an account
  @FakeNames
  Scenario: landed on page with SignUp window, enter personal info and create an account
    Given The user is on the homepage
    When The user navigates to Create Account page
    And The user passes the valid info and clicks on Sign Up
    Then The user should get message of success registration


