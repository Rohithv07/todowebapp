<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<font color = "red">${message}</font>
<form method="post">
	Name : <input type = "text" name = "name" />
	Password : <input type = "password" name = "password" />
	<input type="submit" value = "submit" />
</form>
</body>
</html>