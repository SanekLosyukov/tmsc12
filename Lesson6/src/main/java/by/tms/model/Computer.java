package by.tms.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String cpu;
    private String ram;
    private String hdd;
    private int cycleResource;
    private boolean burn = false;     //булевская переменная; true - сгорел или false - не сгорел;

    public Computer(String cpu, String ram, String hdd, int cycleResource) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.cycleResource = cycleResource;
    }

    public void on() {    // метод включение
        System.out.println("Внимание! Введите 0 или 1");
        Scanner scanner = new Scanner(System.in);
        int personValue = scanner.nextInt();
        Random random = new Random();
        int randomValue = random.nextInt(2);
        if (personValue == randomValue) {
            off();
        } else {
            burn();
            burn = true;
        }
    }

    public void secondOn() {  // метод повторное включение
        if (burn = true) {
            burn();
        } else {
            on();
        }
    }

    public void off() {  // метод выключение
        System.out.println("Выключение компьютера");
        cycleResource--;
    }

    public void burn() {  // метод когда компьютер сгорел
        System.out.println("Компьютер сгорел");
        cycleResource = 0;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cycleResource=" + cycleResource +
                '}';
    }
}
