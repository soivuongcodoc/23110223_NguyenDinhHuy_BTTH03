<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Waiting</title>
</head>
<body>
    <h2>Chào mừng ${sessionScope.account.fullName}!</h2>
    <p>Bạn đã đăng nhập thành công.</p>
    <a href="${pageContext.request.contextPath}/logout">Đăng xuất</a>
</body>
</html>
