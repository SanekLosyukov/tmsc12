package by.teachmeskills.eshop.services.impl;

import by.teachmeskills.eshop.entities.Product;
import by.teachmeskills.eshop.repositories.impl.ProductRepositoryImpl;
import by.teachmeskills.eshop.services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductRepositoryImpl productRepository = new ProductRepositoryImpl();


    @Override
    public Product create(Product entity) {
        return null;
    }

    @Override
    public List<Product> read() {
        return productRepository.read();
    }

    @Override
    public Product update(Product entity) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    public List<Product> getAllProductsWithAllImages() {
        return productRepository.getAllProductsWithAllImages();
    }

    public List<Product> getSearchFromDB(String search) {
        return productRepository.getSearchFromDB(search);
    }
    public List<Product> getProductsByCategoryId(int id, List<Product> products) {
        List<Product> getProducts = new ArrayList<>();
        switch (id) {
            case 1 -> {
                getProducts = products.subList(0, 3);
            }
            case 2 -> {
                getProducts = products.subList(3, 6);
            }
            default -> System.out.println("Incorrect Id");
        }
        return getProducts;
    }

    public List<Product> getSelectedProductsById(int id, List<Product> products) {
        List<Product> selectedProducts = new ArrayList<>();
        for (Product product : products) {
            if (id == product.getId()) {
                selectedProducts.add(product);
            }
        }
        return selectedProducts;
    }
}
