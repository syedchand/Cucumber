$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/test/LoginFunction.feature");
formatter.feature({
  "name": "Login to Demo Baning WebSite",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginFeature"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User should be able to login to the Banking WebSite",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User has launched the banking website",
  "keyword": "Given "
});
formatter.step({
  "name": "User Enters \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User \"\u003cUsername\u003e\" should be landing to Home Page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "mngr289192",
        "YgUqavY"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should be able to login to the Banking WebSite",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has launched the banking website",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.user_has_launched_the_banking_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters \"mngr289192\" and \"YgUqavY\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_enters_something_and_something(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User \"mngr289192\" should be landing to Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_should_be_landing_to_home_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User should be able to login to the Banking WebSite",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User has launched the banking website",
  "keyword": "Given "
});
formatter.step({
  "name": "User Enters \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User \"\u003cUsername\u003e\" should be landing to Home Page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "mngr289192",
        "YgUqavY"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should be able to login to the Banking WebSite",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has launched the banking website",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.user_has_launched_the_banking_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters \"mngr289192\" and \"YgUqavY\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_enters_something_and_something(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User \"mngr289192\" should be landing to Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_should_be_landing_to_home_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});