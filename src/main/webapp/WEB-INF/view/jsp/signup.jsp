<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Flow-Assignment</title>
    <link rel="stylesheet" type="text/css" href="/css/index.css" />
    <script type="text/javascript" src="/js/jquery-3.6.4.min.js"></script>
</head>
<body>
    <div class="wrapper">
        <div class="nav">
            <div class="logo">
               BeHoney
            </div>
            <div class="menus">
                <div class="menu">Settings</div>
                <div class="menu">Upload</div>
            </div>
        </div>
        <div class="content">
            <div class="container">
                <div class="signup_container">
                    <span class="signup_title">Flow.Team</span>
                    <span class="signup_subtitle">Java-SpringBoot Refactor Version</span>
                    <label class="signup_label">login</label>
                    <input class="signup_input" type="text">
                    <label class="signup_label">password</label>
                    <input class="signup_input" type="password">
                    <button class="signup_button">
                        Join flow.team
                    </button>
                </div>
            </div>
        </div>
    </div>

    <script>
        $(".signup_button").click(() => {
            console.log("hello");
        });
    </script>
</body>
</html>