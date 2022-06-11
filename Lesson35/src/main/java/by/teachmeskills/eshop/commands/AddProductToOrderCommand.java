package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.domain.Order;
import by.teachmeskills.eshop.domain.Product;
import by.teachmeskills.eshop.exceptions.CommandException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static by.teachmeskills.eshop.utils.PagesPathEnum.CABINET_PAGE;
import static by.teachmeskills.eshop.utils.RequestParamsEnum.*;

public class AddProductToOrderCommand implements BaseCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException, ServletException, IOException {

        HttpSession session = request.getSession();
        int id = Integer.parseInt(request.getParameter("product_id"));
        Product product = getProductById(id);

        Order order;
        Object objOrder = session.getAttribute("order");

        if (objOrder != null) {
            order = (Order) objOrder;
        } else {
            order = new Order();
            session.setAttribute(ORDER.getValue(), order);
        }

        order.addProduct(product);

        session.setAttribute(PRODUCT.getValue(), product);
        session.setAttribute(ORDER_PRODUCTS.getValue(), order.getProducts());
        session.setAttribute(ORDER_TOTAL_PRICE.getValue(), order.getTotalPrice());
        return CABINET_PAGE.getPath();
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
