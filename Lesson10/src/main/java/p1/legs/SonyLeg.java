package p1.legs;

import p1.RobotParts;

public class SonyLeg extends RobotParts implements ILeg {
    public SonyLeg(int price) {
        super(price);
    }

    @Override
    public void step() {
        System.out.println("Нога Сони");
    }
}
