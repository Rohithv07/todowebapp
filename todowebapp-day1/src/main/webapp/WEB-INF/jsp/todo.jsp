<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<form:form method="post" modelAttribute="todo">
			<fieldset class="form-group">
				<form:label path="desc">Description : </form:label>
				<form:input path="desc" name="desc" type="text" class="form-control"
					required="required"></form:input>
					<form:errors path="desc" cssClass="text-warning"></form:errors>
			</fieldset>
			<button type="submit" value="submit" class="btn btn-success">ADD</button>
		</form:form>
	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>