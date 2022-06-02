package by.teachmeskills.example.prototype;

import java.util.Objects;

public abstract class Vehicle {
    public int x;  //количество стекол
    public int y;  //количесвто дверей
    public String color;  // цвет

    public Vehicle() {
    }

    public Vehicle(Vehicle target) {
        this.x = target.x;
        this.y = target.y;
        this.color = target.color;
    }

    public abstract Vehicle clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Vehicle)) return false;
        Vehicle vehicle2 = (Vehicle) object2;
        return vehicle2.x == x && vehicle2.y == y && Objects.equals(vehicle2.color, color);
    }
}
