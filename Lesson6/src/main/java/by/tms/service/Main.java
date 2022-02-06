package by.tms.service;

import by.tms.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel", "32 Gb", "1 Tb", 10);
        computer.on();
        System.out.println(computer);
    }
}
