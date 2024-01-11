<%@page import="com.model.Person"%>
<%@page import="java.util.List"%>
<%@page import="com.bo.MyBo"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
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
	<%
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		MyBo bo = (MyBo) acm.getBean("bo");
		List<Person>list = bo.viewdetails();
		
	%>
	
	<table border="1" >
	
	<tr>
			<th>Id</th>
			<th>Firstname</th>
			<th>Lastname</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Edit</th>
			<th>Delete</th>
	</tr>
	
	<tr>
			<%
				for(Person p :list)
				{
									
			%>

					<td><%=p.getId()%></td>
					<td><%=p.getFirstname()%></td>
					<td><%=p.getLastname()%></td>
					<td><%=p.getEmail()%></td>
					<td><%=p.getPhone()%></td>
					
					<td>
						<form name="query" method="post" action="query">
							<input type="hidden" name="id" value="<%=p.getId()%>">
							<input type="submit" name="action" value="query">
						</form>
					</td>
					<td>
						<form name="edit" method="post" action="edit">
							<input type="hidden" name="id" value="<%=p.getId()%>">
							<input type="submit" name="action" value="Edit">
						</form>
					</td>
					<td>
						<form name="delete" method="post" action="delete">
							<input type="hidden" name="id" value="<%=p.getId()%>">
							<input type="submit" name="action" value="Delete">
						</form>
					</td>
	
	</tr>			
	<%
				}
	
	%>				
	
	</table>
		
<jsp:include page="footer.jsp"/>

</body>
</html>