Feature: AddCustomerLists2D

  Scenario: 
    Given User should be in  telecom home pages
    And click add customer buttons..
    When User enters all  datass.
    And click on submits button.
    Then user should been displayed customer id is enteredd.

   Given User should be in  telecom home pages
    And click add customer buttons..
    When User enters all  datasss.
      | karthi   | rajan   | rajan1@gmail.com | chennai  | 6030025890 |
      | karthic  | rajann  | rajan2@gmail.com | tanjore  | 6030025891 |
      | karthik  | rajans  | rajan3@gmail.com | trichy   | 6030025892 |
      | karthick | rajanss | rajan4@gmail.com | bangaore | 6030025893 |
    And click on submits button.
    Then user should been displayed customer id is enteredd.

  Given User should be in  telecom home pages
    And click add customer buttons..
    When User enters all  datas.
      | fname    | lname   | email            | address  | phno       |
      | karthi   | rajan   | rajan1@gmail.com | chennai  | 6030025890 |
      | karthic  | rajann  | rajan2@gmail.com | tanjore  | 6030025891 |
      | karthik  | rajans  | rajan3@gmail.com | trichy   | 6030025892 |
      | karthick | rajanss | rajan4@gmail.com | bangaore | 6030025893 |
    And click on submits button.
    Then user should been displayed customer id is enteredd.
