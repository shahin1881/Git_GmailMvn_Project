Feature: Login into facebook account

Scenario: Login into facebook account
Given User is on facebook login page
When User enters username as Password
  |	Username	|	Password	|
  | 7410113240  |   rani8421@#   |

When User clicks on signIn button
Then login should be successful

#@SeleniumTest
Scenario: UploadPhoto into facebook account
Given click on Profile Button
When click on EditProfile Button
Then User click on UploadPhoto button
Then User click on Save Buttton
