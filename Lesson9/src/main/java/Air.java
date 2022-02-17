import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Air extends Transport {
    private int wingspan; //размах крыльев, м
    private int minimumRunwayLengthForTakeoff; //Минимальная длина взлётно-посадочной полосы для взлёта
}
