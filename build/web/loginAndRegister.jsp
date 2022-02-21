<%-- 
    Document   : loginAndRegister
    Created on : Feb 10, 2022, 9:43:06 PM
    Author     : xuant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login</title>
        <link rel="stylesheet" href="./assets/css/styleLogin.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </head>

    <body>
        <div class="login-page">

            <div class="form">
                <c:if test="${not empty message}">
                    <div class="alert alert-${alert}"> 
                        ${message}
                    </div>
                </c:if>
                <form class="register-form">
                    <input type="text" placeholder="name" />
                    <input type="password" placeholder="password" />
                    <input type="text" placeholder="email address" />
                    <button>create</button>
                    <p class="message">Already registered? <a href="#">Sign In</a></p>
                </form>

                <form class="login-form" action="login" method="POST">

                    <input type="text" placeholder="username" name="username" />
                    <input type="password" placeholder="password" name="password" />

                    <div style="display: flex;
                         align-items: center;
                         margin-bottom: 15px;">
                        <input class="remember" type="checkbox" value="remember" name ="remember" style="    margin-bottom: 0px;
                               width: 14px;
                               margin-right: 10px;"/> 
                        <div style="font-size: 14px;">Remember me</div>
                    </div>  
                    <button>login</button>
                    <p class="message">Not registered? <a href="#">Create an account</a></p>
                </form>

            </div>
        </div>
        <script>
            $('.message a').click(function () {
                $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
            });
        </script>
    </body>

</html>
