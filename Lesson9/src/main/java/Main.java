public class Main {
    public static void main(String[] args) {

        Passenger passenger = new Passenger();  // создал легковую машину
        passenger.driveWithMaxSpeed(2, 90);  //передал 2 часа и 90 км/ч
        System.out.println("За время " + passenger.getTime() + " ч, автомобиль" + passenger.getModel() +
                " двигаясь с максимальной скоростью " + passenger.getMaxSpeed() + " км/ч проедет " +
                passenger.driveWithMaxSpeed(passenger.getTime(), passenger.getMaxSpeed()) + " км и израсходует " +
                passenger.fuelUsed() + " литров топлива.");


    }
}
