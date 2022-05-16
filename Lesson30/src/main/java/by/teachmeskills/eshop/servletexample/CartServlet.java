package by.teachmeskills.eshop.servletexample;

import by.teachmeskills.eshop.model.Phone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        List<Phone> phonesInCart = getPhoneInCartById(id);

        req.setAttribute("phonesInCart", phonesInCart);
        req.getServletContext().getRequestDispatcher("/cart.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }


    protected static List<Phone> getPhoneInCartById(int id) {
        List<Phone> phones = new ArrayList<>();

        switch (id) {
            case 1 -> {
                Phone iphone11 = new Phone(1, "iPhone11", "Apple iOS, экран 6.1 inch IPS (828x1792), Apple A13 Bionic, ОЗУ 4 ГБ, флэш-память 64 ГБ, камера 12 Мп, аккумулятор 3046 мАч, 1 SIM", 2500, "iphone11.jpg");
                phones.add(iphone11);
            }
            case 2 -> {
                Phone iphone12 = new Phone(2, "iPhone12", "Apple iOS, экран 6.1 inch OLED (1170x2532), Apple A14 Bionic, ОЗУ 4 ГБ, флэш-память 64 ГБ, камера 12 Мп, аккумулятор 2815 мАч, 1 SIM", 3000, "iphone12.jpg");
                phones.add(iphone12);
            }
            case 3 -> {
                Phone iphone13 = new Phone(3, "iPhone13", "Apple iOS, экран 6.1 inch OLED (1170x2532), Apple A15 Bionic, ОЗУ 4 ГБ, флэш-память 128 ГБ, камера 12 Мп, аккумулятор 3227 мАч, 1 SIM", 4000, "iphone13.jpg");
                phones.add(iphone13);
            }
            case 4 -> {
                Phone samsungs20 = new Phone(4, "Samsung S20", "Android, экран 6.2 inch AMOLED (1440x3200), Exynos 990, ОЗУ 8 ГБ, флэш-память 128 ГБ, карты памяти, камера 12 Мп, аккумулятор 4000 мАч, 2 SIM", 1800, "samsungs20.jpg");
                phones.add(samsungs20);
            }
            case 5 -> {
                Phone samsungnote20 = new Phone(5, "Samsung Note 20", "Android, экран 6.9inch AMOLED (1440x3088), Qualcomm Snapdragon 865+, ОЗУ 12 ГБ, флэш-память 512 ГБ, карты памяти, камера 108 Мп, аккумулятор 4500 мАч, 2 SIM", 2300, "samsungnote20.jpg");
                phones.add(samsungnote20);
            }
            case 6 -> {
                Phone samsungs21 = new Phone(6, "Samsung S21", "Android, экран 6.2 inch AMOLED (1080x2400), Exynos 2100, ОЗУ 8 ГБ, флэш-память 256 ГБ, камера 64 Мп, аккумулятор 4000 мАч, 2 SIM", 3700, "samsungs21.jpg");
                phones.add(samsungs21);
            }

            default -> System.out.println("Incorrect Id");
        }
        return phones;
    }
}
