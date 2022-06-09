package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.domain.User;
import by.teachmeskills.eshop.exceptions.CommandException;
import by.teachmeskills.eshop.exceptions.RequestParamNullException;
import by.teachmeskills.eshop.utils.CRUDUtils;
import by.teachmeskills.eshop.utils.PagesPathEnum;
import by.teachmeskills.eshop.utils.RequestParamsEnum;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import static by.teachmeskills.eshop.utils.HttpRequestParamValidator.validateParamNotNull;

public class RegisterCommandImpl implements BaseCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException, ServletException, IOException {
        String name = request.getParameter(RequestParamsEnum.NAME.getValue());
        String surname = request.getParameter(RequestParamsEnum.SURNAME.getValue());
        String email = request.getParameter(RequestParamsEnum.EMAIL.getValue());
        String date = request.getParameter(RequestParamsEnum.DATE.getValue());

        try {
            validateParamNotNull(name);
            validateParamNotNull(surname);
            validateParamNotNull(email);
            validateParamNotNull(date);

        } catch (RequestParamNullException e) {
            System.out.println(e.getMessage());
        }
        User user = new User(name, surname, email, date);

        CRUDUtils.saveUser(user); //сохраняю данные пользователя в базу для дальнейшего сравнения при валидации

        return checkReceivedUser(user, request);  // в случае успешной регистрации - редирект на login сервлет
    }

    private String checkReceivedUser(User user, HttpServletRequest request) throws ServletException, IOException {
        if (user != null) {
            return PagesPathEnum.SIGN_IN_PAGE.getPath();
        } else {
            return PagesPathEnum.REGISTER_PAGE.getPath();
        }
    }
}