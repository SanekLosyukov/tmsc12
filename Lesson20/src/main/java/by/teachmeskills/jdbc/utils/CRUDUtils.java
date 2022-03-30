package by.teachmeskills.jdbc.utils;

import by.teachmeskills.jdbc.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {
    private static String GET_ALL_STUDENTS_QUERY = "SELECT * FROM students";
    private static String INSERT_STUDENTS_QUERY = "INSERT INTO students(name, surname, course) VALUES(?, ?, ?)";


    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_STUDENTS_QUERY);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                int course = rs.getInt("course");
                students.add(new Student(id, name, surname, course));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return students;
    }

    public static List<Student> saveStudent(Student student) {
        List<Student> updatedStudents = new ArrayList<>();
        try {

        }
    }

}
