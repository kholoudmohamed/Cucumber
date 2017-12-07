$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "This feature deals with the login functionality of the application",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4762780693,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Login with correct username and password",
  "description": "",
  "id": "loginfeature;login-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Smoke"
    },
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigated to the Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I go to the login page from header",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter valid username and password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should be directed to private Home Page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "My first name should be displayed at the header",
  "keyword": "And "
});
formatter.match({
  "location": "CommonStepDefinitions.iNavigatedToTheHomePage()"
});
formatter.result({
  "duration": 6405820947,
  "status": "passed"
});
formatter.match({
  "location": "CommonStepDefinitions.iGoToTheLoginPage()"
});
formatter.result({
  "duration": 1341679048,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefinitions.enterValidUsernameAndPassword()"
});
formatter.result({
  "duration": 250638324,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefinitions.iClickOnLoginButton()"
});
formatter.result({
  "duration": 5692966514,
  "status": "passed"
});
formatter.match({
  "location": "CommonStepDefinitions.iShouldBeDirectedToPrivateHomePage()"
});
formatter.result({
  "duration": 11778796,
  "status": "passed"
});
formatter.match({
  "location": "CommonStepDefinitions.myFirstNameShouldBeDisplayedAtTheHeader()"
});
formatter.result({
  "duration": 53239070,
  "status": "passed"
});
formatter.after({
  "duration": 914211534,
  "status": "passed"
});
});