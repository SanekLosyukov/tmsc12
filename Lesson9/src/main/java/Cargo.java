import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cargo extends Ground {
    private final int LOADCAPACITY = 30;  //грузоподъёмность(т), константа

    public void description() {   //метод описание
        super.horsePowerToKw();    //из Класса Транспорт
        super.getNumberOfWheels();   // из Класса Ground
        super.getFuelConsumption();  // из Класса Ground
    }

    public void load(int weight) {    // метод подсчета грузоподъемности
        if (weight <= LOADCAPACITY) {
            System.out.println("Грузовик загружен " + weight + " тоннами.");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
