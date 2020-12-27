$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/MainTest.feature");
formatter.feature({
  "name": "GoogleDrive_APIAutomation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AmazonUIAutomation"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Amazon website is open",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.amazon_website_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid login username",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AmazonUIAutomation"
    }
  ]
});
formatter.step({
  "name": "User is signed out",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_is_signed_out()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters invalid username and submits",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enters_invalid_username_and_submits()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should get error message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_get_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Amazon website is open",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.amazon_website_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AmazonUIAutomation"
    }
  ]
});
formatter.step({
  "name": "User is signed out",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_is_signed_out()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid username and submits",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enters_valid_username_and_submits()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid password and submits",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enters_valid_password_and_submits()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_be_logged_in()"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to be clickable: By.xpath: //a[@id\u003d\u0027nav-link-accountList\u0027]/div/span (tried for 10 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat com.amazon.ui.setup.SetUp.getFieldtext(SetUp.java:79)\r\n\tat com.amazon.ui.setup.SetUp.doesFieldContain(SetUp.java:90)\r\n\tat com.amazon.ui.pages.HomePage.verifyLoginUser(HomePage.java:37)\r\n\tat com.amazon.ui.stepdef.StepDefinition.user_should_be_logged_in(StepDefinition.java:49)\r\n\tat ✽.User should be logged in(file:src/test/resources/features/MainTest.feature:20)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@id\u003d\u0027nav-link-accountList\u0027]/div/span\"}\n  (Session info: chrome\u003d87.0.4280.88)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027WKWIN3575663\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: C:\\Users\\jaysher\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:58956}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 952b5e188fa5c2797d77132249ffa061\n*** Element info: {Using\u003dxpath, value\u003d//a[@id\u003d\u0027nav-link-accountList\u0027]/div/span}\r\n\tat sun.reflect.GeneratedConstructorAccessor12.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:205)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:201)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$22.apply(ExpectedConditions.java:641)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$22.apply(ExpectedConditions.java:638)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\r\n\tat com.amazon.ui.setup.SetUp.getFieldtext(SetUp.java:79)\r\n\tat com.amazon.ui.setup.SetUp.doesFieldContain(SetUp.java:90)\r\n\tat com.amazon.ui.pages.HomePage.verifyLoginUser(HomePage.java:37)\r\n\tat com.amazon.ui.stepdef.StepDefinition.user_should_be_logged_in(StepDefinition.java:49)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:57)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:46)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:330)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:78)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:328)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:65)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:292)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:305)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:412)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:126)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:66)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:330)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:78)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:328)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:65)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:292)\r\n\tat cucumber.api.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:156)\r\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:305)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:412)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "name": "User searches for an item",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User searches for \u003citem\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "User is shown \u003citem\u003e search results",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "item"
      ]
    },
    {
      "cells": [
        "New Apple iPhone 12 (64GB) - Black"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Amazon website is open",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.amazon_website_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User searches for an item",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AmazonUIAutomation"
    }
  ]
});
formatter.step({
  "name": "User searches for New Apple iPhone 12 (64GB) - Black",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_searches_for_item(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is shown New Apple iPhone 12 (64GB) - Black search results",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_shown_search_results(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User adds item to cart",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is signed out",
  "keyword": "When "
});
formatter.step({
  "name": "User cart is empty",
  "keyword": "And "
});
formatter.step({
  "name": "User searches for \u003citem\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User adds \u003citem\u003e to cart",
  "keyword": "And "
});
formatter.step({
  "name": "\u003citem\u003e is added to cart",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "item"
      ]
    },
    {
      "cells": [
        "New Apple iPhone 12 (64GB) - Black"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Amazon website is open",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.amazon_website_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User adds item to cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AmazonUIAutomation"
    }
  ]
});
formatter.step({
  "name": "User is signed out",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_is_signed_out()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User cart is empty",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_cart_is_empty()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches for New Apple iPhone 12 (64GB) - Black",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_searches_for_item(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User adds New Apple iPhone 12 (64GB) - Black to cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_adds_item_to_cart(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "New Apple iPhone 12 (64GB) - Black is added to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.item_is_added_to_cart(String)"
});
formatter.result({
  "status": "passed"
});
});