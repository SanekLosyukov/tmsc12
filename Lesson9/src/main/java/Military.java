import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Military extends Air {
    private boolean ejectionSystem;
    private int numberOfMissilesOnBoard;

    public void description() {   //метод описание
        ejectionSystem = true;
        getNumberOfMissilesOnBoard();
        super.horsePowerToKw();    //из Класса Транспорт
        super.getWingspan();   // из Класса Air
        super.getMinimumRunwayLengthForTakeoff();  // из Класса Air
    }
}
