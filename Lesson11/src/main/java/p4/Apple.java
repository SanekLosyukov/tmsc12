package p4;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Apple extends Fruit {
    @Override
    TypeFruit getType() {
        return TypeFruit.APPLE;
    }
}
