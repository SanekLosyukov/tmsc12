package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.domain.Category;
import by.teachmeskills.eshop.exceptions.CommandException;
import by.teachmeskills.eshop.utils.CRUDUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

import static by.teachmeskills.eshop.utils.PagesPathEnum.CATEGORY_PAGE;
import static by.teachmeskills.eshop.utils.RequestParamsEnum.ID;
import static by.teachmeskills.eshop.utils.RequestParamsEnum.SUBCATEGORIES;

public class CategoryRedirectCommandImpl implements BaseCommand {

    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        HttpSession session = request.getSession();
        int id = Integer.parseInt(request.getParameter(ID.getValue()));
        List<Category> subcategories = CRUDUtils.getAllSubcategories();
        List<Category> getSubcategories = getSubcategoriesById(id, subcategories);
        session.setAttribute(SUBCATEGORIES.getValue(), getSubcategories);

        return CATEGORY_PAGE.getPath();
    }

    private List<Category> getSubcategoriesById(int id, List<Category> subcategories) {
        List<Category> getSubcategories = new ArrayList<>();
        switch (id) {
            case 1 -> {
                getSubcategories = subcategories.subList(0, 2);
            }
            case 2 -> {
                getSubcategories = subcategories.subList(2, 4);
            }
            case 3 -> {
                getSubcategories = subcategories.subList(4, 6);
            }
            default -> System.out.println("Incorrect Id");
        }
        return getSubcategories;
    }
}
