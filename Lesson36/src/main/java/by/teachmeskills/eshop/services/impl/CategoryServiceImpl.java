package by.teachmeskills.eshop.services.impl;


import by.teachmeskills.eshop.entities.Category;
import by.teachmeskills.eshop.repositories.impl.CategoryRepositoryImpl;
import by.teachmeskills.eshop.services.CategoryService;

import java.util.ArrayList;
import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepositoryImpl categoryRepository = new CategoryRepositoryImpl();

    @Override
    public Category create(Category entity) {
        return null;
    }

    @Override
    public List<Category> read() {
        return categoryRepository.read();
    }

    @Override
    public Category update(Category entity) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
    public List<Category> getSubcategoriesById(int id, List<Category> subcategories) {
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

    public List<Category> getAllSubcategories() {
        return categoryRepository.getAllSubcategories();
    }

}
