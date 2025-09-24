Feature: Login functionality 

@loginFeature
Scenario Outline: Verify logging into the Application using valid credentials

Given User is on homepage and opening my account by clicking login 
When User should enter <email> address and <password>
And User should click on login
Then User should be navigated to login page
And User should be taken to myAccount page

Examples: 
| email | password |
| pavanhiware11@gmail.com | Pavan@7218 |

@loginFeature @smokeTest
Scenario Outline: Verify logging into the Application using invalid credentials

Given User is on homepage and opening my account by clicking login 
When User should enter <email> address and <password>
And User should click on login
Then User should be navigated to login page
And User should be taken to myAccount page

Examples: 
| email | password |
| xyzabc123@gmail.com | xyzabc123 |

@loginFeature
Scenario Outline: Verify logging into the Application using valid email and invalid password

Given User is on homepage and opening my account by clicking login 
When User should enter <email> address and <password>
And User should click on login
Then User should be navigated to login page
And User should be taken to myAccount page

Examples: 
| email | password |
| pavanhiware11@gmail.com | xyzabc123 |




