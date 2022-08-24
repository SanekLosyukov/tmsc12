package by.teachmeskills.eshop.repositories;

import by.teachmeskills.eshop.entities.Category;

import java.util.List;

public interface CategoryRepository {
    Category findById(int id) throws Exception;

    List<Category> findAll();

    Category createCategory(Category category);
}
