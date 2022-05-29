package by.teachmeskills.eshop.servletexample;

import by.teachmeskills.eshop.model.Checkout;
import by.teachmeskills.eshop.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/checkout")
public class CheckoutProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = getProductById(id);

        Checkout checkout;
        Object objCheckout = session.getAttribute("checkout");

        if (objCheckout != null) {
            checkout = (Checkout) objCheckout;
        } else {
            checkout = new Checkout();
            session.setAttribute("checkout", checkout);
        }

        checkout.addProduct(product);

        session.setAttribute("checkout", checkout);
//
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getServletContext().getRequestDispatcher("/cart.jsp").forward(req, resp);
    }


    protected Product getProductById(int id) {

        switch (id) {
            case 1 -> {
                return new Product(1, "iPhone11", "Apple iOS, экран 6.1 inch IPS (828x1792), Apple A13 Bionic, ОЗУ 4 ГБ, флэш-память 64 ГБ, камера 12 Мп, аккумулятор 3046 мАч, 1 SIM", 2500, "iphone11.jpg");
            }
            case 2 -> {
                return new Product(2, "iPhone12", "Apple iOS, экран 6.1 inch OLED (1170x2532), Apple A14 Bionic, ОЗУ 4 ГБ, флэш-память 64 ГБ, камера 12 Мп, аккумулятор 2815 мАч, 1 SIM", 3000, "iphone12.jpg");
            }
            case 3 -> {
                return new Product(3, "iPhone13", "Apple iOS, экран 6.1 inch OLED (1170x2532), Apple A15 Bionic, ОЗУ 4 ГБ, флэш-память 128 ГБ, камера 12 Мп, аккумулятор 3227 мАч, 1 SIM", 4000, "iphone13.jpg");
            }
            case 4 -> {
                return new Product(4, "Samsung S20", "Android, экран 6.2 inch AMOLED (1440x3200), Exynos 990, ОЗУ 8 ГБ, флэш-память 128 ГБ, карты памяти, камера 12 Мп, аккумулятор 4000 мАч, 2 SIM", 1800, "samsungs20.jpg");
            }
            case 5 -> {
                return new Product(5, "Samsung Note 20", "Android, экран 6.9inch AMOLED (1440x3088), Qualcomm Snapdragon 865+, ОЗУ 12 ГБ, флэш-память 512 ГБ, карты памяти, камера 108 Мп, аккумулятор 4500 мАч, 2 SIM", 2300, "samsungnote20.jpg");
            }
            case 6 -> {
                return new Product(6, "Samsung S21", "Android, экран 6.2 inch AMOLED (1080x2400), Exynos 2100, ОЗУ 8 ГБ, флэш-память 256 ГБ, камера 64 Мп, аккумулятор 4000 мАч, 2 SIM", 3700, "samsungs21.jpg");
            }

            default -> System.out.println("Incorrect Id");
        }
        return null;
    }
}