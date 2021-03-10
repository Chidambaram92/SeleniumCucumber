
Feature: Login Page Feature

  Scenario: Test Case One for Login Page
    Given I want to launch the page of Info Site
    And I login to Demo login page
    When I enter the credentials in Login Page
    And I click on Login button
    Then I validate if Home page is displayed
 
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
