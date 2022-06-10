package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.domain.User;
import by.teachmeskills.eshop.exceptions.CommandException;
import by.teachmeskills.eshop.exceptions.RequestParamNullException;
import by.teachmeskills.eshop.utils.CRUDUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import static by.teachmeskills.eshop.utils.HttpRequestParamValidator.validateParamNotNull;
import static by.teachmeskills.eshop.utils.PagesPathEnum.REGISTER_PAGE;
import static by.teachmeskills.eshop.utils.PagesPathEnum.SIGN_IN_PAGE;
import static by.teachmeskills.eshop.utils.RequestParamsEnum.*;

public class RegisterCommandImpl implements BaseCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException, ServletException, IOException {
        String name = request.getParameter(NAME.getValue());
        String surname = request.getParameter(SURNAME.getValue());
        String email = request.getParameter(EMAIL.getValue());
        String date = request.getParameter(DATE.getValue());

        try {
            validateParamNotNull(name);
            validateParamNotNull(surname);
            validateParamNotNull(email);
            validateParamNotNull(date);

        } catch (RequestParamNullException e) {
            System.out.println(e.getMessage());
        }
        User user = new User(name, surname, email, date);
        CRUDUtils.saveUser(user);
        return checkReceivedUser(user, request);
    }

    private String checkReceivedUser(User user, HttpServletRequest request) throws ServletException, IOException {
        if (user != null) {
            return SIGN_IN_PAGE.getPath();
        } else {
            return REGISTER_PAGE.getPath();
        }
    }
}