package p3;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Cravat extends Clothes implements IManClothes {

    @Override
    public void dressMan() {
        System.out.println("Галстук мужской: цвет = " + getColor() + "евроразмер" + getSize() + " цена " + getCost());
    }
}

