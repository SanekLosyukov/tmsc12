package by.tms.service;

import by.tms.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel", "32 Gb", "1 Tb", 100);
        computer.on();
        computer.secondOn();
        System.out.println(computer.toString());
    }
}
