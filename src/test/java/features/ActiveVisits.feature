#Feature: OpenMRS application
#
  #Background: 
    #Given user should login
#
  #Scenario: verify Active Visits
    #Then user should click on Active Visits
    #Then user should navigate to Active Visits page
#
  #Scenario: verify Active Visits Search field
    #Then user should click on Active Visits
    #Then user should navigate to Active Visits page
    #Then user enter value into the search field
    #Then user can see the search results
#
  #Scenario: verify Active Visits header count
    #Then user should click on Active Visits
    #Then user should navigate to Active Visits page
    #Then user can see the header details
#
 #
  #Scenario Outline: verify Active Visits header details
    #Then user should click on Active Visits
    #Then user should navigate to Active Visits page
    #Then user can see the header details as "<details>"
    #Then user can get the particular patient details
#
    #Examples: 
      #| details                 |
      #| OpenMRS ID: 100HRU      |
      #| Chris Soo-Jin Demetriou |
      #| Admission               |
      #| Facility Visit          |
