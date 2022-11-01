Feature: Wikipedia Search Functionality And Verifications

  Background:
    Given user is on Wikipedia home page

  @title
  Scenario: Wikipedia Search Functionality Title Verification
  When user types "Steve Jobs" in the wiki search box
  And user clicks wiki search button
  Then user sees "Steve Jobs" is in the wiki title

  @header
  Scenario: Wikipedia Search Functionality Header Verification
  When user types "Steve Jobs" in the wiki search box
  And user clicks wiki search button
  Then user sees "Steve Jobs" is in the main header

  @imageHeader
  Scenario: Wikipedia Search Functionality Image Header Verification
  When user types "Steve Jobs" in the wiki search box
  And user clicks wiki search button
  Then user sees "Steve Jobs" is in the image header

  @scenarioOutlinePractice
  Scenario Outline: Wikipedia Search Functionality Title Verification with using DDT
  When user types "<searchValue>" in the wiki search box
  And user clicks wiki search button
  Then user sees "<expectedTitle>" is in the wiki title

    Examples:
    |searchValue       |expectedTitle     |
    |Steve Jobs        |Steve Jobs        |
    |Bill Gates        |Bill Gates        |
    |Cristiano Ronaldo |Cristiano Ronaldo |
    |Messi             |Messi             |
    |Chuck Norris      |Chuck Norris      |