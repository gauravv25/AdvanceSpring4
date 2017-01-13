<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test</title>
</head>
<body>

	<form action="app/dept" method="get">
		<s:message code="username" text="MessageNotFound"></s:message> : <input type="text">
		<s:message code="password" text="MessageNotFound"></s:message> : <input type="text">
		<input type="submit" value="invoke dept insert...">
	</form>

</body>
</html>