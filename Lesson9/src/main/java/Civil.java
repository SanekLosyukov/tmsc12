import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Civil extends Air {
    private final int NUMBEROFPASSENGERS = 105;  // константа вместимости самолета
    private boolean availabilityOfBusinessClass;

    public void description() {   //метод описание
        availabilityOfBusinessClass = true;
        super.horsePowerToKw();    //из Класса Транспорт
        super.getWingspan();   // из Класса Air
        super.getMinimumRunwayLengthForTakeoff();  // из Класса Air
    }

    public void load(int capacity) {    // метод подсчета вместимости салона самолета
        if (capacity <= NUMBEROFPASSENGERS) {
            System.out.println("Самолет заполнен " + capacity + " человек.");
        } else {
            System.out.println("В данный самолет столько людей не вмещается");
        }
    }
}
