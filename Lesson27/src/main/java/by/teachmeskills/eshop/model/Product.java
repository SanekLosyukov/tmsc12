package by.teachmeskills.eshop.model;

import lombok.*;

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
}
