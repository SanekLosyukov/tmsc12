package task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car.FuelTank fuelTank = new Car.FuelTank();
        Car.Engine engine = car.new Engine();
        fuelTank.setVolume(0); // просетать количество топлива в баке
        car.start();  // запуск авто, включающий запуск двигателя
        car.drive();  // поездка, фиксирование пройденного расстояния
        engine.stop();  // заглушить двигатель
        System.out.println("Машина проехла " + car.allDistance(150000));  // вывод пройденного расстояния (пробег)
    }
}
