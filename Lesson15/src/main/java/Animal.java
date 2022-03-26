import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Animal implements Serializable {
    private String name;
    private int age;
}
