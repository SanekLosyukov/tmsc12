package p1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi", 100, 25000);
        Car car2 = new Car("BMW", 120, 35000);
        Car car3 = new Car("Citroen", 90, 20000);
        try {
            car.start();
            car2.start();
            car3.start();
        } catch (MyException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
