$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Featurefiles/Forgotten.feature");
formatter.feature({
  "name": "",
  "description": "To validate forgotten password functionality of facebook application",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "To validate forgotten password",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User gave to enter facebook login through chrome broswer",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_gave_to_enter_facebook_login_through_chrome_broswer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click forgotten password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_forgotten_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter email or phoneno",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_email_or_phoneno()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click the search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Featurefiles/Login.feature");
formatter.feature({
  "name": "",
  "description": "To validate Login Functionality of Facebook Application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "",
  "description": "  To validate Login using different credentials",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User gave to enter facebook login through chrome broswer",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter  \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be in invalid credential page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "java123@gmail.com",
        "java123"
      ]
    },
    {
      "cells": [
        "selenium123@gmail.com",
        "selenium123"
      ]
    },
    {
      "cells": [
        "python123@gmail.com",
        "python123"
      ]
    },
    {
      "cells": [
        "jira123@gmail.com",
        "jira123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "  To validate Login using different credentials",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User gave to enter facebook login through chrome broswer",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_gave_to_enter_facebook_login_through_chrome_broswer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter  \"java123@gmail.com\" and \"java123\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be in invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_be_in_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "  To validate Login using different credentials",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User gave to enter facebook login through chrome broswer",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_gave_to_enter_facebook_login_through_chrome_broswer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter  \"selenium123@gmail.com\" and \"selenium123\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be in invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_be_in_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "  To validate Login using different credentials",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User gave to enter facebook login through chrome broswer",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_gave_to_enter_facebook_login_through_chrome_broswer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter  \"python123@gmail.com\" and \"python123\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be in invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_be_in_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "  To validate Login using different credentials",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User gave to enter facebook login through chrome broswer",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_gave_to_enter_facebook_login_through_chrome_broswer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter  \"jira123@gmail.com\" and \"jira123\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be in invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_be_in_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
});