Feature: Bank of America deposit

  Scenario: Deposit within allowed limit
    Given the following user account is created
    #Data tables in feature file -> are used to pass parameterized collection of values
    #If your step has more than one or two values to pass then it's better to use data tables
      | accountNumber | routingNumber |
      | 234523453245  | 123456789     |
      | 234523453123  | 222456789     |

