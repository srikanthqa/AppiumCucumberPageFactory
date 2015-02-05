Feature: Smoke Testing on the IOS Flickr Native App

Scenario: TC01- Login with valid credentials
  Given I have the Flickr app installed on my device
  And I click on "Get Started" button
  Then I should be navigated to Login screen
  When I enter valid "username" and "password"
  And I click on "Sign In" button
  Then I should be logged in successfully

Scenario: TC02- Logout from the current session
