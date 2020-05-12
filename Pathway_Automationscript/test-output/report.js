$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/saiku/git/Pathway/Pathway_Automationscript/src/test/java/Featurefiles/CancelationRequest.Feature");
formatter.feature({
  "line": 1,
  "name": "check the Functionlaity of  signal Cancelation flow of the pathway tool",
  "description": "",
  "id": "check-the-functionlaity-of--signal-cancelation-flow-of-the-pathway-tool",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Rise a cancelation request with Market user",
  "description": "",
  "id": "check-the-functionlaity-of--signal-cancelation-flow-of-the-pathway-tool;rise-a-cancelation-request-with-market-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Enter Url of application into the \"chrome\" browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Market user loginwith valid credtinals for Cancelation process",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Rise a Cancelation request with Marketuser 260",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Logout MarketUser after rise a request for  Cancelation",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 35
    }
  ],
  "location": "Cancelationflow.enter_Url_of_application_into_the_browser(String)"
});
formatter.result({
  "duration": 18868381400,
  "status": "passed"
});
formatter.match({
  "location": "Cancelationflow.market_user_loginwith_valid_credtinals_for_Cancelation_process()"
});
formatter.result({
  "duration": 26784111700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "260",
      "offset": 43
    }
  ],
  "location": "Cancelationflow.rise_a_Cancelation_request_with_Marketuser(int)"
});
formatter.result({
  "duration": 71049264800,
  "status": "passed"
});
formatter.match({
  "location": "Cancelationflow.logout_MarketUser_after_rise_a_request_for_Cancelation()"
});
formatter.result({
  "duration": 10811602000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Check the status of Cancelation Request with RPM user",
  "description": "",
  "id": "check-the-functionlaity-of--signal-cancelation-flow-of-the-pathway-tool;check-the-status-of-cancelation-request-with-rpm-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "RPM user login with valid credtinals for Cancelation process",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "RPM user \"Approved\" Cancelation signal",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Logout RPM user after check the status of cancelation request",
  "keyword": "Then "
});
formatter.match({
  "location": "Cancelationflow.rpm_user_login_with_valid_credtinals_for_Cancelation_process()"
});
