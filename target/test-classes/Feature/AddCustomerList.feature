Feature: AddCustomerList

  Scenario: 
    Given User should be in the telecom home pages
    And click add customer buttons
    When User enter all the datas
    And click on submit buttons
    Then user should be displayed customer id is enteredd

  Scenario: 
    Given User should be in the telecom home pages
    And click add customer buttons
    When User enter all the datas.
      | karthi | rajan | rajan@gmail.com | chennai | 6030025890 |
    And click on submit buttons
    Then user should be displayed customer id is enteredd

  Scenario: 
    Given User should be in the telecom home pages
    And click add customer buttons
    When User enter all the datass.
      | fname   | karthi          |
      | lname   | rajan           |
      | email   | rajan@gmail.com |
      | address | chennai         |
      | phno    |      6030025890 |
    And click on submit buttons
    Then user should be displayed customer id is enteredd
