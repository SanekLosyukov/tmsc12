package p1;

import java.util.ArrayList;

import static p1.IInstrument.Type.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<IInstrument> instruments = new ArrayList<>();
        instruments.add(createInstrument(GUITAR, 6));
        instruments.add(createInstrument(DRUM, 6));
        instruments.add(createInstrument(TRUMPET, 6));
        for (IInstrument instrument : instruments) {
            instrument.play();
        }
    }

    private static IInstrument createInstrument(IInstrument.Type iInstrument, int parametr) {
        return switch (iInstrument) {
            case DRUM -> new Drum(parametr);
            case GUITAR -> new Guitar(parametr);
            case TRUMPET -> new Trumpet(parametr);
        };
    }
}
