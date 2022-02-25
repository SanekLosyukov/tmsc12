package p1.hands;

import p1.RobotParts;

public class SamsungHand extends RobotParts implements IHand {

    public SamsungHand(int price) {
        super(price);
    }

    @Override
    public void upHand() {
        System.out.println("Рука Самсунг");
    }
}
