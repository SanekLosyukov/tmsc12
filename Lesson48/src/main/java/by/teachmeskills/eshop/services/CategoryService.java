package by.teachmeskills.eshop.services;

import by.teachmeskills.eshop.dto.CategoryDto;
import by.teachmeskills.eshop.entities.Category;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public interface CategoryService extends BaseService<Category> {
    ModelAndView getCategoryData(int id) throws Exception;

    ModelAndView completeAllHomePageData() throws Exception;

    List<CategoryDto> getAllCategories();

    CategoryDto getCertainCategory(int id) throws Exception;

    CategoryDto createCategory(CategoryDto categoryDto);

    List<CategoryDto> saveCategoriesFromFile(MultipartFile file) throws Exception;
}
