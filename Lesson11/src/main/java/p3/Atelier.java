package p3;

import java.util.ArrayList;

public class Atelier {

    private final ArrayList<Clothes> clothes;

    public Atelier(ArrayList<Clothes> clothes) {
        this.clothes = clothes;
    }

    public void dress(PersonType personType) {
        for (Clothes clothes : clothes) {
            if (checkClothes(clothes, personType)) {
                switch (personType) {
                    case WOMAN -> ((IWomanClothes) clothes).dressWoman();
                    case MAN -> ((IManClothes) clothes).dressMan();
                }
            }

        }
    }

    private boolean checkClothes(Clothes clothes, PersonType personType) {
        for (Class<?> anInterace : clothes.getClass().getInterfaces()) {
            if (anInterace == personType.getIClass()) {
                return true;
            }
        }
        return false;
    }
}
