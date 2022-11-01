@titleVerification
Feature: Etsy Title Verification
  User story: As a user, when I am on Etsy page
  I should be able to see title as expected

  Background:
    Given user is on Etsy home page


  Scenario: Etsy home page title verification
    Then user should see title is as expected


  Scenario: Etsy Search Functionality Title Verification
      When user types Wooden Spoon in the search box
      And user clicks search button
      Then user sees Wooden Spoon is in the title


  Scenario: Etsy Search Functionality Title Verification
       When user types "Bags" in the search box
       And user clicks search button
       Then user sees "Bags" is in the title