import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Civil extends Air {
    private int numberOfPassengers;
    private boolean availabilityOfBusinessClass;

    public void description() {   //метод описание
        getNumberOfPassengers();
        availabilityOfBusinessClass = true;
        super.horsePowerToKw();    //из Класса Транспорт
        super.getWingspan();   // из Класса Air
        super.getMinimumRunwayLengthForTakeoff();  // из Класса Air
    }
}
