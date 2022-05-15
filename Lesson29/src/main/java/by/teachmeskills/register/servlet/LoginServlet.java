package by.teachmeskills.register.servlet;

import by.teachmeskills.register.model.User;
import by.teachmeskills.register.utils.CRUDUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("signin.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String email = req.getParameter("email");
        String date = req.getParameter("date");

        User validateUser = new User(name, surname, email, date);
        List<User> usersFromDB = CRUDUtils.getAllUsers();
        for (User user : usersFromDB) {
            if (user.equals(validateUser)) {
                req.setAttribute("user", validateUser);
                req.getServletContext().getRequestDispatcher("/home.jsp").forward(req, resp);
                break;
            }
        }
//            req.getServletContext().getRequestDispatcher("/error.jsp").forward(req, resp);
    }
}
