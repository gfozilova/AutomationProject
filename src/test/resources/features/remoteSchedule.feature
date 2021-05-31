
Feature: Make an appointment remotely schedule for future date

Background:
  Given  launch a browser
    Scenario: Close popping up page

    When   clicks on the button "Accept"
    Then The user is in the homepage



  Scenario: Verify Order Info Page

    When The user clicks on the button "Accept"
    When The user click on the "Remote Notarization"
    When The user clicks on "Schedule"
    Then The page contains "Order Info"

  Scenario:Fill up Order Info Page

    When The user clicks on the button "Accept"
    When The user click on the "Remote Notarization"
    When The user clicks on "Schedule"
    When The user click on the "Enter title of the document"
    When The user click on the "Increase number of documents to be notarized"
    When The user click on the "Decrease number of documents to be notarized"

  Scenario:Upload Documents

    When The user clicks on the button "Accept"
    When The user click on the "Remote Notarization"
    When The user clicks on "Schedule"
    When The user click on the "Enter title of the document"
    When The user click on the "Increase number of documents to be notarized"
    When The user click on the "Decrease number of documents to be notarized"
    When The user click on the "Upload your document"
    When The user click on the "Checkbox"
  Then The user click on the "Nextbutton"