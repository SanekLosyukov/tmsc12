package p2.pants;

public class Pants implements IPants {
    private int price;
    private boolean isOn;
    private String name;

    public Pants(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void putOn() {
        if (!isOn) {
            System.out.println("штаны " + name + " одеты");
            isOn = true;
        }
    }

    @Override
    public void takeOff() {
        if (isOn) {
            System.out.println("штаны " + name + " сняты");
            isOn = false;
        }
    }

    @Override
    public int getPrice() {
        return price;
    }
}
