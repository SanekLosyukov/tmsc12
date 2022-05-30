package by.teachmeskills.example.prototype;

public class Bike extends Vehicle {
    public int passenger; // 1 или 2 (одноместный или двухместный мотоцикл)
    public int frameLength;  // длина рамы мотоцикла

    public Bike() {
    }

    public Bike(Bike target) {
        super(target);
        if (target != null) {
            this.passenger = target.passenger;
            this.frameLength = target.frameLength;
        }
    }

    @Override
    public Bike clone() {
        return new Bike(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Bike) || !super.equals(object2)) return false;
        Bike bike2 = (Bike) object2;
        return bike2.passenger == passenger && bike2.frameLength == frameLength;
    }
}
