package by.teachmeskills.servletlogin.servlet;

import by.teachmeskills.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/login.html");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        String email = req.getParameter("email");
        String password = req.getParameter("pass");

        if (!user.getEmail().equals(email) || !user.getPassword().equals(password)) {
            resp.getWriter().write("Неверные данные пользователя!");
        } else {
            resp.getWriter().write("User with email " + email + " " + "and password " + password + " is successfully logged in");
        }
    }

}