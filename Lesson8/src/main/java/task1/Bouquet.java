package task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Bouquet {
    private Flower[] flowers;  //массив цветов

    //цена ВСЕХ цветов в одном букете:
    public BigDecimal getPrice() {
        BigDecimal result = BigDecimal.ZERO;
        for (Flower flower : flowers) {
            if (flower != null) {
                result = result.add(flower.getPrice());
            }
        }
        return result;
    }
}
