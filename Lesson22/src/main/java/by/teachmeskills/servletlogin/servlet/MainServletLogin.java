package by.teachmeskills.servletlogin.servlet;

import by.teachmeskills.servletlogin.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class MainServletLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/login.html");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        User user = new User();
        String email = req.getParameter("email");
        String password = req.getParameter("pass");

        if (!user.getEmail().equals(email) || !user.getPassword().equals(password)) {
            resp.sendRedirect("/login.html");
        } else {
            resp.getWriter().write("Пользователь с email " + email + " " + "и паролем " + password + " успешно залогинен");
        }
    }
}