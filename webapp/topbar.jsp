<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<div class="col-sm-6">
    <ul class="list-inline right-topbar pull-right">
        <c:choose>
            <!-- Nếu chưa đăng nhập -->
            <c:when test="${sessionScope.account == null}">
                <li>
                    <a href="${pageContext.request.contextPath }/LOGIN.jsp">Đăng nhập</a> |
                    <a href="${pageContext.request.contextPath }/register.jsp">Đăng ký</a> |
                    <a href="${pageContext.request.contextPath }/forget-password.jsp">Quên mật khẩu?</a>
                </li>
                <li><i class="search fa fa-search search-button"></i></li>
            </c:when>

            <!-- Nếu đã đăng nhập -->
            <c:otherwise>
                <li>
                    <a href="${pageContext.request.contextPath }/member/myaccount">
                        ${sessionScope.account.fullName}
                    </a> |
                    <a href="${pageContext.request.contextPath }/logout">Đăng xuất</a>
                </li>
                <li><i class="search fa fa-search search-button"></i></li>
            </c:otherwise>
        </c:choose>
    </ul>
</div>
