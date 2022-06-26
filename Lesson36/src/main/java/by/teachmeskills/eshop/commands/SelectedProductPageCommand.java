package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.entities.Image;
import by.teachmeskills.eshop.entities.Product;
import by.teachmeskills.eshop.exceptions.CommandException;
import by.teachmeskills.eshop.services.impl.ImageServiceImpl;
import by.teachmeskills.eshop.services.impl.ProductServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

import static by.teachmeskills.eshop.utils.RequestParamsEnum.PRODUCT_ID;

public class SelectedProductPageCommand implements BaseCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        HttpSession session = request.getSession();
        int id = Integer.parseInt(request.getParameter(PRODUCT_ID.getValue()));

        ProductServiceImpl productService = new ProductServiceImpl();
        List<Product> products = productService.getAllProductsWithAllImages();
        List<Product> selectedProducts = productService.getSelectedProductsById(id, products);

        ImageServiceImpl imageService = new ImageServiceImpl();
        List<Image> secondaryImages = imageService.getAllSecondaryImages(id);

        request.setAttribute("selectedproducts", selectedProducts);
        request.setAttribute("images", secondaryImages);
        return "/selected.jsp";
    }


}


