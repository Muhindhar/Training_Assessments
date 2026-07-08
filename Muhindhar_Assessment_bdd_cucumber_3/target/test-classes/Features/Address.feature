Feature: Muhindhar_13-05-2026_Adding new address in the tutorials ninja site
Description: Adding the new address in the tutorialsninja site 

  Background:
    Given user is on the homepage
    And user enters the valid credentials to login
    And user clicks on the Address book link

  @AddingAddress
  Scenario: verif to add new address 
    When user clicks on the new address button
    And user enters the details
      | firstname | lastname | address1    | city  | postcode | country | region     |
      | muhindhar | sv       | ashok nagar | salem | 636006   | India   | Tamil Nadu |
    And clicks on continue button
    Then user should be able to see the address
