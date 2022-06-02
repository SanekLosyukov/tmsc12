package by.teachmeskills.example.prototype;

public class Car extends Vehicle {

    public int airBag; //число подушек безопасности

    public Car() {
    }

    public Car(Car target) {
        super(target);
        if (target != null) {
            this.airBag = target.airBag;
        }
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Car) || !super.equals(object2)) return false;
        Car car2 = (Car) object2;
        return car2.airBag == airBag;
    }
}
