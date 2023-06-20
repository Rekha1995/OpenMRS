#Feature: OpenMRS headerpage application
#
  #Background: 
    #Given user Enter the username as admin and password as Admin123
    #When user click session link Isolation Ward
    #When user click  on login
    #Then user click on my account
#
  #Scenario: verify My account
    #Then user can see details
#
  #Scenario: verify change password
    #Then user click on change password
    #Then user enter old pwd
    #Then user enter new pwd
    #Then user enter confirm pwd
    #Then user click on save
    #Then user can get update
#
  #Scenario Outline: verify My Languages
    #Given user click on My Languages
    #Then user select primary language as "<primarylanguage>"
    #Then user select proficient language as "<proficientlanguage>"
    #Then user click save
    #Then user can get update msg
#
    #Examples: 
      #| primarylanguage          | proficientlanguage       |
      #| English (United Kingdom) | English (United Kingdom) |
      #| Spanish                  | Spanish                  |
      #| French                   | French                   |
      #| Italian                  | Italian                  |
      #| Portuguese (Brazil)      | Portuguese               |
