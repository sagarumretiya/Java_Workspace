<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC ORM</title>
</head>
<body>

<jsp:include page="header.jsp"/>
		<form action="insert" method="post" name="insert">
			
			<p>
				Enter Name:<input type="text" name="name">
			</p>
			
			<p>
				Enter Email:<input type="text" name="email">
			</p>
			
			<p>
				<input type="submit" value="insert">
			</p>
			
		</form>
		<a href="show">View Data</a>
		
<jsp:include page="footer.jsp"/>

</body>
</html>