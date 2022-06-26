package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.entities.Category;
import by.teachmeskills.eshop.exceptions.CommandException;
import by.teachmeskills.eshop.services.impl.CategoryServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

import static by.teachmeskills.eshop.utils.PagesPathEnum.CATEGORY_PAGE;
import static by.teachmeskills.eshop.utils.RequestParamsEnum.ID;
import static by.teachmeskills.eshop.utils.RequestParamsEnum.SUBCATEGORIES;

public class RedirectToSubcategoryCommandImpl implements BaseCommand {

    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        HttpSession session = request.getSession();
        int id = Integer.parseInt(request.getParameter(ID.getValue()));

        CategoryServiceImpl categoryService = new CategoryServiceImpl();
        List<Category> subcategories = categoryService.getAllSubcategories();

        List<Category> getSubcategories = categoryService.getSubcategoriesById(id, subcategories);
        session.setAttribute(SUBCATEGORIES.getValue(), getSubcategories);

        return CATEGORY_PAGE.getPath();
    }


}
