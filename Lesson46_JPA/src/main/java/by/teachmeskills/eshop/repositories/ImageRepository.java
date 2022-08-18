package by.teachmeskills.eshop.repositories;

import by.teachmeskills.eshop.entities.ProductImage;

import java.util.List;

public interface ImageRepository {
    List<ProductImage> getAllSecondaryImages(int id);
}
