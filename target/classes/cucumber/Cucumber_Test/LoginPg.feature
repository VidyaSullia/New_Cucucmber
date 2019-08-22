
@tag
Feature: User check the login functionality
  @tag1
  Scenario: User check the login page
    Given User launch facebook application
    And User check url and title
    When User enter username
    And User enter password
    And User click loginbutton
    Then User check navigate correct url or not
    And User close the browser
  
