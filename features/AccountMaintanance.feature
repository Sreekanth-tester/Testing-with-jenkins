@Account_Maintanance
Feature: NAMV10_Account

@Account_Creation
Scenario: Account
 Given User logs into the application using Chrome browser
 When User enters into Google website
 Then The title of the page should be "<ultimatix>"
 And User logs out from the site
 
