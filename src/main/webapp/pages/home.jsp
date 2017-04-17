<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
alert('hello');
</script>
Hello ${userName}
<br>
<form name="addComment" method="post" action="Controller">
<input type="hidden" name="command" value = "addComment"/>
<input type="hidden" name="login" value = ${userName} value=""/>
<textarea id="area" name="textarea" placeholder="write your comment" cols="30" rows="7">
${text}
</textarea>
<br>
Enter you comment:
<br>
<input type ="text" name="message"/>
<br>
<input type = "submit" value="comment"/>
<br>
${errorMessage}
<br>
<a href = "Controller?command=Logout">Logout</a>
<br>
</form> 
</body>
</html>