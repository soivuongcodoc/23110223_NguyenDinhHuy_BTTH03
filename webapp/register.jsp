<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng ký tài khoản</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"/>
</head>
<body>
    <form action="btap" method="post">
        <h2>Tạo tài khoản mới</h2>

        <c:if test="${alert != null}">
            <h3 class="alert alert-danger">${alert}</h3>
        </c:if>

        <!-- Email -->
        <section>
            <label class="input login-input">
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-envelope"></i></span>
                    <input type="email" placeholder="Email" name="email" class="form-control" required>
                </div>
            </label>
        </section>

        <!-- Username -->
        <section>
            <label class="input login-input">
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-user"></i></span>
                    <input type="text" placeholder="Tài khoản" name="username" class="form-control" required>
                </div>
            </label>
        </section>

        <!-- Fullname -->
        <section>
            <label class="input login-input">
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-id-card"></i></span>
                    <input type="text" placeholder="Họ và tên" name="fullname" class="form-control">
                </div>
            </label>
        </section>

        <!-- Password -->
        <section>
            <label class="input login-input">
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                    <input type="password" placeholder="Mật khẩu" name="password" class="form-control" required>
                </div>
            </label>
        </section>

        <!-- Phone -->
        <section>
            <label class="input login-input">
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-phone"></i></span>
                    <input type="text" placeholder="Số điện thoại" name="phone" class="form-control">
                </div>
            </label>
        </section>

        <!-- Nút submit -->
        <section>
            <button type="submit" class="btn btn-primary">Đăng ký</button>
        </section>
    </form>
</body>
</html>
