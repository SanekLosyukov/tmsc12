package by.teachmeskills.eshop.services.impl;

import by.teachmeskills.eshop.entities.User;
import by.teachmeskills.eshop.repositories.UserRepository;
import by.teachmeskills.eshop.repositories.impl.UserRepositoryImpl;
import by.teachmeskills.eshop.services.UserService;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public User create(User entity) {
        return userRepository.create(entity);
    }

    @Override
    public List<User> read() {
        return userRepository.read();
    }

    @Override
    public User update(User entity) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    public User getCertainUserWithId(int id){
        List<User> users = userRepository.read();
        Optional<User> user = users.stream().filter(u -> u.getId() == 1).findFirst();
        return user.orElse(null);
    }
}
