package p2.person;

import p2.jacket.IJacket;
import p2.pants.IPants;
import p2.shoes.IShoes;

public class Person implements IPerson {
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Person(IJacket jacket, IPants pants, IShoes shoes) {
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    @Override
    public void puton() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    @Override
    public void takeOff() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }

    @Override
    public int getPrice() {
        int price = jacket.getPrice() + pants.getPrice() + shoes.getPrice();
        return price;
    }
}
