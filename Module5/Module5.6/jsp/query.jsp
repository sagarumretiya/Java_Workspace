<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp"/>

	<p>Name: <%=request.getParameter("name")%></p><br>
	<p>Email: <%=request.getParameter("email")%></p><br>
	<a href="show">Back</a>
	
<jsp:include page="footer.jsp"/>

</body>
</html>