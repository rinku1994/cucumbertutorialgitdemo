Feature: test facebook register functionality
Scenario: craete a new facebook account
Given user is on register page
When user enter first name and last name,
And user enter password and select Dob
Then account is sucessful created