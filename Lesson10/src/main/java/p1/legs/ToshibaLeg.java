package p1.legs;

import p1.RobotParts;

public class ToshibaLeg extends RobotParts implements ILeg {
    public ToshibaLeg(int price) {
        super(price);
    }

    @Override
    public void step() {
        System.out.println("Нога Тошиба");
    }
}
