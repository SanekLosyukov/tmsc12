import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ground extends Transport {
    protected int numberOfWheels;
    protected int fuelConsumption; //расход топлива в л/100 км

    public Ground(String model) {
        super(model);
    }
}
