<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EliteEvince Spring Microservice Demo (Calculator)</title>
        <style>
            form {
                margin: auto;
                width: 50%;
            }
            form table{
                width: 100%;
            }
            form h1{
                color: #b54656;
            }
            form input:focus{
                outline: none;
            }
            form input[type="number"]{
                height: 30px;
                width: 100%;
                border-radius: 10px;
                padding:  0 0 0 15px;
                margin: 0 0 0 -15px;
            }
            form input[type="button"]{
                border-radius: 10px;
                padding:  10px;
                background-color: #47a2ff;
                color: white;
            }
            form #error {
                color: #b54656;
            }
            form #answer {
                color: green;
            }
        </style>
    </head>
    <body>
        <form id="form" method="get"  autocomplete="off">
            <h1>EliteEvince microservice Demo (Calculator)</h1><hr>
            <table>
                <tr>
                    <td>Value A:</td>
                    <td><input name="a" id="a" type="number" placeholder="Enter Value of A"/></td>
                </tr>
                <tr>
                    <td>Value B:</td>
                    <td><input name="b" id="b" type="number" placeholder="Enter Value of B"/></td>
                </tr>
                <tr>
                    <td colspan="2"><span id="error"></span><span id="answer"><c:out value="${answer}" /></span></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="button" value="Addition" onclick="onSubmit('sum')"/>
                        <input type="button" value="Substraction" onclick="onSubmit('sub')"/>
                        <input type="button" value="Multiplication" onclick="onSubmit('multi')"/>
                        <input type="button" value="Division" onclick="onSubmit('div')"/>
                    </td>
                </tr>
            </table>
        </form>
        <script>
            function onSubmit(e) {
                if (document.getElementById("a").value && document.getElementById("b").value) {
                    var form = document.getElementById("form");
                    form.action = "http://localhost:8080/calculator/math-" + e;
                    form.submit();
                } else {
                    document.getElementById("error").innerText = "Please enter proper input";
                }
            }
        </script>
    </body>
</html>
