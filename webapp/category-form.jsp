<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Category Form</title>
</head>
<body>
    <h2><c:if test="${category == null}">Thêm mới</c:if><c:if test="${category != null}">Cập nhật</c:if> Category</h2>

    <form action="${pageContext.request.contextPath}/category" method="post">
        <input type="hidden" name="id" value="${category.id}">

        <label>Tên Category:</label>
        <input type="text" name="name" value="${category.name}" required><br><br>

        <label>User ID:</label>
        <input type="number" name="user_id" value="${category.userId}" required><br><br>

        <button type="submit">Lưu</button>
    </form>

    <p><a href="${pageContext.request.contextPath}/category">Quay lại danh sách</a></p>
</body>
</html>
