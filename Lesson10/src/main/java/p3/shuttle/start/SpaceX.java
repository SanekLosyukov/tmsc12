package p3.shuttle.start;

import java.util.Random;

public class SpaceX implements IStart {

    @Override
    public boolean checkStart() {
        Random random = new Random();
        return random.nextInt(10) > 3;
    }

    @Override
    public void start() {
        System.out.println("Старт шаттла SpaceX");
    }

    @Override
    public void engineOn() {
        System.out.println("Двигатели шаттла SpaceX запущены");
    }
}
