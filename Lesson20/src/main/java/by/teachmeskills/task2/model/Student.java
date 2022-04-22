package by.teachmeskills.task2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Student {
    private int id;
    private String name;
    private String surname;
    private int course;
    private String nameCity;

    public Student(String name, String surname, int course, String nameCity) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.nameCity = nameCity;
    }
}
