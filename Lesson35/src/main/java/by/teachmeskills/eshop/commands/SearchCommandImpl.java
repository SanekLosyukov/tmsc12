package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.domain.Product;
import by.teachmeskills.eshop.exceptions.CommandException;
import by.teachmeskills.eshop.utils.CRUDUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

public class SearchCommandImpl implements BaseCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException, ServletException, IOException {
        String search = request.getParameter("search");
        List<Product> products = CRUDUtils.getSearchFromDB(search);
        request.setAttribute("products", products);

        return "/product.jsp";
    }
}
