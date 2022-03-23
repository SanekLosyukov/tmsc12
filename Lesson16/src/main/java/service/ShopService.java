package service;

import exception.ProductAlreadyExistException;
import model.Product;

import java.util.List;

public interface ShopService {
    List<Product> getAllProducts();

    Product getProductById(int id);

    void takeProduct(Product product) throws ProductAlreadyExistException;

    void editProduct(int id, Product product) throws ProductAlreadyExistException;

    void removeProduct(int id);

    boolean isWorking();

    void closeShop();
}
