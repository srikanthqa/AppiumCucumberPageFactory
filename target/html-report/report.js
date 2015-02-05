$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("iossmoke.feature");
formatter.feature({
  "line": 1,
  "name": "Smoke Testing on the IOS Flickr Native App",
  "description": "",
  "id": "smoke-testing-on-the-ios-flickr-native-app",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "TC01- Login with valid credentials",
  "description": "",
  "id": "smoke-testing-on-the-ios-flickr-native-app;tc01--login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I have the Flickr app installed on my device",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on \"Get Started\" button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I should be navigated to Login screen",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I enter valid \"username\" and \"password\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on \"Sign In\" button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should be logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "IOSSmokeStepDefs.i_have_the_Flickr_app_installed_on_my_device()"
});
formatter.result({
  "duration": 11024178781,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Get Started",
      "offset": 12
    }
  ],
  "location": "IOSSmokeStepDefs.i_click_on_button(String)"
});
formatter.result({
  "duration": 2286723453,
  "status": "passed"
});
formatter.match({
  "location": "IOSSmokeStepDefs.i_should_be_navigated_to_Login_screen()"
});
formatter.result({
  "duration": 169023,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 15
    },
    {
      "val": "password",
      "offset": 30
    }
  ],
  "location": "IOSSmokeStepDefs.i_enter_valid_and(String,String)"
});
formatter.result({
  "duration": 14209222638,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign In",
      "offset": 12
    }
  ],
  "location": "IOSSmokeStepDefs.i_click_on_button(String)"
});
formatter.result({
  "duration": 2329666020,
  "status": "passed"
});
formatter.match({
  "location": "IOSSmokeStepDefs.i_should_be_logged_in_successfully()"
});
formatter.result({
  "duration": 17687751293,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "TC02- Logout from the current session",
  "description": "",
  "id": "smoke-testing-on-the-ios-flickr-native-app;tc02--logout-from-the-current-session",
  "type": "scenario",
  "keyword": "Scenario"
});
});