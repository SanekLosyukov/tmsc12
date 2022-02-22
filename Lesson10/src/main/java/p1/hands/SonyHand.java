package p1.hands;

import p1.RobotParts;

public class SonyHand extends RobotParts implements IHand {
    public SonyHand(int price) {
        super(price);
    }

    @Override
    public void upHand() {
        System.out.println("Рука Сони");
    }
}
