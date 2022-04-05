package by.teachmeskills.task1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
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

    @Override
    public String toString() {
        return "Product{" +
                "id =" + id +
                ", name ='" + name + '\'' +
                ", description ='" + description + '\'' +
                ", price =" + price +
                ", number =" + number +
                ", nexistence" + existence +
                '}';
    }
}
