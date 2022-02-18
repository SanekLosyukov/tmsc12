public class Main {
    public static void main(String[] args) {

        Passenger passenger = new Passenger("Audi");  // создал легковую машину
        passenger.driveWithMaxSpeed(2, 90);  //передал время в пути и максимальную скорость
        System.out.println("За время " + passenger.getTime() + " ч, автомобиль " + passenger.getModel() +
                " двигаясь с максимальной скоростью " + passenger.getMaxSpeed() + " км/ч проедет " +
                passenger.driveWithMaxSpeed(passenger.getTime(), passenger.getMaxSpeed()) + " км и израсходует " +
                passenger.fuelUsed() + " литров топлива.");

        System.out.println();
        Cargo cargo = new Cargo();
        cargo.load(25);       // вывод на консоль загрузки Грузовика

        System.out.println();
        Civil civil = new Civil();
        civil.load(110);      // вывод на консоль загрузки Гражданского самолета

        System.out.println();
        Military military = new Military();
        military.shot();             // вывод на консоль метода выстрел
        military.catapult();           // вывод на консоль метода катапультирование
    }
}
