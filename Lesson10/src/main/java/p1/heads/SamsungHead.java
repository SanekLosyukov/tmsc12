package p1.heads;

import p1.RobotParts;

public class SamsungHead extends RobotParts implements IHead {
    public SamsungHead(int price) {
        super(price);
    }

    @Override
    public void speak() {
        System.out.println("Гговорит Самсунг");
    }
}
