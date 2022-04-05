package by.teachmeskills.task2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                ", name City" + nameCity +
                '}';
    }
}
