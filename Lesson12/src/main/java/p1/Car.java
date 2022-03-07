package p1;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Random;

@AllArgsConstructor
@Getter
public class Car {
    private final String name;
    private final int speed;
    private final int price;

    void start() throws MyException {
        int random = new Random().nextInt(21);
        if (random % 2 == 0) {
            System.out.println("Рандомное число = " + random + " поэтому машина " + getName() + " завелась");
        } else {
            throw new MyException("Рандомное число = " + random + " поэтому машина " + getName() + " не завелась");
        }
    }
}
