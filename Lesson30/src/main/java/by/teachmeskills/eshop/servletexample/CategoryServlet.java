package by.teachmeskills.eshop.servletexample;

import by.teachmeskills.eshop.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/category")
public class CategoryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        List<Product> products = getProductsByCategoryId(id);
        req.setAttribute("productList", products);
        req.getServletContext().getRequestDispatcher("/category.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    private List<Product> getProductsByCategoryId(int id) {
        List<Product> products = new ArrayList<>();

        switch (id) {
            case 1 -> {
                Product iphone = new Product(1, "iPhone", "World famous phones from Apple", "iphone.jpg");
                Product samsung = new Product(2, "Samsung", "Korean phone manufacturer", "samsung.jpg");
                products.add(iphone);
                products.add(samsung);

            }
            case 2 -> {
                Product huawei = new Product(3, "Huawei", "15 inch display, new model", "huawei.jpg");
                Product xiaomi = new Product(4, "Xiaomi", "17 inch display, Battery 6000 mAh", "xiaomi.jpg");
                products.add(huawei);
                products.add(xiaomi);
            }
            case 3 -> {
                Product bosch = new Product(5, "Bosch", "5 years warranty", "bosch.jpg");
                Product atlant = new Product(6, "Atlant", "Made in Belarus", "atlant.jpg");
                products.add(bosch);
                products.add(atlant);
            }
            default -> System.out.println("Incorrect Id");
        }
        return products;
    }
}
