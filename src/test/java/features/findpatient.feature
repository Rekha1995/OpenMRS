#Feature: OpenMRS application
#
  #Background: 
    #Given user should login
#
  #Scenario: verify find patient record
    #Then user click on find patient record
    #Then user should navigate to find patient record page
#
  #Scenario: verify find patient details
    #Then user click on find patient record
    #Then user can get patient details(By table header)
#@fifth
  #Scenario Outline: verify find particular patient details
    #Then user click on find patient record
    #Then user can get particular patient details "<details>"
#
    #Examples: 
      #| details     |
      #| 100HRU      |
      #| Mary C Jane |
      #| F           |
      #|          39 |
      #| 03.Jul.1983 |
#
  #Scenario: verify find patient record by id
    #Then user click on find patient record
    #Then user enter patient id in search box
    #Then user can get particular patient detail
#
  #Scenario: verify find patient record by id
    #Then user click on find patient record
    #Then user enter patient id in search box
    #Then user can get particular patient detail
#
  #Scenario: verify find patient details
    #Then user click on find patient record
    #Then user enter patient id in search box
    #Then user can get particular patient detail
    #Then user able to see the health description
#
  #
