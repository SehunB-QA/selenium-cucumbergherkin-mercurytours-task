#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Make a account and sign in on MercuryTours
  I want to use this template for my feature file

  @tag1
  Scenario: Make an account and sign in with the account on MercuryTours
    Given I can access "www.demo.guru99.com/test/newtours/"
    And I navigate to the register page link
    When I make account on the website
    And i go to login with the same account details
    Then I should have logged in successfully with this "Login Successfully" text displayed 
   


