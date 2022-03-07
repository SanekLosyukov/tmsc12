package task6;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Петров Иван Иванович", 200.5388);
        Employee employee2 = new Employee("Иванов Василий Геннадьевич", 154.4876);
        Employee employee3 = new Employee("Смирнов Илья Алексеевич", 212.1127);
        Employee employee4 = new Employee("Ленин Владимир Ильич", 356.6978);
        employee.generateReport();
        employee2.generateReport();
        employee3.generateReport();
        employee4.generateReport();
    }

}
