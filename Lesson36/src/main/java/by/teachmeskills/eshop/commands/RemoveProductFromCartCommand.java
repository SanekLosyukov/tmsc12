package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.entities.Cart;
import by.teachmeskills.eshop.exceptions.CommandException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static by.teachmeskills.eshop.utils.PagesPathEnum.CART_PAGE;
import static by.teachmeskills.eshop.utils.RequestParamsEnum.CART;
import static by.teachmeskills.eshop.utils.RequestParamsEnum.PRODUCT_ID;


public class RemoveProductFromCartCommand implements BaseCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        HttpSession session = request.getSession();
        int id = Integer.parseInt(request.getParameter(PRODUCT_ID.getValue()));

        Cart cart;
        Object objCart = session.getAttribute(CART.getValue());

        if (objCart != null) {
            cart = (Cart) objCart;
        } else {
            cart = new Cart();
            session.setAttribute(CART.getValue(), cart);
        }

        cart.removeProduct(id);

        return CART_PAGE.getPath();
    }
}
