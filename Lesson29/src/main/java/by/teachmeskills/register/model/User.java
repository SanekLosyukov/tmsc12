package by.teachmeskills.register.model;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String date;

    public User(String name, String surname, String email, String date) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.date = date;
    }
}
