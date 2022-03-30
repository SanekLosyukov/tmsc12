package by.teachmeskills.servletlogin.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class User {
    private String email = "user@mail.ru";
    private String password = "12345";
}
