package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.domain.Image;
import by.teachmeskills.eshop.domain.Product;
import by.teachmeskills.eshop.exceptions.CommandException;
import by.teachmeskills.eshop.utils.CRUDUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

import static by.teachmeskills.eshop.utils.RequestParamsEnum.PRODUCT_ID;

public class SelectedProductPageCommand implements BaseCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        HttpSession session = request.getSession();
        int id = Integer.parseInt(request.getParameter(PRODUCT_ID.getValue()));
        List<Product> products = CRUDUtils.getAllProductsWithAllImages();
        List<Product> selectedProducts = getSelectedProductsById(id, products);
        List<Image> secondaryImages = CRUDUtils.getAllSecondaryImages(id);
        request.setAttribute("selectedproducts", selectedProducts);
        request.setAttribute("images", secondaryImages);
        return "/selected.jsp";
    }

    protected static List<Product> getSelectedProductsById(int id, List<Product> products) {
        List<Product> selectedProducts = new ArrayList<>();
        for (Product product : products) {
            if (id == product.getId()) {
                selectedProducts.add(product);
            }
        }
        return selectedProducts;
    }
}


