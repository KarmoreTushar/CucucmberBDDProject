Feature: Login Functionality

  Scenario Outline: Verify login functionality with accepted username and password for all user
    When User is already on login page
    When user enter username from accepted "<username>" and "<password>" from password for all users
    Then Verify that the user is navigate to inventory page
    
Examples:
	|username|password|
	|standard_user|secret_sauce|
	|locked_out_user|secret_sauce|
	|problem_user|secret_sauce|
	|performance_glitch_user|secret_sauce|