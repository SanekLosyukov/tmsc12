package p3.shuttle;

import p3.shuttle.start.IStart;

public class SpacePort {

    public void start(IStart start) {
        if (start.checkStart()) {
            System.out.println("Успешная проверка. Обратный остчет: ");
            for (int i = 10; i >= 1; i--) {
                System.out.println(i);
            }
            start.engineOn();
            start.start();
        }
    }
}
