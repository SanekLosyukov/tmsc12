package by.teachmeskills.eshop.servletexample;

import by.teachmeskills.eshop.exceptions.RequestParamNullException;
import by.teachmeskills.eshop.model.User;
import by.teachmeskills.eshop.utils.CRUDUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static by.teachmeskills.eshop.utils.HttpRequestParamValidator.validateParamNotNull;


@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String email = req.getParameter("email");
        String date = req.getParameter("date");
//        User user = null;
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

        resp.sendRedirect(checkReceivedUser(user, req));  // в случае успешной регистрации - редирект на login сервлет
    }

    private String checkReceivedUser(User user, HttpServletRequest req) throws ServletException, IOException {
        if (user != null) {
            return "/login";
        } else {
            return "/register";
        }
    }
}
