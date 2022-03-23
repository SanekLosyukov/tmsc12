package model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    private int id;
    private String name;
    private int price;

    @Override
    public String toString() {
        return "Товар ID: " + id +
                "; Наименование: " + name +
                "; Цена: " + price + " руб.";
    }
}
