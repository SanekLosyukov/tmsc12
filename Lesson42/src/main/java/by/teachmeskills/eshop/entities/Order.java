package by.teachmeskills.eshop.entities;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Order {
    private Map<Integer, Product> products;
    private int totalPrice = 0;

    public Order() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getId(), product);
        totalPrice += product.getPrice();
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products.values());
    }

    public int getTotalPrice() {
        return totalPrice;
    }

}
