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
public class Phone {
    private int id;
    private String name;
    private String description;
    private int price;
    private String imageName;
    private List<Phone> iphoneList;

    public Phone(int id, String name, String description, int price, String imageName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageName = imageName;
    }
}
