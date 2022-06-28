package by.teachmeskills.eshop.entities;

import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product extends BaseEntity {
    private String name;
    private String description;
    private int price;
    private String imageName;
    private List<Image> images;
    private List<Product> products;

    public Product(int id, String name, String description, int price, String imageName) {
        super(id);
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageName = imageName;
    }

    public Product(int id, String name, String description, int price, String imageName, List<Image> images) {
        super(id);
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageName = imageName;
        this.images = images;
    }
}