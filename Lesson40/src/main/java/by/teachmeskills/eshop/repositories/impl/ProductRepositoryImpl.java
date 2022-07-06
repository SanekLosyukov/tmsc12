package by.teachmeskills.eshop.repositories.impl;

import by.teachmeskills.eshop.entities.Product;
import by.teachmeskills.eshop.repositories.ConnectionPool;
import by.teachmeskills.eshop.repositories.ProductRepository;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private static String GET_ALL_PRODUCTS_BY_CATEGORY_ID = "SELECT * FROM products, images WHERE products.category_id = ? AND images.product_id = products.id AND images.primary_flag = 1";

    private static String GET_PRODUCT_BY_ID = "SELECT * FROM products, images WHERE products.id = ? AND images.product_id = products.id AND images.primary_flag = 1";
    private static final String SEARCH_BY_NAME_OR_DESCRIPTION = "SELECT * FROM products WHERE products.name LIKE ? OR products.description LIKE ?";
    private final ConnectionPool connectionPool;

    public ProductRepositoryImpl(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    @Override
    public Product create(Product entity) {
        return null;
    }

    @Override
    public List<Product> read() {
        return null;
    }

    @Override
    public Product update(Product entity) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Product findById(int id) throws Exception {
        Product product = null;
        Connection connection = connectionPool.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_PRODUCT_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                product = Product.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .description(rs.getString("description"))
                        .price(rs.getInt("price"))
                        .imagePath(rs.getString("image"))
                        .categoryId(rs.getInt("category_id"))
                        .build();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            connectionPool.closeConnection(connection);
        }
        return product;
    }

    @Override
    public List<Product> findByAllCategoryId(int categoryId) throws Exception {
        List<Product> products = new ArrayList<>();
        Connection connection = connectionPool.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_PRODUCTS_BY_CATEGORY_ID);
            preparedStatement.setInt(1, categoryId);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                int price = rs.getInt("price");
                String imagePath = rs.getString("image");
                int catId = rs.getInt("category_id");

                products.add(Product.builder()
                        .id(id)
                        .name(name)
                        .description(description)
                        .price(price)
                        .imagePath(imagePath)
                        .categoryId(catId)
                        .build());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            connectionPool.closeConnection(connection);
        }

        return products;
    }

    @Override
    public List<Product> getSearchFromDB(String search) throws Exception {
        List<Product> searchedProducts = new ArrayList<>();
        String setSearch = "%" + search + "%";
        Connection connection = connectionPool.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_BY_NAME_OR_DESCRIPTION);
            preparedStatement.setString(1, setSearch);
            preparedStatement.setString(2, setSearch);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                int price = rs.getInt("price");
                int catId = rs.getInt("category_id");

                searchedProducts.add(Product.builder()
                        .id(id)
                        .name(name)
                        .description(description)
                        .price(price)
                        .categoryId(catId)
                        .build());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            connectionPool.closeConnection(connection);
        }
        return searchedProducts;
    }
}
