package by.teachmeskills.eshop.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String date;

    public User(String name, String surname, String email, String password, String date) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.date = date;
    }
}