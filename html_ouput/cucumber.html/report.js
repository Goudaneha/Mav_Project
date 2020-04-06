$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/nehaashokj/eclipse-workspace/companysearch/src/main/java/feature/company.feature");
formatter.feature({
  "line": 1,
  "name": "Company title test",
  "description": "",
  "id": "company-title-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify company name",
  "description": "",
  "id": "company-title-test;verify-company-name",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on search page \"\u003cTest summary\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters valid \"\u003ccompany name\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on \"\u003csearch\u003e\" button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user navigates to \"\u003cCompany Home page\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "company-title-test;verify-company-name;",
  "rows": [
    {
      "cells": [
        "Test summary",
        "company name",
        "search",
        "Company Home page",
        "status"
      ],
      "line": 11,
      "id": "company-title-test;verify-company-name;;1"
    },
    {
      "cells": [
        "valid company name",
        "maveric systems",
        "search",
        "Home page",
        "pass"
      ],
      "line": 12,
      "id": "company-title-test;verify-company-name;;2"
    },
    {
      "cells": [
        "Invalid company name",
        "",
        "search",
        "Home page",
        "fail"
      ],
      "line": 13,
      "id": "company-title-test;verify-company-name;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Verify company name",
  "description": "",
  "id": "company-title-test;verify-company-name;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on search page \"valid company name\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters valid \"maveric systems\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on \"search\" button",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user navigates to \"Home page\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "valid company name",
      "offset": 24
    }
  ],
  "location": "StepDefinition.user_is_on_search_page(String)"
});
formatter.result({
  "duration": 14505148600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "maveric systems",
      "offset": 19
    }
  ],
  "location": "StepDefinition.user_enters_valid(String)"
});
formatter.result({
  "duration": 2041964400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "search",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_clicks_on_button(String)"
});
formatter.result({
  "duration": 32036645400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Home page",
      "offset": 19
    }
  ],
  "location": "StepDefinition.user_navigates_to(String)"
});
formatter.result({
  "duration": 4830121600,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify company name",
  "description": "",
  "id": "company-title-test;verify-company-name;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on search page \"Invalid company name\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters valid \"\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on \"search\" button",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user navigates to \"Home page\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid company name",
      "offset": 24
    }
  ],
  "location": "StepDefinition.user_is_on_search_page(String)"
});
formatter.result({
  "duration": 12909273700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 19
    }
  ],
  "location": "StepDefinition.user_enters_valid(String)"
});
formatter.result({
  "duration": 2025449301,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[]\u003e but was:\u003c[maveric systems]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat com.stepdefinition.test.StepDefinition.user_enters_valid(StepDefinition.java:25)\r\n\tat ✽.When user enters valid \"\"(C:/Users/nehaashokj/eclipse-workspace/companysearch/src/main/java/feature/company.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "search",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_clicks_on_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Home page",
      "offset": 19
    }
  ],
  "location": "StepDefinition.user_navigates_to(String)"
});
formatter.result({
  "status": "skipped"
});
});