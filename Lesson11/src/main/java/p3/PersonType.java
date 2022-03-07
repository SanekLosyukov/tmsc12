package p3;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PersonType {
    MAN(IManClothes.class), WOMAN(IWomanClothes.class);

    private final Class<?> iClass;
}
