@smoke
Feature: Wikipedia error screen

  As a regular user of the Wikipedia application, I want to be able check error screen.

  @smoke
  @regression
  Scenario: check error Screen & go back to welcome screen
    Given user open application
    When welcome screen ready
    Then user can see Explore icon
    When user tap on the search field
    And user types in Search field 'Open AI' text
    And user can see suggestion text
    And user scroll to view with 'Television series' and click
    When user checks error text
    When user clicks on back button
    Then user can see Explore icon
