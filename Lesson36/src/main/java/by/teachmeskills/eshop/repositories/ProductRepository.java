package by.teachmeskills.eshop.repositories;

import by.teachmeskills.eshop.entities.Product;

import java.util.List;

public interface ProductRepository extends BaseRepository<Product> {
    Product findById(int id);
    List<Product> getAllProductsWithAllImages();
    List<Product> findByCategoryId(int categoryId);
    List<Product> getSearchFromDB(String search);
}
