Feature: Login Web HRM
  #TCC.HRM.001
  Scenario: Login Valid Test
    Given User enter url HRM
    When  User input valid username
    And User input valid password
    And User click button login
    Then User get text title page dashboard

  #TCC.HRM.002
  Scenario: Login with Password Invalid Test
    Given User logout
    When  User input valid username
    And User input invalid password
    And User click button login
    Then User get text invalid credential

    #TCC.HRM.003
  Scenario: Login with Empty Password Test
    Given User input valid username
    And User input empty password
    And User click button login
    Then User get text required