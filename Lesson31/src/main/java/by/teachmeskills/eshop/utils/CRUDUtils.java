package by.teachmeskills.eshop.utils;

import by.teachmeskills.eshop.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {
    private static final String GET_ALL_USERS_QUERY = "SELECT * FROM users";
    private static final String INSERT_USER_QUERY = "INSERT INTO users (name, surname, email, date) VALUES(?, ?, ?, ?)";


    public static List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_USERS_QUERY);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");
                String date = rs.getString("date");

                users.add(new User(name, surname, email, date));
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return users;
    }

    public static List<User> saveUser(User user) {
        List<User> saveUsers = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_QUERY);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getDate());
            preparedStatement.executeUpdate();
            saveUsers = getAllUsers();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return saveUsers;
    }
}
