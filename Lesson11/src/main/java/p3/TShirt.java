package p3;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class TShirt extends Clothes implements IManClothes {

    @Override
    public void dressMan() {
        System.out.println("Майка мужская: цвет = " + getColor() + "евроразмер" + getSize() + " цена " + getCost());
    }
}
