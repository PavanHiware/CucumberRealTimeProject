Feature: Forgot password functionality

@ForgetPasswordTest
Scenario Outline: Verify User is able to reset the password

Given User should open applicaton and nevigated to login page
When User should able to provide <email> on password change page by clicking on forgot password link
And User should receive email and confirm password change process
And User should provid new password
Then User should able to reset password
And User should be able to login with new password

Examples: 
| email |
| pavanHiware11@gmail.com |
| amotoori3@gmail.com |