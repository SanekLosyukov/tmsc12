package p3;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Pants extends Clothes implements IManClothes, IWomanClothes {


    @Override
    public void dressMan() {
        System.out.println("Штаны мужские: цвет = " + getColor() + "евроразмер" + getSize() + " цена " + getCost());
    }

    @Override
    public void dressWoman() {
        System.out.println("Штаны женские: цвет = " + getColor() + "евроразмер" + getSize() + " цена " + getCost());
    }
}
