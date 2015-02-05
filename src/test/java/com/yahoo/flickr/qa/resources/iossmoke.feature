Feature: Smoke Testing on the IOS Flickr Native App


@CreateEnvironment
Scenario: Create Environment


Scenario: TC01-Login with valid credentials
  Given I am on "Welcome" page
  And I click on "Get Started" button
  Then I should be navigated to "Login" screen
  When I enter valid "username" and "password"
  And I click on "Sign In" button
  Then I should be logged in successfully

Scenario: TC02-


@TearEnvironment
Scenario: Tear Environment
