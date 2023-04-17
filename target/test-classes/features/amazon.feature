Feature: Amazon title verifications
  User story: As a user, when I am on Amazon page
  I should be able to see title is as expected

  @amazonVerif
  Scenario: Etsy Search Functionality Title Verification
    Given user is on Amazon pages
    When user should type "Bracelet" in the search boxs
    And user clicks a search buttons
    Then user should see "Bracelet" is in the titles