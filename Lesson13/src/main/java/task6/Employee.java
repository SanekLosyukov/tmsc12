package task6;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Employee implements Report {

    private String fullname;
    private double salary;

    @Override
    public void generateReport() {
        String[] string = fullname.split(" ");
        StringBuilder resultName = new StringBuilder()
                .append(string[2], 0, 1).append(".")
                .append(string[1], 0, 1).append(". ")
                .append(string[0]);
        String stringSalary = String.valueOf(salary); //перевел дабл в стринг
        int indexPoint = stringSalary.indexOf(".");//найду индекс первого вхождения точки
        String resultSalary = stringSalary.substring(0, indexPoint + 3); // обрезка строки с зарплатой от 0-го значения, до 3 после точки не включительно
        StringBuilder result = new StringBuilder().append("| ")
                .append(resultName)
                .append("     |     ")
                .append(resultSalary)
                .append(" |");
        System.out.println(result);
    }
}
