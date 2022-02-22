package p2.jacket;

public class Jacket implements IJacket {
    private int price;
    private boolean isOn;
    private String name;

    public Jacket(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void putOn() {
        if (!isOn) {
            System.out.println("куртка " + name + " одета");
            isOn = true;
        }
    }

    @Override
    public void takeOff() {
        if (isOn) {
            System.out.println("куртка " + name + "  снята");
            isOn = false;
        }
    }

    @Override
    public int getPrice() {
        return price;
    }
}
