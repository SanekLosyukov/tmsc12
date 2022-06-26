package by.teachmeskills.eshop.repositories.impl;

import by.teachmeskills.eshop.entities.Image;
import by.teachmeskills.eshop.repositories.ImageRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImageRepositoryImpl implements ImageRepository {
    private static final String GET_ALL_SECONDARY_IMAGES = "SELECT * FROM products, images WHERE images.product_id = products.id AND images.primary_flag = 0";


    @Override
    public Image create(Image entity) {
        return null;
    }

    @Override
    public List read() {
        return null;
    }

    @Override
    public Image update(Image entity) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Image> getAllSecondaryImages(int id) {
        List<Image> secondaryImages = new ArrayList<>();
        try (Connection connection = pool.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_SECONDARY_IMAGES);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int productId = rs.getInt("product_id");
                boolean flag = rs.getBoolean("primary_flag");
                String image = rs.getString("image");
                if (id == productId) {
                    secondaryImages.add(new Image(flag, image));
                }
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return secondaryImages;
    }
}
