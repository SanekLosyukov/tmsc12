package by.teachmeskills.example.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        List<Vehicle> vehiclesCopy = new ArrayList<>();

        Car car = new Car();
        car.x = 4;
        car.y = 4;
        car.color = "black";
        car.airBag = 2;
        vehicles.add(car);

        Car anotherCar = (Car) car.clone();
        vehicles.add(anotherCar);

        Bike bike = new Bike();
        bike.passenger = 2;
        bike.frameLength = 2200; // мм, 2,2метра
        bike.color = "red";
        vehicles.add(bike);
        cloneAndCompare(vehicles, vehiclesCopy);
    }

    private static void cloneAndCompare(List<Vehicle> vehicles, List<Vehicle> vehiclesCopy) {
        for (Vehicle vehicle : vehicles) {
            vehiclesCopy.add(vehicle.clone());
        }

        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i) != vehiclesCopy.get(i)) {
                System.out.println(i + ": Разные объекты");
                if (vehicles.get(i).equals(vehiclesCopy.get(i))) {
                    System.out.println(i + ": Эти объекты идентичны");
                } else {
                    System.out.println(i + ": А эти не идентичны");
                }
            } else {
                System.out.println(i + ": Транспортные средства разные");
            }
        }
    }
}