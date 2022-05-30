package by.teachmeskills.example.prototype;

import java.util.Objects;

public abstract class Vehicle {
    public int x;  //количество стекол
    public int y;  //количесвто дверей
    public String color;  // цвет

    public Vehicle() {
    }

    public Vehicle(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract Vehicle clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Vehicle)) return false;
        Vehicle vehicle2 = (Vehicle) object2;
        return vehicle2.x == x && vehicle2.y == y && Objects.equals(vehicle2.color, color);
    }
}
