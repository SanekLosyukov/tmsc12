package by.teachmeskills.eshop.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {

    private Map<Integer, Phone> phones;
    private int totalPrice = 0;

    public Cart() {
        this.phones = new HashMap<>();
    }

    public void addProduct(Phone phone) {
        phones.put(phone.getId(), phone);
        totalPrice += phone.getPrice();
    }

    public void removeProduct(int productId) {
        Phone phone = phones.get(productId);
        phones.remove(productId);
        totalPrice -= phone.getPrice();
    }

    public List<Phone> getProducts() {
        return new ArrayList<>(phones.values());
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void clear() {
        phones.clear();
    }

}