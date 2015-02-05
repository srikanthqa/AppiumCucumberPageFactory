Feature: Smoke Testing on the IOS Flickr Native App


@CreateEnvironment
Scenario: Create Environment


Scenario: TC01-User Login with valid credentials
  Given I am on "Welcome" page
  And I click on "Get Started" button
  Then I should be navigated to "Login" screen
  When I enter valid "username" and "password"
  And I click on "Sign In" button
  Then I should be navigated to "AutoSyncBanner" screen
  And I click on "Skip I'll decide later" button
  Then I should be navigated to "Landing" screen

Scenario: TC02-User Logout
  Given I am on "Landing" page
  And I click on "Profile" button
  Then I should be navigated to "Profile" screen
  When I click on "Settings" button
  Then I should be navigated to "Settings" screen
  And I click on "SignOut" button
  Then I should be navigated to "Welcome" screen


@TearEnvironment
Scenario: Tear Environment
