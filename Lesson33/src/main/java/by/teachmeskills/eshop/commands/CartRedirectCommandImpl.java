package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.domain.Cart;
import by.teachmeskills.eshop.exceptions.CommandException;
import by.teachmeskills.eshop.utils.PagesPathEnum;
import by.teachmeskills.eshop.utils.RequestParamsEnum;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


public class CartRedirectCommandImpl implements BaseCommand {

    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("cart");

        if (cart == null) {
            session.setAttribute(RequestParamsEnum.CART_PRODUCTS.getValue(), "");
        } else {
            session.setAttribute(RequestParamsEnum.CART_PRODUCTS.getValue(), cart.getProducts());
        }
        return PagesPathEnum.CART_PAGE.getPath();
    }

}