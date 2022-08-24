package by.teachmeskills.eshop.repositories;

import by.teachmeskills.eshop.entities.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> read();

    Product findById(int id) throws Exception;

    List<Product> findByAllCategoryId(int categoryId) throws Exception;

    List<Product> getSearchFromDB(String search) throws Exception;
}
