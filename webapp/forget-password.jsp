<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quên mật khẩu</title>
</head>
<body>
    <h2>Quên mật khẩu</h2>
    <c:if test="${alert != null}">
        <p style="color:red">${alert}</p>
    </c:if>

    <form action="${pageContext.request.contextPath}/forgetpassword" method="post">
        <label>Email đã đăng ký:</label>
        <input type="text" name="email" required>
        <button type="submit">Lấy lại mật khẩu</button>
    </form>

    <p><a href="${pageContext.request.contextPath}/LOGIN.jsp">Quay lại đăng nhập</a></p>
</body>
</html>
