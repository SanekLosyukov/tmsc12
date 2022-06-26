package by.teachmeskills.eshop.repositories;

import by.teachmeskills.eshop.entities.User;

import java.util.List;


public interface UserRepository extends BaseRepository<User> {
    User findById(int id);
    User findByEmailAndPassword(String email, String password);
    List<User> saveUser(User user);
}
