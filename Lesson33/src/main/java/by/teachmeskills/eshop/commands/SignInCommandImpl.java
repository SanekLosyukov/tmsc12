package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.domain.Category;
import by.teachmeskills.eshop.domain.User;
import by.teachmeskills.eshop.exceptions.CommandException;
import by.teachmeskills.eshop.utils.CRUDUtils;
import by.teachmeskills.eshop.utils.PagesPathEnum;
import by.teachmeskills.eshop.utils.RequestParamsEnum;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


public class SignInCommandImpl implements BaseCommand {

    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        String name = request.getParameter(RequestParamsEnum.NAME.getValue());
        String surname = request.getParameter(RequestParamsEnum.SURNAME.getValue());
        String email = request.getParameter(RequestParamsEnum.EMAIL.getValue());
        String date = request.getParameter(RequestParamsEnum.DATE.getValue());

        User validateUser = new User(name, surname, email, date);
        List<User> usersFromDB = CRUDUtils.getAllUsers();

        for (User user : usersFromDB) {
            if (user.equals(validateUser)) {
                HttpSession session = request.getSession();
                session.setAttribute("user", validateUser);

                List<Category> categories = new ArrayList<>();
                Category mobilePhones = new Category(1, "Mobile phones", "mobile.jpg");
                Category laptops = new Category(2, "Laptops", "laptop.jpg");
                Category fridges = new Category(3, "Fridges", "fridge.jpg");
                categories.add(mobilePhones);
                categories.add(laptops);
                categories.add(fridges);

                request.setAttribute("categories", categories);

                return PagesPathEnum.HOME_PAGE.getPath();
            } else {
                return PagesPathEnum.SIGN_IN_PAGE.getPath();
            }
        }
        return null;
    }
}
