package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.domain.Product;
import by.teachmeskills.eshop.exceptions.CommandException;
import by.teachmeskills.eshop.utils.CRUDUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

import static by.teachmeskills.eshop.utils.RequestParamsEnum.PRODUCT_ID;

public class SelectedProductPageCommand implements BaseCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        HttpSession session = request.getSession();
        int id = Integer.parseInt(request.getParameter(PRODUCT_ID.getValue()));
        List<Product> products = CRUDUtils.getAllProducts();

        for (Product product : products) {
            if (id == product.getId()) {
                Product selectedProduct = product;
                session.setAttribute("selectproducts", selectedProduct);
            }
        }
        return "/selected.jsp";
    }
}