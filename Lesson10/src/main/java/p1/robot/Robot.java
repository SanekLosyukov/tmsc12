package p1.robot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import p1.hands.IHand;
import p1.heads.IHead;
import p1.legs.ILeg;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;


    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.step();
    }

    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;

    }
}
