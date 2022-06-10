package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.domain.Cart;
import by.teachmeskills.eshop.exceptions.CommandException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static by.teachmeskills.eshop.utils.PagesPathEnum.CART_PAGE;
import static by.teachmeskills.eshop.utils.RequestParamsEnum.*;

public class CartRedirectCommandImpl implements BaseCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute(CART.getValue());

        if (cart == null) {
            session.setAttribute(CART_PRODUCTS.getValue(), "");
        } else {
            session.setAttribute(CART_PRODUCTS.getValue(), cart.getProducts());
            session.setAttribute(TOTALPRICE.getValue(), cart.getTotalPrice());
        }
        return CART_PAGE.getPath();
    }
}