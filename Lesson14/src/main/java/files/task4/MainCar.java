package files.task4;

import java.io.*;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car("BMW", 200, 35000, "diesel", 55, "diesel", 4);
        try {
            readWriteObject(car);
        } catch (IOException | ClassNotFoundException exception) {
            System.out.println("Unexpected error" + exception);
        }
    }

    public static void readWriteObject(Car car) throws IOException, ClassNotFoundException {
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("Lesson14/src/main/resources/car.data"));
        stream.writeObject(car);
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Lesson14/src/main/resources/car.data"));
        System.out.println("Результат считывания " + inputStream.readObject());
    }
}
