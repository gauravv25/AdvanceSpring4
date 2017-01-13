<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test</title>
</head>
<body>

	--------------------------------------------------------Second Contoller--------------------------------
		Get
		<form action="app/second/method1" method="get">
			<input type="submit" value="submit">
		</form>

		Post
		<form action="app/second/method3" method="post">
			<input type="submit" value="submit">
		</form>

		--------------------------------------------------------Third Contoller--------------------------------

	<form action="app/third/method4" method="get">
		<input type="text" name="name">
		<input type="submit" value="submit">
	</form>

</body>
</html>