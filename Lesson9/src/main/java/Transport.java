import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transport {
    protected int horsePower;
    protected int maxSpeed;
    protected int weight;
    protected String model;

    public Transport(String model) {
        this.model = model;
    }

    public double horsePowerToKw() {   // метод перевода лошадок в килоВатты
        double kWPower = (double) horsePower * 0.74;
        return kWPower;
    }
}
