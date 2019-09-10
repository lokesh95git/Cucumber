Feature: AddTariffPlan

  Scenario: 
    Given User should be in the telecom home pagess
    And click add tariff buttons
    When User enter all the datasss
    And click on submit buttonss
    Then user should be displayed home button is enteredd

  Scenario: 
    Given User should be in the telecom home pagess
    And click add tariff buttons
    When User enter all the datasss.
      | 6995 | 120 | 120 | 100 | 1 | 1 | 1 |
    And click on submit buttonss
    Then user should be displayed home button is enteredd

  Scenario: 
    Given User should be in the telecom home pagess
    And click add tariff buttons
    When User enter all the datassss.
      | rent    | 6995 |
      | freeloc |  120 |
      | freeint |  120 |
      | freesms |  100 |
      | locchr  |    1 |
      | intchr  |    1 |
      | sms     |    1 |
    And click on submit buttonss
    Then user should be displayed home button is enteredd
