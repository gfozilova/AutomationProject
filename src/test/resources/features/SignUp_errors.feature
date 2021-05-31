Feature: Check all scenarios of unacceptable data
  @SignUP_real
  Scenario: Enter incorrect info or the similar to check the alerts and errors
    Given The user navigates to Create Account page to SignUp
    When Enter the ShortPassword info
    When Enter the duplicatePhone info
    When Enter the duplicateEmail info
    Then The user should get alert of incorrect or duplicate info