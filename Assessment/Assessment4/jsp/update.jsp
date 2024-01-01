<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp"/>	
	
<form name="update" method="post" action="update">
	<table>
	
		<tr>
			<td></td>
			<td><input type="hidden" name="id" value="${p.id}"></td>
		</tr>
		<tr>
			<td>Firstname</td>
			<td><input type="text" name="firstname" value="${p.firstname}"></td>
		</tr>
		<tr>
			<td>Lastname</td>
			<td><input type="text" name="lastname" value="${p.lastname}"></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="text" name="email" value="${p.email}"></td>
		</tr>
		<tr>
			<td>Phone</td>
			<td><input type="text" name="phone" value="${p.phone}"></td>
		</tr>
		
		<tr>
			<td colspan="2" align="center">
				<input type="submit" name="action" value="Update">
			</td>
		</tr>
	</table>
</form>
	
<jsp:include page="footer.jsp"/>
</body>
</html>