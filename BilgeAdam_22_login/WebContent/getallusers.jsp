<%@page import="java.util.List"%>
<%@page import="com.bilgeadam.dao.UserDAO"%>
<%@page import="com.bilgeadam.models.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%!int i=0;%>
</head>
<body>

<%
	List<User> users =  new UserDAO().getAllUsers();
%>

<% for(User u : users) { %>
	<a href=""><%=u.getUsername() %></a><br>
<%} %>
<br><br>
<% 
 out.println(i++);
%>


</body>
</html>