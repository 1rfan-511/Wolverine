$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/DemoTours.feature");
formatter.feature({
  "name": "DemoTours Login Function Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As an User, I will be able to sign in with valid credentials and should verify the success message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Open Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "DemoToursStepDef.open_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Go to URL",
  "keyword": "And "
});
formatter.match({
  "location": "DemoToursStepDef.go_to_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter UserName and Password",
  "keyword": "When "
});
formatter.match({
  "location": "DemoToursStepDef.enter_UserName_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Login Success Msg",
  "keyword": "And "
});
formatter.match({
  "location": "DemoToursStepDef.verify_Login_Success_Msg()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoToursStepDef.close_Browser()"
});
formatter.result({
  "status": "passed"
});
});