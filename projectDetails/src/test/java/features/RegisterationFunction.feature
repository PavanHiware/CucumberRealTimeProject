Feature: Register functionality 

@registerFeature
Scenario: Verify registering an account by providing only mandatory fields

Given User is on homepage and clicking on my account 
When User should register by providing first name "Rahul" and last name "Hiware" in mandatory fields 
And User should add email "rahulhware43@gmail.com" and telephone no "7218688193"
And User should provide password "Pavan#8901" and reconfirm it.
Then User should be logged in to account success page
And User should confirm email registerd

