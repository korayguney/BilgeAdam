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

	<jsp:include page="../header.jsp" />
	<br>
	
	<div style="border: 1px solid; padding: 10px">
	 <form action="${pageContext.request.contextPath}/postlink" method="post">
		<table>
			<tr>
				<td>Title :</td>
				<td><input type="text" name="title"/></td>
			</tr>
			<tr>
				<td>URL :</td>
				<td><input type="text" name="url"/></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="Post" id="button-1"/> </td>
			</tr>
		</table>
		</form>
		<p style="color: red"><c:if test="${not empty error2}">${error2}</c:if> </p>
		<p style="color: green"><c:if test="${not empty success}">${success}</c:if> </p>
	</div>
	
	
	<br>
	<jsp:include page="../footer.jsp" />

</body>
</html>