package p3;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Skirt extends Clothes implements IWomanClothes {

    @Override
    public void dressWoman() {
        System.out.println("Юбка женская: цвет = " + getColor() + "евроразмер" + getSize() + " цена " + getCost());
    }
}
