package p4;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Apricot extends Fruit {
    @Override
    TypeFruit getType() {
        return TypeFruit.APRICOT;
    }
}
