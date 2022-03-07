package p1;

public interface IInstrument {
    enum Type {
        GUITAR, DRUM, TRUMPET
    }

    String KEY = "До мажор";  // объявил статическую меременную в интерфейсе. Это можно

    void play();

}
