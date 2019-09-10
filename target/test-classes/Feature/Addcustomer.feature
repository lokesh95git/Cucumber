Feature: AddCustomer

  Scenario: 
    Given User should be in the telecom home page
    And click add customer button
    When User enter all the data
    And click on submit button
    Then user should be displayed customer id is entered
