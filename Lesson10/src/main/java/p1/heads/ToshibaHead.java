package p1.heads;

import p1.RobotParts;

public class ToshibaHead extends RobotParts implements IHead {
    public ToshibaHead(int price) {
        super(price);
    }

    @Override
    public void speak() {
        System.out.println("Говорит Тошиба");
    }
}
