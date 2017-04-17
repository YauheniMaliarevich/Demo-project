<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.textArea {
	height:250px;
	width:500px;"
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello ${userName}
<br>
<form name="addComment" method="post" action="Controller">
<input type="hidden" name="command" value = "addComment"/>
<input type="hidden" name="login" value = ${userName} value=""/>
<textarea class="textArea" id="area" name="textarea" placeholder="write your comment" cols="30" rows="7">
${text}
</textarea>
<br>
Enter you comment:
<br>
<input type ="text" name="message"/>
<br>
<input type = "submit" value="Say"/>
<br>
${userMessage}
<br>
<a href = "Controller?command=Logout">Logout</a>
<br>
</form> 
</body>
</html>