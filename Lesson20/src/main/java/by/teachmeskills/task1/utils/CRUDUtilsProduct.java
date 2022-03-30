package by.teachmeskills.task1.utils;

import by.teachmeskills.task1.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtilsProduct {
    private static String GET_ALL_PRODUCTS_QUERY = "SELECT * FROM products";
    private static String INSERT_PRODUCT_QUERY = "INSERT INTO products(name, description, price, number, existence) VALUES(?, ?, ?, ?, ?)";
    private static String UPDATE_PRODUCT_QUERY = "UPDATE products SET price = ? WHERE id = ?"; // апдейт цены
    private static String DELETE_PRODUCT_QUERY = "DELETE FROM products WHERE id = ?"; //удалим по айдишнику

    public static List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        try (Connection connection = DbUtilsProduct.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_PRODUCTS_QUERY);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                int price = rs.getInt("price");
                int number = rs.getInt("number");
                boolean existence = rs.getBoolean("existence");
                products.add(new Product(id, name, description, price, number, existence));
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return products;
    }

    public static List<Product> saveProduct(Product product) {
        List<Product> saveProducts = new ArrayList<>();
        try (Connection connection = DbUtilsProduct.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCT_QUERY);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setInt(3, product.getPrice());
            preparedStatement.setInt(4, product.getNumber());
            preparedStatement.setBoolean(5, product.isExistence());
            preparedStatement.executeUpdate();
            saveProducts = getAllProducts();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return saveProducts;
    }

    public static List<Product> updateProduct(int productId, int price) {
        List<Product> updatedProducts = new ArrayList<>();
        try (Connection connection = DbUtilsProduct.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PRODUCT_QUERY);
            preparedStatement.setInt(1, price);
            preparedStatement.setInt(2, productId);
            preparedStatement.executeUpdate();
            updatedProducts = getAllProducts();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updatedProducts;
    }

    public static List<Product> deleteProduct(int productId) {
        List<Product> deleteProducts = new ArrayList<>();
        try (Connection connection = DbUtilsProduct.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PRODUCT_QUERY);
            preparedStatement.setInt(1, productId);
            preparedStatement.execute();
            deleteProducts = getAllProducts();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return deleteProducts;
    }
}

