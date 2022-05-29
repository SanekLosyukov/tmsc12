package by.teachmeskills.eshop.servletexample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cabinet")
public class CabinetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        HttpSession session = req.getSession();
//        User cabinetUser = (User) session.getAttribute("user");
//        req.setAttribute("cabinetUser", cabinetUser);
//
//        Product checkoutProducts = (Product) session.getAttribute("checkout");

        req.getServletContext().getRequestDispatcher("/cabinet.jsp").forward(req, resp);
    }
}
