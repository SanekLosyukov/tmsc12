package by.teachmeskills.task1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Product {
    private int id;
    private String name;
    private String description;
    private int price;
    private int number;
    private boolean existence;

    public Product(String name, String description, int price, int number, boolean existence) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.number = number;
        this.existence = existence;
    }
}
