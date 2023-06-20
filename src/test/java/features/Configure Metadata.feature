#Feature: OpenMRS application
#
  #Background: 
    #Given user should login
#
  #Scenario: verify Configure metadata
    #Then user should click on Configure_metadata
    #Then user should navigate to Configure_metadata page
#
  #
  #Scenario Outline: verify Configure metadata header count
    #Then user should click on Configure_metadata
    #Then user able to see metadata information  as "<details>"
#
    #Examples: 
      #| details              |
      #| Concepts             |
      #| Encounters           |
      #| Forms                |
      #| Locations            |
      #| Patients             |
      #| Providers            |
      #| Roles And Privileges |
      #| Visits               |
  #
   #Scenario: verify Manage Encounter Types table count
   #Then user should click on Configure_metadata
    #Then user should click on Manage Encounter Types
    #Then user should navigate to Manage Encounter Types
    #Then user able to see Manage Encounter Types table information    
    #
  #
   #Scenario: verify Manage Forms table header
   #Then user should click on Configure_metadata
    #Then user should click on Manage Forms
    #Then user should navigate to Manage Forms
    #Then user able to see Manage Forms table information  
    #
    #
   #Scenario: verify Manage Locations
   #Then user should click on Configure_metadata
    #Then user should click on Manage Locations
    #Then user should navigate to Manage Locations
    #Then user able to see Manage Locations table details
    #
     #@fourth
   #Scenario: verify Manage Patient Identifier Types
   #Then user should click on Configure_metadata
    #Then user should click on Manage Patient Identifier Types
    #Then user should navigate to Manage Patient Identifier Types
    #Then user able to see Manage Patient Identifier Types table details
      #
