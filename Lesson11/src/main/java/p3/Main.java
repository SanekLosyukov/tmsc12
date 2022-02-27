package p3;

import java.util.ArrayList;

import static p3.Clothes.Size.*;
import static p3.Clothes.Type.*;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        ArrayList<Clothes> clothesArrayList = new ArrayList<>();
        clothesArrayList.add(createClothes(PANTS, "синий", XS, 50));
        clothesArrayList.add(createClothes(CRAVAT, "желтый", S, 100));
        clothesArrayList.add(createClothes(SKIRT, "зеленый", XXS, 20));
        clothesArrayList.add(createClothes(PANTS, "черный", XXS, 10));

    }

    private static Clothes createClothes(Clothes.Type type, String color, Clothes.Size size, int cost) throws IllegalAccessException {
        return switch (type) {

            case PANTS -> Pants.builder().
                    color(color).
                    cost(cost).
                    size(size).
                    build();
            case SKIRT -> Skirt.builder().
                    color(color).
                    cost(cost).
                    size(size).
                    build();
            case CRAVAT -> Cravat.builder().
                    color(color).
                    cost(cost).
                    size(size).
                    build();
            case TSHIRT -> TShirt.builder().
                    color(color).
                    cost(cost).
                    size(size).
                    build();
            default -> throw new IllegalAccessException("не верный тип данных");
        };
    }
}
