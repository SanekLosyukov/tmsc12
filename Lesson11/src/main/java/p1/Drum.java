package p1;

public class Drum implements IInstrument {
    private final int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан, размер = " + size);
    }
}
