package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.domain.Order;
import by.teachmeskills.eshop.exceptions.CommandException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static by.teachmeskills.eshop.utils.PagesPathEnum.CABINET_PAGE;
import static by.teachmeskills.eshop.utils.RequestParamsEnum.*;

public class CabinetCommandImpl implements BaseCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        HttpSession session = request.getSession();
        Order order = (Order) session.getAttribute(ORDER.getValue());

        if (order == null) {
            session.setAttribute(ORDER_PRODUCTS.getValue(), "");
        } else {
            session.setAttribute(ORDER_PRODUCTS.getValue(), order.getProducts());
            session.setAttribute(ORDER_TOTAL_PRICE.getValue(), order.getTotalPrice());
        }
        return (CABINET_PAGE.getPath());
    }
}