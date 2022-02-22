package p1.legs;

import p1.RobotParts;

public class SamsungLeg extends RobotParts implements ILeg {
    public SamsungLeg(int price) {
        super(price);
    }

    @Override
    public void step() {
        System.out.println("Нога Самсунг");
    }
}
