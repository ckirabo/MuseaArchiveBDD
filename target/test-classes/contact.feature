Feature: Finding Contacts Details
	As a tourist
	I want to know the contact number of the museum
	So that I can contact them to find out what exhibitions are on.

Scenario Outline: Contact
	Given I navigate to the React Application 
	When I click the Museums In the NavBar
	And I click the searchBar
	And I enter the "<Name>"
	Then I should see the contact details for the Museum

Examples:
 | Name  |
 |hat|
 |science|
 |war|    