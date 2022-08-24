package by.teachmeskills.eshop.services;

import by.teachmeskills.eshop.entities.CustomUserDetails;
import by.teachmeskills.eshop.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    private final UserService userService;

    public CustomUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userEntity = userService.findByLogin(username);
        return userEntity.map(CustomUserDetails::fromUserEntityToCustomUserDetails).orElse(null);
    }
}
