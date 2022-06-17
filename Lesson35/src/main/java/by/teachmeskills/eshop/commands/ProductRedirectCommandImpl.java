package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.domain.Product;
import by.teachmeskills.eshop.exceptions.CommandException;
import by.teachmeskills.eshop.utils.CRUDUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

import static by.teachmeskills.eshop.utils.PagesPathEnum.PRODUCT_PAGE;
import static by.teachmeskills.eshop.utils.RequestParamsEnum.PRODUCTS;
import static by.teachmeskills.eshop.utils.RequestParamsEnum.PRODUCT_ID;

public class ProductRedirectCommandImpl implements BaseCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        HttpSession session = request.getSession();
        int id = Integer.parseInt(request.getParameter(PRODUCT_ID.getValue()));
        List<Product> products = CRUDUtils.getAllProducts();

        List<Product> getProducts = getProductsByCategoryId(id, products);
        session.setAttribute(PRODUCTS.getValue(), getProducts);
        return PRODUCT_PAGE.getPath();
    }

    protected static List<Product> getProductsByCategoryId(int id, List<Product> products) {
        List<Product> getProducts = new ArrayList<>();
        switch (id) {
            case 1 -> {
                getProducts = products.subList(0, 3);
            }
            case 2 -> {
                getProducts = products.subList(3, 6);
            }
            default -> System.out.println("Incorrect Id");
        }
        return getProducts;
    }
}
