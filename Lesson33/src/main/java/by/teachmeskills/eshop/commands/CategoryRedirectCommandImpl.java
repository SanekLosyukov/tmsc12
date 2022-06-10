package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.domain.Product;
import by.teachmeskills.eshop.exceptions.CommandException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

import static by.teachmeskills.eshop.utils.PagesPathEnum.CATEGORY_PAGE;
import static by.teachmeskills.eshop.utils.RequestParamsEnum.ID;
import static by.teachmeskills.eshop.utils.RequestParamsEnum.PRODUCTLIST;

public class CategoryRedirectCommandImpl implements BaseCommand {

    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        HttpSession session = request.getSession();
        int id = Integer.parseInt(request.getParameter(ID.getValue()));
        List<Product> products = getProductsByCategoryId(id);
        session.setAttribute(PRODUCTLIST.getValue(), products);
        return CATEGORY_PAGE.getPath();
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
