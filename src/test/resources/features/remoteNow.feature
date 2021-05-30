Feature: Make an appointment remotely right now
  Scenario: Close pop up page
    Given The user launch a browser
    When The user clicks on the button "Accept"
    Then The user is on the home page

  Scenario: Verify Order Info Page
    Given The user launch a browser
    When The user clicks on the button "Accept"
    Then The user is on the home page
    When The user click on the "Remote Notarization"
    Then The user is on services page
    When The user clicks on "Now"
    Then The page contains "Order Info"




