package files.task4;

import lombok.AllArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
public class Car implements Serializable {
    private String model;
    private int speed;
    private int price;
    private String fuelType;
    private int tankVolume;
    private String engine;
    private transient int numberOfCylinders;  // трансиент - те данные, которые мы не хотим записывать в файл (сериализовать)
}
