import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cargo extends Ground {
    private int loadCapacity;  //грузоподъёмность(т)

    public void description() {   //метод описание
        getLoadCapacity();
        super.horsePowerToKw();    //из Класса Транспорт
        super.getNumberOfWheels();   // из Класса Ground
        super.getFuelConsumption();  // из Класса Ground
    }

}
