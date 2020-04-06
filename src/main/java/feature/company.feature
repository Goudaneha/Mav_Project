Feature: Company title test

Scenario Outline: Verify company name

Given user is on search page "<Test summary>"
When user enters valid "<company name>"
Then user clicks on "<search>" button 
Then user navigates to "<Company Home page>"

Examples:
|Test summary        |company name   |search|Company Home page|status|
|valid company name  |maveric systems|search|Home page        |pass  |
|Invalid company name|  			 |search|Home page        |fail  |