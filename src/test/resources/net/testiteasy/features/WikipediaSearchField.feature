@smoke
Feature: Wikipedia search field

  As a regular user of the Wikipedia application, I want to be able to search information.

  @smoke
  @regression
  Scenario: search for Open IA
    Given user open application
    When welcome screen ready
    Then user can see Explore icon
    When user tap on the search field
    And user types in Search field 'Open AI' text
    And user can see suggestion text
    And user scroll to view with 'Television series' and click
