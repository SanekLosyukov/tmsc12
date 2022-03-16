package task2;

public class Car {
    private String model;
    private int year;
    private int distance;
    private Engine engine;
    private FuelTank volume;

    public Car() {
    }

    public Car(Engine engine, FuelTank volume) {
        this.engine = new Engine();
        this.volume = new FuelTank();
    }

    public void start() {  // метод заводки машины
        Engine engine = new Engine();
        engine.start();
    }

    public void drive() {  // метод езды машины
        System.out.println("Машина поехала");
        int value = 100; // км, фиксированное расстояние, которое прошла машина
        System.out.println("Пройденное расстояние =" + value);
    }

    public int allDistance(int distance) {
        this.distance = distance;
        return distance;
    }

    protected class Engine {
        public String type;

        public void start() {
            if (FuelTank.volume > 0) {
                System.out.println("Start Engine");
            } else {
                stop();
                System.out.println("Нет топлива. Дозаправляем 10 л");
                FuelTank.volume = FuelTank.volume + 10;            // дозаправка 10л
            }
        }

        public void stop() {
            System.out.println("Stop Engine");
        }
    }

    public static class FuelTank {
        public static int volume;

        public static void setVolume(int volume) {  // просетал количество (volume) топлива в баке
            FuelTank.volume = volume;
        }
    }
}


