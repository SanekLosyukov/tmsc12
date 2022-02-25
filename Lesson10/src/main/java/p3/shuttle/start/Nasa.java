package p3.shuttle.start;

import java.util.Random;

public class Nasa implements IStart {

    @Override
    public boolean checkStart() {
        Random random = new Random();
        return random.nextInt(10) > 3;
    }

    @Override
    public void start() {
        System.out.println("Старт шаттла Nasa");
    }

    @Override
    public void engineOn() {
        System.out.println("Двигатели шаттла Nasa запущены");
    }
}
