package p3.shuttle;

import p3.shuttle.start.Nasa;
import p3.shuttle.start.SpaceX;

public class Main {
    public static void main(String[] args) {
        SpaceX spaceX = new SpaceX();
        Nasa nasa = new Nasa();
        SpacePort spacePort = new SpacePort();
        spacePort.start(spaceX);
        spacePort.start(nasa);
    }
}
