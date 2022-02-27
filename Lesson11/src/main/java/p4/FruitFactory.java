package p4;

public class FruitFactory {

    public Fruit createFruit(TypeFruit type, double weight, double pricePerKilogram) {
        return switch (type) {
            case TypeFruit.APPLE -> Apple.builder()
                    .weight(weight)
                    .pricePerKilogram(pricePerKilogram)
                    .build();
            case TypeFruit.APRICOT -> Apricot.builder()
                    .weight(weight)
                    .pricePerKilogram(pricePerKilogram)
                    .build();
            case TypeFruit.PEAR -> Pear.builder()
                    .weight(weight)
                    .pricePerKilogram(pricePerKilogram)
                    .build();
            case TypeFruit.BANANA -> Banana.builder()
                    .weight(weight)
                    .pricePerKilogram(pricePerKilogram)
                    .build();
        };
    }
}
