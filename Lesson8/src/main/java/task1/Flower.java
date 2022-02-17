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
public class Flower {
    private String name;
    private BigDecimal price;
}
