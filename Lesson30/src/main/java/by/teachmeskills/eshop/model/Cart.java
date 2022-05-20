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

    public void addPhone(Phone phone) {
        phones.put(phone.getId(), phone);
        totalPrice += phone.getPrice();
    }

    public void removePhone(int id) {
        Phone phone = phones.get(id);
        phones.remove(id);
        totalPrice -= phone.getPrice();
    }

    public List<Phone> getPhones() {
        return new ArrayList<>(phones.values());
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void clear() {
        phones.clear();
    }

}