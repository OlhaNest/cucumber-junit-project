Feature: Amazon title verification
  User story: As a user, when I am on Amazon page
  I should be able to see title is as expected

  @amazonTitle
  Scenario: Etsy Search Functionality Title Verification
    Given user is on Amazon page
    When user should type "Bracelet" in the search box
    And user clicks a search button
    Then user should see "Bracelet" is in the title