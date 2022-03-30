package by.teachmeskills.task2;

import by.teachmeskills.task2.model.Student;
import by.teachmeskills.task2.utils.CRUDUtils;

public class Application {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "Ivanov", 5, "Minsk");
        System.out.println("Saved students:");
        System.out.println(CRUDUtils.saveStudent(student));
        System.out.println("---------------------------------------------------");

        System.out.println("All students:");
        System.out.println(CRUDUtils.getAllStudents());
        System.out.println("---------------------------------------------------");

        System.out.println("Updated students:");
        System.out.println(CRUDUtils.updateStudent(1, 3));
        System.out.println("----------------------------------------------------");

        System.out.println("Updated students by City:");
        System.out.println(CRUDUtils.updateCity(2, "Chelyabinsk"));
        System.out.println("----------------------------------------------------");

        System.out.println("Deleted students: ");
        System.out.println(CRUDUtils.deleteStudent(8));

        System.out.println("Deleted students by City name Minsk: ");
        System.out.println(CRUDUtils.deleteCity("Minsk"));
    }

}
