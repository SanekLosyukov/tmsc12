package by.teachmeskills.task1.servletexample;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        Calculator calculator = new Calculator();

        String varTextA = "Сумма 15 + 16 = " + calculator.sum(15, 16);
        req.setAttribute("textA", varTextA);
        String varTextB = "Вычитание 58 - 34 = " + calculator.subtraction(58, 34);
        req.setAttribute("textB", varTextB);
        String varTextC = "Умножение 54 * 54 = " + calculator.multiply(54, 54);
        req.setAttribute("textC", varTextC);
        String varTextD = "Деление 20 / 5 = " + calculator.divide(20, 5);
        req.setAttribute("textD", varTextD);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(req, resp);
    }
}
