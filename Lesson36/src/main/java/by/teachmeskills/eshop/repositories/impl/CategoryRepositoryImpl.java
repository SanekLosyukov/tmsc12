package by.teachmeskills.eshop.repositories.impl;

import by.teachmeskills.eshop.entities.Category;
import by.teachmeskills.eshop.repositories.CategoryRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository {
    private static final String GET_ALL_CATEGORIES = "SELECT * FROM categories, images WHERE images.category_id = categories.id";
    private static final String GET_ALL_SUBCATEGORIES = "SELECT * FROM subcategories, images WHERE images.subcategory_id = subcategories.id";

    @Override
    public Category create(Category entity) {
        return null;
    }

    @Override
    public List<Category> read() {
        List<Category> categories = new ArrayList<>();
        try (Connection connection = pool.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_CATEGORIES);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int categoryId = rs.getInt("category_id");
                String name = rs.getString("name");
                String image = rs.getString("image");
                categories.add(new Category(categoryId, name, image));
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return categories;
    }

    @Override
    public Category update(Category entity) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Category findById(int id) {
        return null;
    }

    public List<Category> getAllSubcategories() {
        List<Category> subcategories = new ArrayList<>();
        try (Connection connection = pool.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_SUBCATEGORIES);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int subCategoryId = rs.getInt("subcategory_id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String image = rs.getString("image");
                subcategories.add(new Category(subCategoryId, name, description, image));
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return subcategories;
    }
}
