package p1.heads;

import p1.RobotParts;

public class SonyHead extends RobotParts implements IHead {
    public SonyHead(int price) {
        super(price);
    }

    @Override
    public void speak() {
        System.out.println("Говорит Сони");
    }
}
