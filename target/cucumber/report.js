$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FaceBookLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Login into facebook account",
  "description": "",
  "id": "login-into-facebook-account",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login into facebook account",
  "description": "",
  "id": "login-into-facebook-account;login-into-facebook-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters username as Password",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 7
    },
    {
      "cells": [
        "7410113240",
        "rani8421@#"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User clicks on signIn button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "login should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "FaceBookLoginTest.user_is_on_facebook_login_page()"
});
formatter.result({
  "duration": 11986196700,
  "status": "passed"
});
formatter.match({
  "location": "FaceBookLoginTest.user_enters_username_as_Password(DataTable)"
});
formatter.result({
  "duration": 521249100,
  "status": "passed"
});
formatter.match({
  "location": "FaceBookLoginTest.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 3255443500,
  "status": "passed"
});
formatter.match({
  "location": "FaceBookLoginTest.login_should_be_sucessful()"
});
formatter.result({
  "duration": 135100,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 13,
      "value": "#@SeleniumTest"
    }
  ],
  "line": 14,
  "name": "UploadPhoto into facebook account",
  "description": "",
  "id": "login-into-facebook-account;uploadphoto-into-facebook-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "click on Profile Button",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "click on EditProfile Button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User click on UploadPhoto button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User click on Save Buttton",
  "keyword": "Then "
});
formatter.match({
  "location": "UploadPhotoTest.click_on_profile_button()"
});
formatter.result({
  "duration": 14056939000,
  "status": "passed"
});
formatter.match({
  "location": "UploadPhotoTest.click_on_editprofile_button()"
});
formatter.result({
  "duration": 15025925400,
  "status": "passed"
});
formatter.match({
  "location": "UploadPhotoTest.user_click_on_uploadphoto_button()"
});
formatter.result({
  "duration": 17201998300,
  "status": "passed"
});
formatter.match({
  "location": "UploadPhotoTest.user_click_on_save_buttton()"
});
formatter.result({
  "duration": 4260335100,
  "status": "passed"
});
});