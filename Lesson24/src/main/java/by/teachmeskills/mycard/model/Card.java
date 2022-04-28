package by.teachmeskills.mycard.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Card {
    private String id;
    private String name;
    private String imageName;

    public Card(String name, String imageName) {
        this.name = name;
        this.imageName = imageName;
    }
}