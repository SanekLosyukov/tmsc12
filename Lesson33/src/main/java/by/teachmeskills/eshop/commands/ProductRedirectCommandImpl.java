package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.domain.Product;
import by.teachmeskills.eshop.exceptions.CommandException;
import by.teachmeskills.eshop.utils.PagesPathEnum;
import by.teachmeskills.eshop.utils.RequestParamsEnum;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


public class ProductRedirectCommandImpl implements BaseCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {

        int id = Integer.parseInt(request.getParameter(RequestParamsEnum.PRODUCT_ID.getValue()));
        List<Product> products = getProductsByCategoryId(id);
        request.setAttribute(RequestParamsEnum.PRODUCTS.getValue(), products);
        return PagesPathEnum.PRODUCT_PAGE.getPath();
    }

    protected static List<Product> getProductsByCategoryId(int id) {
        List<Product> products = new ArrayList<>();

        switch (id) {
            case 1 -> {
                Product iphone11 = new Product(1, "iPhone11", "Apple iOS, экран 6.1 inch IPS (828x1792), Apple A13 Bionic, ОЗУ 4 ГБ, флэш-память 64 ГБ, камера 12 Мп, аккумулятор 3046 мАч, 1 SIM", 2500, "iphone11.jpg");
                Product iphone12 = new Product(2, "iPhone12", "Apple iOS, экран 6.1 inch OLED (1170x2532), Apple A14 Bionic, ОЗУ 4 ГБ, флэш-память 64 ГБ, камера 12 Мп, аккумулятор 2815 мАч, 1 SIM", 3000, "iphone12.jpg");
                Product iphone13 = new Product(3, "iPhone13", "Apple iOS, экран 6.1 inch OLED (1170x2532), Apple A15 Bionic, ОЗУ 4 ГБ, флэш-память 128 ГБ, камера 12 Мп, аккумулятор 3227 мАч, 1 SIM", 4000, "iphone13.jpg");
                products.add(iphone11);
                products.add(iphone12);
                products.add(iphone13);
            }
            case 2 -> {
                Product samsungs20 = new Product(4, "Samsung S20", "Android, экран 6.2 inch AMOLED (1440x3200), Exynos 990, ОЗУ 8 ГБ, флэш-память 128 ГБ, карты памяти, камера 12 Мп, аккумулятор 4000 мАч, 2 SIM", 1800, "samsungs20.jpg");
                Product samsungnote20 = new Product(5, "Samsung Note 20", "Android, экран 6.9inch AMOLED (1440x3088), Qualcomm Snapdragon 865+, ОЗУ 12 ГБ, флэш-память 512 ГБ, карты памяти, камера 108 Мп, аккумулятор 4500 мАч, 2 SIM", 2300, "samsungnote20.jpg");
                Product samsungs21 = new Product(6, "Samsung S21", "Android, экран 6.2 inch AMOLED (1080x2400), Exynos 2100, ОЗУ 8 ГБ, флэш-память 256 ГБ, камера 64 Мп, аккумулятор 4000 мАч, 2 SIM", 3700, "samsungs21.jpg");
                products.add(samsungs20);
                products.add(samsungnote20);
                products.add(samsungs21);
            }
            default -> System.out.println("Incorrect Id");
        }
        return products;
    }
}
