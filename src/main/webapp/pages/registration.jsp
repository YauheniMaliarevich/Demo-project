<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration page</h1>
<form name = "RegistrationForm" method = "post" action = "Controller">
<input type = "hidden" name = "command" value = "registration">
Enter you login:
<br>
<input type = "text" name = "login" value=""/>
<br>
Enter you password:
<br>
<input type = "password" name = "password" value = ""/>
<br>
<input type = "submit" value = "Registration!"/>
<br>
<a href = "Controller?command=GoToLoginPage">Return to login page</a>
</form>
</body>
</html>