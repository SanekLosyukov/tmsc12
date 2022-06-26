package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.entities.User;
import by.teachmeskills.eshop.exceptions.CommandException;
import by.teachmeskills.eshop.exceptions.RequestParamNullException;
import by.teachmeskills.eshop.repositories.impl.UserRepositoryImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import static by.teachmeskills.eshop.utils.HttpRequestParamValidator.validateParamNotNull;
import static by.teachmeskills.eshop.utils.PagesPathEnum.REGISTER_PAGE;
import static by.teachmeskills.eshop.utils.RequestParamsEnum.*;

public class RegisterCommandImpl implements BaseCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException, ServletException, IOException {
        String name = request.getParameter(NAME.getValue());
        String surname = request.getParameter(SURNAME.getValue());
        String email = request.getParameter(EMAIL.getValue());
        String password = request.getParameter(PASSWORD.getValue());
        String date = request.getParameter(DATE.getValue());

        try {
            validateParamNotNull(name);
            validateParamNotNull(surname);
            validateParamNotNull(email);
            validateParamNotNull(password);
            validateParamNotNull(date);

        } catch (RequestParamNullException e) {
            System.out.println(e.getMessage());
        }
        User user = new User(name, surname, email, password, date);
        UserRepositoryImpl userRepository = new UserRepositoryImpl();

        userRepository.saveUser(user);
        return REGISTER_PAGE.getPath();
    }
}