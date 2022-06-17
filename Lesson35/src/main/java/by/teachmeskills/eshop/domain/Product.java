package by.teachmeskills.eshop.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Product {
    private int id;
    private String name;
    private String description;
    private int price;
    private String imageName;
    private List<Image> images;
    private List<Product> products;


    public Product(int id, String name, String description, int price, String imageName, List<Image> images) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageName = imageName;
        this.images = images;
    }

    public Product(int id, String name, String description, int price, String imageName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageName = imageName;
    }

}
