<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
    <form action="login" method="post">
        <h2>Đăng nhập</h2>
        <c:if test="${alert !=null}">
            <h3 style="color:red">${alert}</h3>
        </c:if>
        <section>
            <label>Tài khoản:</label>
            <input type="text" placeholder="Tài khoản" name="username"
                   class="form-control">
        </section>
        <section>
            <label>Mật khẩu:</label>
            <input type="password" placeholder="Mật khẩu" name="password"
                   class="form-control">
        </section>
        <button type="submit">Đăng nhập</button>
    </form>
</body>
</html>
