package p4;

import java.util.ArrayList;
import java.util.List;

import static p4.TypeFruit.*;

public class Main {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        FruitFactory fruitFactory = new FruitFactory();
        fruits.add(fruitFactory.createFruit(APPLE, 2.5, 32));
        fruits.add(fruitFactory.createFruit(APRICOT, 2.3, 42));
        fruits.add(fruitFactory.createFruit(BANANA, 4.3, 45));
        fruits.add(fruitFactory.createFruit(APPLE, 1.2, 32));
        fruits.add(fruitFactory.createFruit(PEAR, 5.1, 40));

        ShopAware fruitShop = new FruitShop(fruits);
        fruitShop.toSell();
    }
}
