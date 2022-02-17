package task1;

import static task1.Constants.*;

public class Main {
    public static void main(String[] args) {

        FlowerMarket flowerMarket = new FlowerMarket();
        Bouquet[] bouquets = {
                flowerMarket.getBouquet(ROSE, ROSE, ROSE, "кактус"),
                flowerMarket.getBouquet(LILY, ROSE, ROSE, LILY),
                flowerMarket.getBouquet(HERBERA, ROSE, ROSE, LILY)
        };
        for (Bouquet bouquet : bouquets) {
            System.out.println(bouquet);
            System.out.println("стоимость букета " + bouquet.getPrice());
        }
    }
}
