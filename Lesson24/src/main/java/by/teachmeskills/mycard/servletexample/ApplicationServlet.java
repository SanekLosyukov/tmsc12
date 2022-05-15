package by.teachmeskills.mycard.servletexample;

import by.teachmeskills.mycard.exceptions.RequestParamNullException;
import by.teachmeskills.mycard.model.Card;
import by.teachmeskills.mycard.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static by.teachmeskills.mycard.utils.HttpRequestParamValidator.validateParamNotNull;

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
            user = new User(login, pass);
        } catch (RequestParamNullException e) {
            System.out.println(e.getMessage());
        }

        RequestDispatcher rd = req.getRequestDispatcher(checkReceivedUser(user, req));
        rd.forward(req, resp);

    }

    private String checkReceivedUser(User user, HttpServletRequest request) {
        if (user != null
                && request.getParameter("username").equals(ADMIN_LOGIN)
                && request.getParameter("password").equals(ADMIN_PASSWORD)) {

            request.getSession().setAttribute("username", user);
            Card myCard = new Card("Alexandr Losyukov", "photo.jpg");
            request.setAttribute("myCard", myCard);

            return "home.jsp";
        } else {
            return "signin.jsp";
        }
    }
}