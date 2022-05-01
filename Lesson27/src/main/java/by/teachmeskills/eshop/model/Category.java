package by.teachmeskills.eshop.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Category {
    private int id;
    private String name;
    private String imageName;
    private List<Product> productList;

    public Category(int id, String name, String imageName) {
        this.id = id;
        this.name = name;
        this.imageName = imageName;
    }
}
