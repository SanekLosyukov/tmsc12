package task1;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static task1.Constants.flowerNamePriceArray;

@Getter
public class FlowerMarket {
    private final List<Bouquet> soldBouquets = new ArrayList<>();

    //  магазин получает (собирает) букет из цветов
    public Bouquet getBouquet(String... flowers) {
        Flower[] result = new Flower[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            String flowerName = flowers[i];
            BigDecimal price = findPriceByFlowerName(flowerName);
            if (price != null) {
                result[i] = new Flower(flowerName, price);
            }
        }
        Bouquet bouquet = new Bouquet(result);
        soldBouquets.add(bouquet);
        return bouquet;
    }

    // ищем цену по названию цветка для этой строки BigDecimal price = findPriceByFlowerName(flowerName) и кладем ее в price, бегая фором
    private BigDecimal findPriceByFlowerName(String name) {
        for (int i = 0; i < flowerNamePriceArray.length; i++) {
            String flowerName = flowerNamePriceArray[i][0];
            if (name.equalsIgnoreCase(flowerName)) {
                return new BigDecimal(flowerNamePriceArray[i][1]); // возврат цены в виде объекта БигДэцимал
            }
        }
        return null;
    }
}
