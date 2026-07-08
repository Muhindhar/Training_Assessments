Feature: Muhindhar_13-05-2026_searching product in website
Description: Searching the product in website whether the product contains or not contains

  Background:
    Given the user is on homepage of tutorialsninja site

  @SearchProduct
  Scenario Outline: Verify product search using different keywords
    And user clicks on the search bar
    When user enters the product name as "<keyword>" and clicks search
    Then search result should "<result_status>" the product

    Examples:
      | keyword | result_status |
      | iPhone  | contain       |
      | Samsung | contain       |
      | hi      | not contain   |
