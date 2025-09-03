<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách Category</title>
</head>
<body>
	<h2>Danh sách Category</h2>

	<a href="${pageContext.request.contextPath}/category?action=new">Thêm
		mới Category</a>
	<br>
	<br>

	<table border="1" cellpadding="5" cellspacing="0">
		<tr>
			<th>ID</th>
			<th>Tên Category</th>
			<th>User ID</th>
			<th>Ngày tạo</th>
			<th>Hành động</th>
		</tr>
		<c:forEach var="c" items="${list}">
			<tr>
				<td>${c.id}</td>
				<td>${c.name}</td>
				<td>${c.userId}</td>
				<td>${c.createdDate}</td>
				<td><a
					href="${pageContext.request.contextPath}/category?action=edit&id=${c.id}">Sửa</a>
					| <a
					href="${pageContext.request.contextPath}/category?action=delete&id=${c.id}"
					onclick="return confirm('Bạn có chắc muốn xóa?');">Xóa</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>