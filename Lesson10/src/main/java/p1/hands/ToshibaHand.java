package p1.hands;

import p1.RobotParts;

public class ToshibaHand extends RobotParts implements IHand {
    public ToshibaHand(int price) {
        super(price);
    }

    @Override
    public void upHand() {
        System.out.println("Рука Тошиба");
    }
}
