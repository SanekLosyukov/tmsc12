import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Passenger extends Ground {
    private String bodyType;
    private int numberOfPassengers;
    private int time;
    private final int FUELCONSUMPTION = 10;  // расход топлива константа 10 л/ 100 км

    public Passenger(String model) {
        super(model);
    }

    public void description() {   //метод описание
        getBodyType();
        getNumberOfPassengers();
        super.horsePowerToKw();    //из Класса Транспорт
        super.getNumberOfWheels();   // из Класса Ground
        super.getFuelConsumption();  // из Класса Ground
    }

    public int driveWithMaxSpeed(int time, int maxSpeed) {
        this.time = time;
        super.maxSpeed = maxSpeed;
        return maxSpeed * time;                                   // возвращает пройденное расстояние
    }

    public int fuelUsed() {   // метод израсходованное топливо
        return this.time * super.maxSpeed * FUELCONSUMPTION / 100;
    }
}
