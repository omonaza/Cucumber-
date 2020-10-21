Feature: Deposit some amount to the account.

  Scenario: Deposit amount within allowed range.
    #Precondition -> some setup that needs to happen for this scenario to execute
    #use in past tense
    Given User account with accountNumer 234523453245 and routing number 123456789 is opened
    #Action - execution of the functionality that being testing
    #Present tense
    When User deposits $1000
    #should be, should have
    Then User should have $1000 in account


  Scenario: Deposit within allowed range close to upper boundary
    Given User account with accountNumer 234523453212 and routing number 333456789 is opened
    When User deposits $9000
    Then User should have $9000 in account


  Scenario: Deposit amount is negative
    Given User account with accountNumer 234523453245 and routing number 123456789 is opened
    When User deposits $-1000
    Then User should have $0 in account


  Scenario: Deposit negative amount -1
    Given User account with accountNumer 234523453245 and routing number 123456789 is opened
    When User deposits $-1
    Then User should have $0 in account


  Scenario: Deposit above the max limit
    Given User account with accountNumer 234523453245 and routing number 123456789 is opened
    When User deposits $12000
    Then User should have $0 in account


  Scenario: Deposit 0
    Given User account with accountNumer 234523453245 and routing number 123456789 is opened
    When User deposits $0
    Then User should have $0 in account


  Scenario: Deposit the max
    Given User account with accountNumer 234523453245 and routing number 123456789 is opened
    When User deposits $10000
    Then User should have $10000 in account


  Scenario: Deposit multiple times within the range
    Given User account with accountNumer 234523453245 and routing number 123456789 is opened
    When User deposits $6000
    And User deposits $1000
    Then User should have $7000 in account


  Scenario: Deposit multiple times within the range approach 2
    Given User account with accountNumer 234523453245 and routing number 123456789 is opened
    When User deposits $6000
    Then User should have $6000 in account
    When User deposits $1000
    Then User should have $7000 in account









