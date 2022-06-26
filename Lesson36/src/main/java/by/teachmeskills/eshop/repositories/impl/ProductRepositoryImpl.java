package by.teachmeskills.eshop.repositories.impl;

import by.teachmeskills.eshop.entities.Image;
import by.teachmeskills.eshop.entities.Product;
import by.teachmeskills.eshop.repositories.ProductRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    private static final String GET_ALL_PRODUCTS = "SELECT * FROM products, images WHERE images.product_id = products.id AND images.primary_flag = 1";
    private static final String SEARCH_BY_NAME_OR_DESCRIPTION = "SELECT * FROM products WHERE name or description LIKE VALUES(?)";

    @Override
    public Product create(Product entity) {
        return null;
    }

    @Override
    public List<Product> read() {
        List<Product> products = new ArrayList<>();
        try (Connection connection = pool.getConnection()) {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public Product update(Product entity) {
        return null;
    }

    @Override
    public void delete(int id) {
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public List<Product> getAllProductsWithAllImages() {
        List<Product> products = new ArrayList<>();
        try (Connection connection = pool.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_PRODUCTS);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int productId = rs.getInt("product_id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                int price = rs.getInt("price");
                String image = rs.getString("image");

                ImageRepositoryImpl imageRepository = new ImageRepositoryImpl();
                List<Image> secondaryImages = imageRepository.getAllSecondaryImages(productId);
                products.add(new Product(productId, name, description, price, image, secondaryImages));
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public List<Product> findByCategoryId(int categoryId) {
        return null;
    }

    @Override
    public List<Product> getSearchFromDB(String search) {
        List<Product> searchedProducts = new ArrayList<>();
        try (Connection connection = pool.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_BY_NAME_OR_DESCRIPTION);
            preparedStatement.setString(1, search);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int productId = rs.getInt("product_id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                int price = rs.getInt("price");
                String image = rs.getString("image");
                searchedProducts.add(new Product(productId, name, description, price, image));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return searchedProducts;
    }
}
