package by.teachmeskills.task2.utils;

import by.teachmeskills.task2.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {
    private static String GET_ALL_STUDENTS_QUERY = "SELECT * FROM students";
    private static String INSERT_STUDENT_QUERY = "INSERT INTO students(name, surname, course, nameCity) VALUES(?, ?, ?, ?)"; //VALUES(?, ?, ?, ?) - если был бы Statement, то пришлось бы явно инициализировать. Здесь благодаря PreparedStatement можно в ? задавать параметры (см. saveStudent(Student student))
    private static String UPDATE_CITY_QUERY = "UPDATE students SET nameCity = ? WHERE id = ?";
    private static String UPDATE_STUDENT_QUERY = "UPDATE students SET course = ? WHERE id = ?";
    private static String DELETE_STUDENT_QUERY = "DELETE FROM students WHERE id = ?";
    private static String DELETE_CITY_QUERY = "DELETE FROM students WHERE nameCity = ?";

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
                String nameCity = rs.getString("nameCity");
                students.add(new Student(id, name, surname, course, nameCity));
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return students;
    }

    public static List<Student> saveStudent(Student student) {
        List<Student> saveStudents = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT_QUERY);
            preparedStatement.setString(1, student.getName());   // 1 - первый вопрос из VALUES в INSERT_STUDENT_QUERY
            preparedStatement.setString(2, student.getSurname());  // 2-й и тд
            preparedStatement.setInt(3, student.getCourse());
            preparedStatement.executeUpdate();
            saveStudents = getAllStudents();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return saveStudents;
    }

    public static List<Student> updateStudent(int studentId, int course) {
        List<Student> updatedStudents = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_STUDENT_QUERY);
            preparedStatement.setInt(1, course);
            preparedStatement.setInt(2, studentId);
            preparedStatement.executeUpdate();
            updatedStudents = getAllStudents();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updatedStudents;
    }

    public static List<Student> updateCity(int studentId, String nameCity) {
        List<Student> updatedCitys = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CITY_QUERY);
            preparedStatement.setString(1, nameCity);
            preparedStatement.setInt(2, studentId);
            preparedStatement.executeUpdate();
            updatedCitys = getAllStudents();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updatedCitys;
    }

    public static List<Student> deleteStudent(int studentId) {
        List<Student> deleteStudents = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_STUDENT_QUERY);
            preparedStatement.setInt(1, studentId);
            preparedStatement.execute();
            deleteStudents = getAllStudents();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return deleteStudents;
    }

    public static List<Student> deleteCity(String nameCity) {
        List<Student> deleteStudentsByCity = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CITY_QUERY);
            preparedStatement.setString(1, nameCity);
            preparedStatement.execute();
            deleteStudentsByCity = getAllStudents();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return deleteStudentsByCity;
    }
}
