Feature: Conduit Article CRUD Functions

Scenario: Login into App
Given user is on login page
When User provides "username" and "password"
Then user should be on home page

Scenario: Create new Article
Given user should be on new Article page
When user enters Article details
| title 					| Desc                   | Content 						| Tag |
| Prasanth Article| Article about Prasanth | I am working in TCS| Good|
Then Article must be Created
#But Article must give message "Title already exists.. "

Scenario: View Article
Given user should be on global feed
When User selects an article Prasanth Article
Then Article detail page must be displayed

Scenario: Update Article
Given Article detail page must be displayed
When User update Article details
Then Article detail must be updated

Scenario: Delete an  Article
Given Article detail page must be displayed
When User delete Article 
Then Article must be deleted

#Scenario: Create new Article(negative scenario)
#Given user should be on new Article page
#When user enters Article details
#| title 					| Desc                   | Content 						| Tag |
#| Prasanth Article| Article about Prasanth | I am working in TCS| Good|
#Then Article must give message "Title already exists.. "







 