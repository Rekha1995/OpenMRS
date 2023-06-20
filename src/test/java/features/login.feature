#Feature: OpenMRS loginpage application
#
  #@login
  #Scenario: login should be successfull
    #And user Enter the username as admin
    #And user Enter the password as Admin123
    #When user click session link Isolation Ward
    #When user clicks login button
    #Then User can login successfull
#
  #Scenario Outline: login should be Failed
    #And user Enter the username as "<Username>"
    #And user Enter the password as "<Admin123>"
    #When user click session link Inpatient Ward
    #When user clicks login button
    #Then User cannot login
#
    #Examples: 
      #| Username | password   |
      #| admined  | Admin123   |
      #| admin    | Admin12345 |
      #| admined  | Admin12345 |
#
  #Scenario: Location for this session
    #And user Enter the username as admin and password as Admin123
    #Then verify the count of links
#
  #Scenario: login should be fail
    #And user Enter the username as admin and password as Admin123
    #When user without click  on session link and clicks login button
    #Then User cannot logged login
#
  #Scenario: Location for the  particular session
    #And user Enter the username as admin and password as Admin123
    #When user click  on session link
    #When user clicks login button
    #Then user need to navigate to particular session
#
  #Scenario: verify cannot link button
    #Given user Enter the username as admin and password as Admin123
    #When user click session link Isolation Ward
    #When user click  on cannot link
    #Then user get updated msg
#
  #Scenario Outline: verify Location for the session
    #Given user Enter the username as admin and password as Admin123
    #When user click "<session>"
    #When user click login
    #Then user should navigate to particular session
#
    #Examples: 
      #| session           |
      #| Inpatient Ward    |
      #| Isolation Ward    |
      #| Laboratory        |
      #| Outpatient Clinic |
      #| Pharmacy          |
      #| Registration Desk |
#
  #@Logut
  #Scenario: verify Logut success
    #Given user Enter the username as admin and password as Admin123
    #When user click session link Isolation Ward
    #When user click  on login
    #Then user click on logut
    #Then logut success
