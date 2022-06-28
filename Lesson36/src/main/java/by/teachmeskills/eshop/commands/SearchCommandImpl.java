package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.entities.Product;
import by.teachmeskills.eshop.exceptions.CommandException;
import by.teachmeskills.eshop.services.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

public class SearchCommandImpl implements BaseCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException, ServletException, IOException {
        String search = request.getParameter("search");
        ProductServiceImpl productService = new ProductServiceImpl();
        List<Product> products = productService.getSearchFromDB(search);
        request.setAttribute("products", products);
        return "/product.jsp";
    }
}
