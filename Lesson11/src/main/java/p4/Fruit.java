package p4;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public abstract class Fruit {
    private final double weight;
    private double pricePerKilogram;

    public final void printManufacturerInfo() {
        System.out.println("Made in Belarus");
    }

    public double getFullPrice() {
        return getPricePerKilogram() * getWeight();
    }

    abstract TypeFruit getType();
}
