package by.teachmeskills.eshop.servletexample;


import by.teachmeskills.eshop.model.Phone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/phone")
public class MobileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        List<Phone> phones = getPhonesByCategoryId(id);

        req.setAttribute("phones", phones);
        req.getServletContext().getRequestDispatcher("/phone.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    private List<Phone> getPhonesByCategoryId(int id) {
        List<Phone> phones = new ArrayList<>();

        switch (id) {
            case 1 -> {
                Phone iphone11 = new Phone(1, "iPhone11", "Full HD Display, Battery 4000 mAh", 2500, "iphone11.jpg");
                Phone iphone12 = new Phone(2, "iPhone12", "Retina Display, Bluetooth", 3000, "iphone12.jpg");
                Phone iphone13 = new Phone(3, "iPhone13", "New Model 2022. The new iPhone 13", 4000, "iphone13.jpg");
                phones.add(iphone13);
                phones.add(iphone12);
                phones.add(iphone11);
            }
            case 2 -> {
                Phone samsungs20 = new Phone(1, "Samsung S20", "Samsung model 2020. Sale 20%", 1800, "samsungs20.jpg");
                Phone samsungnote20 = new Phone(2, "Samsung Note 20", "Super AMOLED Display, SamsungStilus", 2300, "samsungnote20.jpg");
                Phone samsungs21 = new Phone(3, "Samsung S21", "New Model 2022. The new Samsung S21", 3700, "samsungs21.jpg");
                phones.add(samsungs21);
                phones.add(samsungnote20);
                phones.add(samsungs20);
            }
            default -> System.out.println("Incorrect Id");
        }
        return phones;
    }
}

