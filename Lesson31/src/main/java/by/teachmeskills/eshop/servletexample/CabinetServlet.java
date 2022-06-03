package by.teachmeskills.eshop.servletexample;

import by.teachmeskills.eshop.model.Checkout;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/cabinet")
public class CabinetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Checkout checkout = (Checkout) session.getAttribute("checkout");

        if (checkout == null) {
            session.setAttribute("checkoutProducts", "");
        } else {
            session.setAttribute("checkoutProducts", checkout.getProducts());
        }

        req.getServletContext().getRequestDispatcher("/cabinet.jsp").forward(req, resp);

    }
}
