package model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Shop {

    private boolean isWorking = true;
    private List<Product> products;

    public List<Product> getProducts() { //ленивая инициализация списка продуктов
        if (products == null) {
            products = new ArrayList<>();
        }
        return products;
    }
}
