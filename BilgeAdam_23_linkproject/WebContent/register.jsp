<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="header.jsp" />

	<br>

	<div style="border: 1px solid; padding: 10px">

		<h2>Register Page</h2>
		<form action="register" method="post">

			<table>
				<tr>
					<td>Username :</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password1" /></td>
				</tr>
				<tr>
					<td>Verify Password :</td>
					<td><input type="password" name="password2" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Sign up"
						id="button-1" /></td>
				</tr>

			</table>
		</form>
		
		<p style="color: red"><c:if test="${not empty error1}">${error1}</c:if></p>
		<p style="color: green"><c:if test="${not empty success}">${success}</c:if></p>
		
	</div>





	<br>

	<jsp:include page="footer.jsp" />


</body>
</html>