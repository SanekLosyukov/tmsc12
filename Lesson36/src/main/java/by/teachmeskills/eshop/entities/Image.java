package by.teachmeskills.eshop.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Image extends BaseEntity{
    private boolean flag;
    private String imageName;
    private List<Image> images;

    public Image(boolean flag, String imageName) {
        this.flag = flag;
        this.imageName = imageName;
    }
}
