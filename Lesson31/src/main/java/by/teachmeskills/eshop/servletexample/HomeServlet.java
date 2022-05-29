package by.teachmeskills.eshop.servletexample;

import by.teachmeskills.eshop.model.Category;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Category> categories = new ArrayList<>();

        Category mobilePhones = new Category(1, "Mobile phones", "mobile.jpg");
        Category laptops = new Category(2, "Laptops", "laptop.jpg");
        Category fridges = new Category(3, "Fridges", "fridge.jpg");

        categories.add(mobilePhones);
        categories.add(laptops);
        categories.add(fridges);

        req.setAttribute("categories", categories);
        req.getServletContext().getRequestDispatcher("/home.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
