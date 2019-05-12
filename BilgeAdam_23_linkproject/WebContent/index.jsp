<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<br>
	<div style="border: 1px solid; padding: 10px" >
	<h3>All Links Posted</h3>

	<div>
		<form action="${pageContext.request.contextPath}/search">
			<input type="text" name="searchedtext" placeholder="Enter your keywords" />
			<input type="submit" value="Search" id="button-1"/>
			<a href="index">Reset</a>
		</form>
	</div>
	
	<div>
	
		<table>
			<tr>
				<th>Title</th>
				<th>Link</th>
				<th>Date</th>
				<th>Views</th>
				<th>Posted By</th>
			</tr>
			<c:forEach items="${links}" var="link">
				<tr>
					<td>${link.title}</td>
					<td><a href="${pageContext.request.contextPath}/viewcounter?link=${link.postedlink}&count=${link.viewcount}">${link.postedlink}</a></td>
					<td>${link.postdate}</td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;${link.viewcount}</td>
					<td><a href="${pageContext.request.contextPath}/userlinks?username=${link.username}">${link.username}</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>
<br>
<jsp:include page="footer.jsp" />

</body>
</html>