<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login page</h1>
<form name="LoginForm" method="post" action="Controller">
<input type = "hidden" name = "command" value = "login"/>
<label for="login">Login:</label>
<br>
<input type ="text" autofocus id="login" name = "login" value = ""/>
<br>
<label for="password">Password:</label>
<br>
<input type = "password" id = "password" name = "password" value = ""/>
<br>
<input type = "submit" value = "Log in"/> 
<br>
<a href = "Controller?command=GoToRegistrationPage">Registration!!!!</a>
<br>
${errorLoginAndPassword}
${wrongAction}
${nullPage}
<br>
</form>
</body>
</html>