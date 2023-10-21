Feature: Login Web HRM
  #TCC.HRM.052
  Scenario: Input Data Vacancy
    Given User login
    When  User click menu Recruitment
    And User click tab vacancies
    And User click button add
    And User input vacancy name
    And User input job title
    And User input hiring manager
    And User click button save
    Then User get text message successfull