Feature: OpenMRS application

  Background: 
    Given user should login

  Scenario: verify find patient record
    Then user click on find patient record
    Then user should navigate to find patient record page

  Scenario: verify find patient details
    Then user click on find patient record
    Then user can get patient details(By table header)
@fifth
  Scenario Outline: verify find particular patient details
    Then user click on find patient record
    Then user can get particular patient details "<details>"

    Examples: 
      | details     |
      | 100HRU      |
      | Mary C Jane |
      | F           |
      |          39 |
      | 03.Jul.1983 |

  Scenario: verify find patient record by id
    Then user click on find patient record
    Then user enter patient id in search box
    Then user can get particular patient detail

  Scenario: verify find patient record by id
    Then user click on find patient record
    Then user enter patient id in search box
    Then user can get particular patient detail

  Scenario: verify find patient details
    Then user click on find patient record
    Then user enter patient id in search box
    Then user can get particular patient detail
    Then user able to see the health description

  
Scenario: verify Active Visits
    Then user should click on Active Visits
    Then user should navigate to Active Visits page

  Scenario: verify Active Visits Search field
    Then user should click on Active Visits
    Then user should navigate to Active Visits page
    Then user enter value into the search field
    Then user can see the search results

  Scenario: verify Active Visits header count
    Then user should click on Active Visits
    Then user should navigate to Active Visits page
    Then user can see the header details

 
  Scenario Outline: verify Active Visits header details
    Then user should click on Active Visits
    Then user should navigate to Active Visits page
    Then user can see the header details as "<details>"
    Then user can get the particular patient details

    Examples: 
      | details                 |
      | OpenMRS ID: 100HRU      |
      | Chris Soo-Jin Demetriou |
      | Admission               |
      | Facility Visit          |
  
  Scenario: verify Capture Vitals
    Then user should click on Capture Vitals
    Then user should navigate to Capture Vitals page

  
  Scenario: verify Capture Vitals search field
    Then user should click on Capture Vitals
    Then user should pass the value in search field
    Then user can get search results

     
  Scenario Outline: verify Capture Vitals search field details
    Then user should click on Capture Vitals
    Then user can get search results as "<details>"
    Then user should able to see the patient details
    
    Examples:
    |details|
    |100HRU|
    |Chris Soo-Jin Demetriou|
    |M|
    |23|
    
    Scenario: verify Register_apatient 
    Then user should click on Register_apatient
    Then user should navigate to Register_apatient page

    @thrid 
  Scenario: verify Register patient details
    Then user click on Register patient
    Then user enter the given and family name
    Then user click on next button
    Then user need to select gender
    Then user click on next button
    Then user need to enter tha patient birth day details
    Then user click on next button
    Then user need to enter the patient address
    Then click on confirm button
    Then user should navigate to particular page and patient id will be created
    |29 Feb 2000|
    
    Scenario: verify Appointment Scheduling
    Then user should click on Appointment Scheduling
    Then user should navigate to Appointment Scheduling page

  Scenario: verify Manage Service Types
    Then user should click on Appointment Scheduling
    Then user should click on Manage Service Types
    Then user should navigate to Manage Service Types page

  Scenario: verify Manage Service table header
    Then user should click on Appointment Scheduling
    Then user should click on Manage Service Types
    Then user should navigate to Manage Service Types page
    Then user able to see Manage Service table header

  Scenario: verify  Manage Appointment Blocks
    Then user should click on Appointment Scheduling
    Then user should click on  Manage Appointment Blocks
    Then user should navigate to  Manage Appointment Blocks page

  Scenario: verify  Manage Appointments
    Then user should click on Appointment Scheduling
    Then user should click on  Manage Appointments
    Then user should navigate to Manage Appointments page

  Scenario: verify Daily Appointments
    Then user should click on Appointment Scheduling
    Then user should click on Daily Appointments
    Then user should navigate to Daily Appointments page

  Scenario: verify Appointment Requests
    Then user should click on Appointment Scheduling
    Then user should click on Appointment Requests
    Then user should navigate to Appointment Requests page
    
    Scenario: verify patient reports
    Then user click on reports
    Then user should navigate to reportpage

  Scenario: verify patient reports
    Then user click on reports
    Then user should navigate to particular page
    Then user can see the text
    
    Scenario: verify data management
    Then user click on data management
    Then user should navigate to data management page

 
  Scenario: verify data management detail
    Then user click on data management
    Then user should navigate to data management page
    Then should click on Merge Patient Electronic Records
    Then user should navigate to Merge Patient Electronic Records page
    
  
  Scenario: verify data management detail header test
    Then user click on data management
    Then user should navigate to data management page
    Then should click on Merge Patient Electronic Records
    Then user should navigate to Merge Patient Electronic Records page
    Then can see header test
    
    Scenario: verify Configure metadata
    Then user should click on Configure_metadata
    Then user should navigate to Configure_metadata page

  
  Scenario Outline: verify Configure metadata header count
    Then user should click on Configure_metadata
    Then user able to see metadata information  as "<details>"

    Examples: 
      | details              |
      | Concepts             |
      | Encounters           |
      | Forms                |
      | Locations            |
      | Patients             |
      | Providers            |
      | Roles And Privileges |
      | Visits               |
  
   Scenario: verify Manage Encounter Types table count
   Then user should click on Configure_metadata
    Then user should click on Manage Encounter Types
    Then user should navigate to Manage Encounter Types
    Then user able to see Manage Encounter Types table information    
    
  
   Scenario: verify Manage Forms table header
   Then user should click on Configure_metadata
    Then user should click on Manage Forms
    Then user should navigate to Manage Forms
    Then user able to see Manage Forms table information  
    
    
   Scenario: verify Manage Locations
   Then user should click on Configure_metadata
    Then user should click on Manage Locations
    Then user should navigate to Manage Locations
    Then user able to see Manage Locations table details
    
     @fourth
   Scenario: verify Manage Patient Identifier Types
   Then user should click on Configure_metadata
    Then user should click on Manage Patient Identifier Types
    Then user should navigate to Manage Patient Identifier Types
    Then user able to see Manage Patient Identifier Types table details
      
    Scenario: verify System Administration
    Then user should click on System Administration
    Then user should navigate to System Administration page

  @sixth
  Scenario: verify System Administration
    Then user should click on System Administration
    Then user should navigate to System Administration page
    Then user able to see available Administration links

  Scenario: verify System Administration
    Then user should click on System Administration
    Then user should click on Manage Extensions
    Then user should navigate to Manage Extensions page

  Scenario: verify Manage Extensions table header
    Then user should click on System Administration
    Then user should click on Manage Extensions
    Then user should navigate to Manage Extensions page
    Then user is able to see Manage Extensions table header

  Scenario: verify Manage Apps
    Then user should click on System Administration
    Then user should click on Manage Apps
    Then user should navigate to Manage Apps page

  Scenario: verify Manage Apps table header
    Then user should click on System Administration
    Then user should click on Manage Apps
    Then user should navigate to Manage Apps page
    Then user able to see Manage Apps table header

  Scenario: verify Manage Global Properties
    Then user should click on System Administration
    Then user should click on Manage Global Properties
    Then user should navigate to Manage Global Properties page

  Scenario: verify Manage Accounts
    Then user should click on System Administration
    Then user should click on Manage Accounts
    Then user should navigate to Manage Accounts page

  Scenario: verify Manage Accounts table header
    Then user should click on System Administration
    Then user should click on Manage Accounts
    Then user should navigate to Manage Accounts page
    Then user able to see Manage Accounts table header

  Scenario: verify Style Guide
    Then user should click on System Administration
    Then user should click on Style Guide
    Then user should navigate to Style Guide page

  Scenario: verify Style Guide header
    Then user should click on System Administration
    Then user should click on Style Guide
    Then user able to see Style Guide page header

  Scenario: verify Advanced Administration
    Then user should click on System Administration
    Then user should click on Advanced Administration
    Then user should navigate to Advanced Administration page

  Scenario: verify Advanced Administration
    Then user should click on System Administration
    Then user should click on Advanced Administration
    Then user should navigate to Advanced Administration page
    Then user able to see Advanced Administration header
    
    
    