$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/uk/co/expedia/resources/featurefile/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "\r\nAs a user I want to login to my account",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14873059500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should navigate to the account page",
  "description": "",
  "id": "login-feature;user-should-navigate-to-the-account-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Account link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should the see text \"Sign in to see exclusive Member Pricing.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 58172000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnAccountLink()"
});
formatter.result({
  "duration": 131961400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign in to see exclusive Member Pricing.",
      "offset": 23
    }
  ],
  "location": "MyStepdefs.iShouldTheSeeText(String)"
});
formatter.result({
  "duration": 50595100,
  "status": "passed"
});
formatter.after({
  "duration": 111000,
  "status": "passed"
});
formatter.before({
  "duration": 15290228600,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify error message when user login with invalid credentials",
  "description": "",
  "id": "login-feature;verify-error-message-when-user-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on Account link",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click on Sign In button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter \"xyz13@gmail.com\" in the email address field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter \"abc123\" in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on the Sign In button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should see a error message \"You may have entered an unknown email address or an incorrect password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 20700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnAccountLink()"
});
formatter.result({
  "duration": 156533800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnSignInButton()"
});
formatter.result({
  "duration": 143099400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyz13@gmail.com",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iEnterInTheEmailAddressField(String)"
});
formatter.result({
  "duration": 990389100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iEnterInThePasswordField(String)"
});
formatter.result({
  "duration": 155927700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnTheSignInButton()"
});
formatter.result({
  "duration": 119839000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You may have entered an unknown email address or an incorrect password",
      "offset": 30
    }
  ],
  "location": "MyStepdefs.iShouldSeeAErrorMessage(String)"
});
formatter.result({
  "duration": 54616300,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[]\u003e but was:\u003c[You may have entered an unknown email address or an incorrect password]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat uk.co.expedia.cucumber.mystepdefs.MyStepdefs.iShouldSeeAErrorMessage(MyStepdefs.java:51)\r\n\tat ✽.Then I should see a error message \"You may have entered an unknown email address or an incorrect password\"(src/test/java/uk/co/expedia/resources/featurefile/login.feature:17)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 459904800,
  "status": "passed"
});
});