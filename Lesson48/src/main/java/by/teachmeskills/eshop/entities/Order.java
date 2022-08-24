package by.teachmeskills.eshop.entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder
@Entity
@Table(name = "orders")
public class Order extends BaseEntity {
    @Column(name = "PRICE")
    private int price;

    @Column(name = "DATE")
    private Date date;

    @ManyToOne
    private User user;

    @ManyToMany
    @JoinTable(name = "orders_products", joinColumns = @JoinColumn(name = "ORDER_ID"),
            inverseJoinColumns = @JoinColumn(name = "PRODUCT_ID"))
    private List<Product> productList;

    private int totalPrice = 0;

    public Order() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product.getId(), product);
        totalPrice += product.getPrice();
    }

    public List<Product> getProducts() {
        return new ArrayList<>(productList);
    }

    public int getTotalPrice() {
        return totalPrice;
    }

}
