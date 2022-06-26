package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.entities.Product;
import by.teachmeskills.eshop.exceptions.CommandException;
import by.teachmeskills.eshop.services.impl.ProductServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

import static by.teachmeskills.eshop.utils.PagesPathEnum.PRODUCT_PAGE;
import static by.teachmeskills.eshop.utils.RequestParamsEnum.PRODUCTS;
import static by.teachmeskills.eshop.utils.RequestParamsEnum.PRODUCT_ID;

public class ProductRedirectCommandImpl implements BaseCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        HttpSession session = request.getSession();
        int id = Integer.parseInt(request.getParameter(PRODUCT_ID.getValue()));

        ProductServiceImpl productService = new ProductServiceImpl();
        List<Product> products = productService.read();

        List<Product> getProducts = productService.getProductsByCategoryId(id, products);
        session.setAttribute(PRODUCTS.getValue(), getProducts);
        return PRODUCT_PAGE.getPath();
    }
}
