import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Military extends Air {
    private boolean ejectionSystem;
    private final int NUMBEROFMISSLEONBOARD = 10;

    public void description() {   //метод описание
        ejectionSystem = true;
        super.horsePowerToKw();    //из Класса Транспорт
        super.getWingspan();   // из Класса Air
        super.getMinimumRunwayLengthForTakeoff();  // из Класса Air
    }

    public void shot() {
        if (NUMBEROFMISSLEONBOARD != 0) {
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void catapult() {
        if (ejectionSystem = true) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
