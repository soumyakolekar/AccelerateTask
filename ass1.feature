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
Feature:   I want it for my feature file
 

  @tag1
  Scenario: Create a BDD sc
    Given API for foreign exchange
    When posted with correct Information
    Then validate positive response code received


  #@tag2
  #Scenario: Create date sc
    #Given Set http Request
    #When To get date & time
    #Then print the response into console

