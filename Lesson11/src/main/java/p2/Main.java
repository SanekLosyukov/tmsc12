package p2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Seasons> seasons = new ArrayList<>();
        seasons.add(Seasons.SUMMER);
        seasons.add(Seasons.AUTUMN);
        seasons.add(Seasons.WINTER);
        seasons.add(Seasons.SPRING);
        for (Seasons season : seasons) {
            System.out.println(season.getDescription());
            System.out.println("Средняя температура " + season.getTemperature());
            System.out.println(season.getInfo());
        }
    }
}
