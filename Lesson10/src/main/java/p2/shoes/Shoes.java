package p2.shoes;

public class Shoes implements IShoes {
    private int price;
    private boolean isOn;
    private String name;

    public Shoes(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void putOn() {
        if (!isOn) {
            System.out.println("ботинки " + name + " одеты");
            isOn = true;
        }
    }

    @Override
    public void takeOff() {
        if (isOn) {
            System.out.println("ботинки " + name + " сняты");
            isOn = false;
        }
    }

    @Override
    public int getPrice() {
        return price;
    }
}
