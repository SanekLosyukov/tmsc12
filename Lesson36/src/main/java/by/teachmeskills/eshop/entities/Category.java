package by.teachmeskills.eshop.entities;

import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Category extends BaseEntity {
    private String name;
    private String description;
    private String imageName;
    private List<Product> productList;

    public Category(int id, String name, String imageName) {
        super(id);
        this.name = name;
        this.imageName = imageName;
    }
    public Category(int id, String name, String description, String imageName) {
        super(id);
        this.name = name;
        this.description = description;
        this.imageName = imageName;
    }

}
