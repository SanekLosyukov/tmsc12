package by.teachmeskills.eshop.servletexample;

import by.teachmeskills.eshop.exceptions.RequestParamNullException;
import by.teachmeskills.eshop.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static by.teachmeskills.eshop.utils.HttpRequestParamValidator.validateParamNotNull;

@WebServlet("/login")
public class ApplicationServlet extends HttpServlet {

    private static final String ADMIN_LOGIN = "admin";
    private static final String ADMIN_PASSWORD = "admin";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("signin.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("username");
        String pass = req.getParameter("password");
        User user = null;

        try {
            validateParamNotNull(login);
            validateParamNotNull(pass);
            user = new User(ADMIN_LOGIN, ADMIN_PASSWORD);

        } catch (RequestParamNullException e) {
            System.out.println(e.getMessage());
        }

        resp.sendRedirect(checkReceivedUser(user, req));  // в случае успешного логина - редирект на home сервлет
    }

    private String checkReceivedUser(User user, HttpServletRequest req) throws ServletException, IOException {
        if (user != null
                && req.getParameter("username").equals(ADMIN_LOGIN)
                && req.getParameter("password").equals(ADMIN_PASSWORD)) {
            return "/home";
        } else {
            return "/login";
        }
    }
}
