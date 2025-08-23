package LoginServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns= {"/login"})
public class LoginServlet extends HttpServlet  {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
	IOException {
	resp.setContentType("text/html");
		//login by session
		PrintWriter out = resp.getWriter();
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		if (username.equals("huy")&& password.equals("123")) {
			out.print("Chào mừng bạn, " + username);
			HttpSession session = req.getSession();
			session.setAttribute("name", username);
		} else {
			out.print("Tài khoản hoặc mật khẩu không chính xác");
			req.getRequestDispatcher("Login.html").include(req,
					resp);
		}
	    //login by cookie		
//		lấy dữ liệu từ tham số của form
//		String user = req.getParameter("username");
//		String pass = req.getParameter("password");
//		if(user.equals("huy") && pass.equals("123"))
//		{
//		Cookie cookie = new Cookie("username", user); //khởi tạo cookie
//		//thiết lập thời gian tồn tại 30s của cookie
//		cookie.setMaxAge(30);
//		//thêm cookie vào response
//		resp.addCookie(cookie);
//		//chuyển sang trang HelloServlet
//		resp.sendRedirect(req.getContextPath() + "/hello");
//		}else {
//		//chuyển sang trang LoginServlet
//		resp.sendRedirect(req.getContextPath() + "/login");
//		}
	}

}

