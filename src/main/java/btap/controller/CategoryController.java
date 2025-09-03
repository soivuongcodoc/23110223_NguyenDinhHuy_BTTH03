package btap.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import btap.Model.Category;

import btap.Service.CategoryService;
import btap.Service.CategoryServiceImpl;

/**
 * Servlet implementation class CategoryController
 */
@WebServlet("/category")
public class CategoryController extends HttpServlet {
    private CategoryService service = new CategoryServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) action = "list";

        switch (action) {
            case "new":
                req.getRequestDispatcher("/category-form.jsp").forward(req, resp);
                break;
            case "edit":
                int id = Integer.parseInt(req.getParameter("id"));
                Category c = service.findById(id);
                req.setAttribute("category", c);
                req.getRequestDispatcher("/category-form.jsp").forward(req, resp);
                break;
            case "delete":
                service.delete(Integer.parseInt(req.getParameter("id")));
                resp.sendRedirect("category");
                break;
            default: // list
                req.setAttribute("list", service.findAll());
                req.getRequestDispatcher("/category-list.jsp").forward(req, resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        int userId = Integer.parseInt(req.getParameter("user_id"));

        Category c = new Category();
        c.setName(name);
        c.setUserId(userId);

        if (id == null || id.isEmpty()) {
            service.insert(c);
        } else {
            c.setId(Integer.parseInt(id));
            service.update(c);
        }
        resp.sendRedirect("category");
    }
}