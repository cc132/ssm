<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>用户编号</td>
			<td>用户姓名</td>
			<td>用户生日</td>
			<td>用户编号</td>
			<td>用户类型</td>
		</tr>
		<c:forEach var="row" items="${data}">
			<tr>
				<td>${row.id }</td>
				<td>${row.name }</td>
				<td><fmt:formatDate value="${row.birthday }" pattern="yyyy-MM-dd"/></td>
				<td>${row.age }</td>
				<td>${ row.type.typeName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>