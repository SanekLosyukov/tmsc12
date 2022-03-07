package p4;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Pear extends Fruit {
    @Override
    TypeFruit getType() {
        return TypeFruit.PEAR;
    }
}
