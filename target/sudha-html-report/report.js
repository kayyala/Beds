$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Registration.feature");
formatter.feature({
  "id": "create-new-registration",
  "description": "In order to Create a  new registration\r\nAs a User\r\nI want to create new registriation\r\nSo that i can get access in my acount",
  "name": "create new registration",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 33771065963,
  "status": "passed"
});
formatter.scenario({
  "id": "create-new-registration;create-new-registration",
  "description": "",
  "name": "create new registration",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario"
});
formatter.step({
  "name": "i am  navigative to Dream web page",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "i go to my acount and click on registration page",
  "keyword": "And ",
  "line": 8
});
formatter.step({
  "name": "i enter all field in registration",
  "keyword": "When ",
  "line": 9
});
formatter.step({
  "name": "i click on submit button",
  "keyword": "And ",
  "line": 10
});
formatter.step({
  "name": "i should able to see my acount succefully",
  "keyword": "Then ",
  "line": 12
});
formatter.step({
  "name": "i click on logout",
  "keyword": "And ",
  "line": 13
});
formatter.match({
  "location": "MyStepdefs.navigativedreampage()"
});
formatter.result({
  "duration": 583877960,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iGoToMyAcountAndClickOnRegistrationPage()"
});
formatter.result({
  "duration": 1173898705,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterAllFieldInRegistration()"
});
formatter.result({
  "duration": 7915442625,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnSubmitButton()"
});
formatter.result({
  "duration": 6612779429,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldAbleToSeeMyAcountSuccefully()"
});
formatter.result({
  "duration": 366767655,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLogout()"
});
formatter.result({
  "duration": 4658976896,
  "status": "passed"
});
});