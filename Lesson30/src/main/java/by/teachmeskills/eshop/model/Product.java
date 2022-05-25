package by.teachmeskills.eshop.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Product {
    private int id;
    private String name;
    private String description;
    private int price;
    private String imageName;
    private List<Product> products;

    public Product(int id, String name, String description, String imageName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageName = imageName;
    }

    public Product(int id, String name, String description, int price, String imageName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageName = imageName;
    }
}
