$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "This feature deals with the login functionality of the application",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5328909410,
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
  "name": "I go to the login page",
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
  "location": "LoginStepDefinition.iNavigatedToTheHomePage()"
});
formatter.result({
  "duration": 10856817238,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.iGoToTheLoginPage()"
});
formatter.result({
  "duration": 1008905746,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.enterValidUsernameAndPassword()"
});
formatter.result({
  "duration": 242912511,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.iClickOnLoginButton()"
});
formatter.result({
  "duration": 7091079016,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.iShouldBeDirectedToPrivateHomePage()"
});
formatter.result({
  "duration": 12619631,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.myFirstNameShouldBeDisplayedAtTheHeader()"
});
formatter.result({
  "duration": 45501019,
  "status": "passed"
});
formatter.after({
  "duration": 942614784,
  "status": "passed"
});
});