@AmazonUIAutomation 
Feature: GoogleDrive_APIAutomation 

#default user is "testAmazonUI@gmail.com" and password is "test@131"
#use "src/test/java/runner/TestRunner" to run this feature

Background: 
	Given Amazon website is open
	
Scenario: Invalid login username
	When User is signed out
	And User enters invalid username and submits
	Then User should get error message
	
#may fail due to captcha and email verification on login using new device
Scenario: Valid Login 				
	When User is signed out
	And User enters valid username and submits
	And User enters valid password and submits
	Then User should be logged in

Scenario Outline: User searches for an item
	When User searches for <item>
	Then User is shown <item> search results
	Examples:
	|item							   |
	|New Apple iPhone 12 (64GB) - Black|

Scenario Outline: User adds item to cart
	When User is signed out
	And User cart is empty
	And User searches for <item>
	And User adds <item> to cart
	Then <item> is added to cart
	Examples:
	|item							   |
	|New Apple iPhone 12 (64GB) - Black|

