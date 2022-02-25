package p1.robot;

import p1.hands.IHand;
import p1.hands.SamsungHand;
import p1.hands.SonyHand;
import p1.hands.ToshibaHand;
import p1.heads.IHead;
import p1.heads.SamsungHead;
import p1.heads.SonyHead;
import p1.heads.ToshibaHead;
import p1.legs.ILeg;
import p1.legs.SamsungLeg;
import p1.legs.SonyLeg;
import p1.legs.ToshibaLeg;


/*
    Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
    Класс SonyHead является примером реализацией головы от Sony.
    Создайте 3 робота с разными комплектующими.
    Например у робота голова y а, рука от Samsung.
    У всех роботов вызовите метод action.
    Среди 3-х роботов найдите самого дорогого.
    */
public class Main {
    public static void main(String[] args) {

        IHead[] heads = new IHead[3];
        heads[0] = new SamsungHead(20);
        heads[1] = new SonyHead(15);
        heads[2] = new ToshibaHead(10);
        IHand[] hands = new IHand[3];
        hands[0] = new SamsungHand(40);
        hands[1] = new SonyHand(35);
        hands[2] = new ToshibaHand(30);
        ILeg[] legs = new ILeg[3];
        legs[0] = new SamsungLeg(35);
        legs[1] = new SonyLeg(30);
        legs[2] = new ToshibaLeg(20);

        IRobot[] robots = new IRobot[3];
        int maxPrice = Integer.MIN_VALUE;
        int maxPriceIndex = -1;
        for (int i = 0; i < robots.length; i++) {
            robots[i] = new Robot(heads[i], hands[i], legs[i]);
            robots[i].action();
            System.out.println();
            int price = robots[i].getPrice();
            if (price > maxPrice) {
                maxPriceIndex = i;
                maxPrice = price;
            }
        }
        Robot maxPriceRobot = (Robot) robots[maxPriceIndex];
        System.out.println("Самый дорогой робот " + maxPriceRobot.getClass().getSimpleName() + " стоит " + maxPriceRobot.getPrice());
    }
}
