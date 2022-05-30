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
        shapes.add(rectangle);
        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}