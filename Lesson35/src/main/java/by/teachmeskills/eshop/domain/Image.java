package by.teachmeskills.eshop.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Image {
    private boolean flag;
    private String imageName;
    private List<Image> images;

    public Image(boolean flag, String imageName) {
        this.flag = flag;
        this.imageName = imageName;
    }
}
