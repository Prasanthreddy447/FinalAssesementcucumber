Feature: Conduit Article CRUD Functions

Scenario: Login into App
Given user is on login page
When User provides "username" and "password"
Then user should be on home page

Scenario: Create new Article
Given user should be on new Article page
When user enters Article details
| title 					 | Desc                   | Content 						 | Tag |
| prasanth negative| Article about Prasanth | I am working in TCS| Good|
Then Article must give message "Title already exists.."
#But Article must give message "Title already exists.. "