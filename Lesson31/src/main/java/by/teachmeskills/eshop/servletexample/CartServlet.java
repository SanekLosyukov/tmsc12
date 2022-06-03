package by.teachmeskills.eshop.servletexample;

import by.teachmeskills.eshop.model.Cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet("/cart")
public class CartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Cart cart = (Cart) session.getAttribute("cart");

        if (cart == null) {
            session.setAttribute("cartProducts", "");
        } else {
            session.setAttribute("cartProducts", cart.getProducts());
        }

        req.getServletContext().getRequestDispatcher("/cart.jsp").forward(req, resp);

    }
}