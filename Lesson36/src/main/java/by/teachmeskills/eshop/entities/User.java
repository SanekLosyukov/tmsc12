package by.teachmeskills.eshop.entities;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User extends BaseEntity {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String date;

}
