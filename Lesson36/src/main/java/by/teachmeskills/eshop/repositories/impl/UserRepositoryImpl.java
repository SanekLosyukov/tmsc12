package by.teachmeskills.eshop.repositories.impl;

import by.teachmeskills.eshop.entities.User;
import by.teachmeskills.eshop.repositories.UserRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private static final String GET_ALL_USERS = "SELECT * FROM users";
    private static final String INSERT_USER = "INSERT INTO users (name, surname, email, password, date) VALUES(?, ?, ?, ?, ?)";

    @Override
    public List<User> saveUser(User entity)  {
        List<User> saveUsers = new ArrayList<>();
        try (Connection connection = pool.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER);
            preparedStatement.setString(1, entity.getName());
            preparedStatement.setString(2, entity.getSurname());
            preparedStatement.setString(3, entity.getEmail());
            preparedStatement.setString(4, entity.getPassword());
            preparedStatement.setString(5, entity.getDate());
            preparedStatement.executeUpdate();
            saveUsers = read();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return saveUsers;
    }

    @Override
    public User create(User entity) {
        return null;
    }

    @Override
    public List<User> read() {
        List<User> users = new ArrayList<>();

        try (Connection connection = pool.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_USERS);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String date = rs.getString("date");
                users.add(new User(name, surname, email, password, date));
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public User update(User entity) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public User findByEmailAndPassword(String email, String password) {
        return null;
    }
}
