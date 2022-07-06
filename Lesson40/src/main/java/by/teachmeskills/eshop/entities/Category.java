package by.teachmeskills.eshop.entities;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public class Category extends BaseEntity {
    private String name;
    private String imagePath;


    private List<Product> productList;

    @Builder
    public Category(int id, String name, String imagePath) {
        super(id);
        this.name = name;
        this.imagePath = imagePath;
    }
}
