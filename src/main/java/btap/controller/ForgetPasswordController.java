package btap.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import btap.Model.User;
import btap.Service.UserService;
import btap.Service.UserServiceImpl;

/**
 * Servlet implementation class ForgetPasswordController
 */
@WebServlet("/forgetpassword")
public class ForgetPasswordController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserService service = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/forget-password.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        User user = service.getByEmail(email);

        if (user != null) {
            // demo: hiển thị mật khẩu cũ
            request.setAttribute("alert", "Mật khẩu của bạn là: " + user.getPassWord());

            // hoặc tốt hơn: reset về "123456"
            // service.updatePassword(email, "123456");
            // request.setAttribute("alert", "Mật khẩu mới của bạn là: 123456");
        } else {
            request.setAttribute("alert", "Email không tồn tại!");
        }

        request.getRequestDispatcher("/forget-password.jsp").forward(request, response);
    }
}
