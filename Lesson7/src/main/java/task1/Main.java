package task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Address addressMinsk = new Address("Belarus", "Minsk");
        Address addressGrodno = new Address("Belarus", "Grodno");
        Address addressBrest = new Address("Belarus", "Brest");

        Person person1 = new Person("Alexandr", 22, Person.getSEX(), addressMinsk);
        Person person2 = new Person("Sergey", 27, Person.getSEX(), addressGrodno);
        Person person3 = new Person("Vasiliy", 19, Person.getSEX(), addressBrest);
        Person person4 = new Person("Alexandr", 20, Person.getSEX(), addressBrest);
        Person person5 = new Person("Gennadiy", 30, Person.getSEX(), addressMinsk);
        Person person6 = new Person("Evgeniy", 16, Person.getSEX(), addressMinsk);

        Person[] citizens = {person1, person2, person3, person4, person5, person6};
        PersonRegistry registry = new PersonRegistry(citizens);

        System.out.println(Arrays.toString((registry.findByAge()))); // а) все призывники
        System.out.println(Arrays.toString(registry.findByMinsk("Minsk"))); // б) призывники Минска
        System.out.println(Arrays.toString(registry.findByAge25to27())); // в) призывники от 25 до 27 лет
        System.out.println(Arrays.toString(registry.findByAlexandr("Alexandr"))); // г) призывники Александры
    }
}
