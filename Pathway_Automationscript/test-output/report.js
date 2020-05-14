$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/saiku/git/Pathway/Pathway_Automationscript/src/test/java/Featurefiles/Buildoutflow.feature");
formatter.feature({
  "line": 1,
  "name": "Check the buildoutflow functionality with Pathway tool",
  "description": "",
  "id": "check-the-buildoutflow-functionality-with-pathway-tool",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Rise a Buildout request with Market user",
  "description": "",
  "id": "check-the-buildoutflow-functionality-with-pathway-tool;rise-a-buildout-request-with-market-user",
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
  "name": "Enter Url of application into the \"chrome\" browser for BUildOutrequest",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Market user loginwith valid credtinals for BUildOutrequest process",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Rise a BUildOut request with Marketuser 268 with date \"05-08-2020\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Logout MarketUser after rise a request for  BUildOut",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 35
    }
  ],
  "location": "Buildoutflow.enter_Url_of_application_into_the_browser_for_BUildOutrequest(String)"
});
formatter.result({
  "duration": 18066104100,
  "status": "passed"
});
formatter.match({
  "location": "Buildoutflow.market_user_loginwith_valid_credtinals_for_BUildOutrequest_process()"
});
formatter.result({
  "duration": 5404180000,
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d81.0.4044.138)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027LAPTOP-4MG5Q5BI\u0027, ip: \u0027192.168.0.4\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.138, chrome: {chromedriverVersion: 81.0.4044.138 (8c6c7ba89cc9..., userDataDir: C:\\Users\\saiku\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:61515}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 0457701bd12b1a29cf399682f34937ad\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.clear(RemoteWebElement.java:118)\r\n\tat Com.Pathway.Base.BasePage.click(BasePage.java:37)\r\n\tat Com.Pathway.webpages.Loginpage.doLogin(Loginpage.java:28)\r\n\tat Com.Pathway.users.MarketUser.loginwithMarketUser(MarketUser.java:23)\r\n\tat Com.Pathway.Stepdefinations.Buildoutflow.market_user_loginwith_valid_credtinals_for_BUildOutrequest_process(Buildoutflow.java:34)\r\n\tat ✽.When Market user loginwith valid credtinals for BUildOutrequest process(C:/Users/saiku/git/Pathway/Pathway_Automationscript/src/test/java/Featurefiles/Buildoutflow.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "268",
      "offset": 40
    },
    {
      "val": "05-08-2020",
      "offset": 55
    }
  ],
  "location": "Buildoutflow.rise_a_BUildOut_request_with_Marketuser(int,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Buildoutflow.logout_MarketUser_after_rise_a_request_for_BUildOut()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 11,
  "name": "Check the status of BUildOut Request with RPM user",
  "description": "",
  "id": "check-the-buildoutflow-functionality-with-pathway-tool;check-the-status-of-buildout-request-with-rpm-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "RPM user login with valid credtinals for BUildOut process",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "RPM user \"Approved\" BUildOut request signal",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Logout RPM user after check the status of BUildOut request",
  "keyword": "Then "
});
formatter.match({
  "location": "Buildoutflow.rpm_user_login_with_valid_credtinals_for_BUildOut_process()"
});
formatter.result({
  "duration": 15363709500,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d81.0.4044.138)\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027LAPTOP-4MG5Q5BI\u0027, ip: \u0027192.168.0.4\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.138, chrome: {chromedriverVersion: 81.0.4044.138 (8c6c7ba89cc9..., userDataDir: C:\\Users\\saiku\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:61515}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 0457701bd12b1a29cf399682f34937ad\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat Com.Pathway.Base.BasePage.click(BasePage.java:36)\r\n\tat Com.Pathway.webpages.Loginpage.loginwithsecondaccount(Loginpage.java:43)\r\n\tat Com.Pathway.Stepdefinations.Buildoutflow.rpm_user_login_with_valid_credtinals_for_BUildOut_process(Buildoutflow.java:51)\r\n\tat ✽.When RPM user login with valid credtinals for BUildOut process(C:/Users/saiku/git/Pathway/Pathway_Automationscript/src/test/java/Featurefiles/Buildoutflow.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Approved",
      "offset": 10
    }
  ],
  "location": "Buildoutflow.rpm_user_BUildOut_request_signal(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Buildoutflow.logout_RPM_user_after_check_the_status_of_BUildOut_request()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 18,
  "name": "Check the staus of the BUildOutrequest  with NOC user",
  "description": "",
  "id": "check-the-buildoutflow-functionality-with-pathway-tool;check-the-staus-of-the-buildoutrequest--with-noc-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "NOC user login with valid credtinals for BUildOutrequest process",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "NOC user \"Approved\" BUildOutrequest Signal",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Logout NOC user after check the status of BUildOutrequest",
  "keyword": "Then "
});
formatter.match({
  "location": "Buildoutflow.noc_user_login_with_valid_credtinals_for_BUildOutrequest_process()"
});
formatter.result({
  "duration": 7457150400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(.//*[@data-bind\u003d\u0027imgSrc\u0027])[5]\"}\n  (Session info: chrome\u003d81.0.4044.138)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027LAPTOP-4MG5Q5BI\u0027, ip: \u0027192.168.0.4\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.138, chrome: {chromedriverVersion: 81.0.4044.138 (8c6c7ba89cc9..., userDataDir: C:\\Users\\saiku\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:61515}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 0457701bd12b1a29cf399682f34937ad\n*** Element info: {Using\u003dxpath, value\u003d(.//*[@data-bind\u003d\u0027imgSrc\u0027])[5]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat Com.Pathway.Base.BasePage.click(BasePage.java:35)\r\n\tat Com.Pathway.webpages.Loginpage.loginwithThirdaccount(Loginpage.java:48)\r\n\tat Com.Pathway.Stepdefinations.Buildoutflow.noc_user_login_with_valid_credtinals_for_BUildOutrequest_process(Buildoutflow.java:67)\r\n\tat ✽.When NOC user login with valid credtinals for BUildOutrequest process(C:/Users/saiku/git/Pathway/Pathway_Automationscript/src/test/java/Featurefiles/Buildoutflow.feature:20)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Approved",
      "offset": 10
    }
  ],
  "location": "Buildoutflow.noc_user_BUildOutrequest_Signal(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Buildoutflow.logout_NOC_user_after_check_the_status_of_BUildOutrequest()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 25,
  "name": "Check the status of the BUildOutrequest Legal user",
  "description": "",
  "id": "check-the-buildoutflow-functionality-with-pathway-tool;check-the-status-of-the-buildoutrequest-legal-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@tag4"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "LEGAL user login with valid credtinals for BUildOutrequest",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "Request send to FCC with Legal user FOR BUildOutrequest",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Logout LEGAL user after succesful BUildOutrequest Send to FCC",
  "keyword": "Then "
});
formatter.match({
  "location": "Buildoutflow.legal_user_login_with_valid_credtinals_for_BUildOutrequest()"
});
formatter.result({
  "duration": 19157758100,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d81.0.4044.138)\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027LAPTOP-4MG5Q5BI\u0027, ip: \u0027192.168.0.4\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.138, chrome: {chromedriverVersion: 81.0.4044.138 (8c6c7ba89cc9..., userDataDir: C:\\Users\\saiku\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:61515}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 0457701bd12b1a29cf399682f34937ad\n*** Element info: {Using\u003dxpath, value\u003d(.//*[@data-bind\u003d\u0027imgSrc\u0027])[7]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat Com.Pathway.Base.BasePage.click(BasePage.java:35)\r\n\tat Com.Pathway.webpages.Loginpage.loginwithFourthaccount(Loginpage.java:53)\r\n\tat Com.Pathway.Stepdefinations.Buildoutflow.legal_user_login_with_valid_credtinals_for_BUildOutrequest(Buildoutflow.java:83)\r\n\tat ✽.When LEGAL user login with valid credtinals for BUildOutrequest(C:/Users/saiku/git/Pathway/Pathway_Automationscript/src/test/java/Featurefiles/Buildoutflow.feature:26)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Buildoutflow.request_send_to_FCC_with_Legal_user_FOR_BUildOutrequest()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Buildoutflow.logout_LEGAL_user_after_succesful_BUildOutrequest_Send_to_FCC()"
});
formatter.result({
  "status": "skipped"
});
});