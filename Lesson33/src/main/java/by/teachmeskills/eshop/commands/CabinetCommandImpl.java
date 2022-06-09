package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.domain.Order;
import by.teachmeskills.eshop.exceptions.CommandException;
import by.teachmeskills.eshop.utils.PagesPathEnum;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class CabinetCommandImpl implements BaseCommand {

    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        HttpSession session = request.getSession();
        Order order = (Order) session.getAttribute("order");

        if (order == null) {
            session.setAttribute("orderProducts", "");
        } else {
            session.setAttribute("orderProducts", order.getProducts());
        }
        return (PagesPathEnum.CABINET_PAGE.getPath());
    }
}