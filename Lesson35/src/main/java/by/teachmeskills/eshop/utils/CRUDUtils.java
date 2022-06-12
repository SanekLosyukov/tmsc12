package by.teachmeskills.eshop.utils;

import by.teachmeskills.eshop.domain.Category;
import by.teachmeskills.eshop.domain.Product;
import by.teachmeskills.eshop.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {
    private static final String GET_ALL_USERS_QUERY = "SELECT * FROM users";
    private static final String INSERT_USER_QUERY = "INSERT INTO users (name, surname, email, password, date) VALUES(?, ?, ?, ?, ?)";
    private static final String GET_ALL_CATEGORIES = "SELECT * FROM categories, images WHERE images.category_id = categories.id";
    private static final String GET_ALL_SUBCATEGORIES = "SELECT * FROM subcategories, images WHERE images.subcategory_id = subcategories.id";
    private static final String GET_ALL_PRODUCTS = "SELECT * FROM products, images WHERE images.product_id = products.id";

    public static List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_USERS_QUERY);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String date = rs.getString("date");
                users.add(new User(name, surname, email, password, date));
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return users;
    }

    public static List<User> saveUser(User user) {
        List<User> saveUsers = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_QUERY);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setString(5, user.getDate());
            preparedStatement.executeUpdate();
            saveUsers = getAllUsers();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return saveUsers;
    }

    public static List<Category> getAllCategories() {
        List<Category> categories = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
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
        }
        return categories;
    }

    public static List<Category> getAllSubcategories() {
        List<Category> subcategories = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
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
        }
        return subcategories;
    }

    public static List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_PRODUCTS);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int productId = rs.getInt("product_id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                int price = rs.getInt("price");
                String image = rs.getString("image");
                products.add(new Product(productId, name, description, price, image));
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return products;
    }

}
