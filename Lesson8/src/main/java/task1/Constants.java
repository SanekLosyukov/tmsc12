package task1;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {
    public static final String ROSE = "ROSE";
    public static final String LILY = "LILY";
    public static final String ASTER = "ASTER";
    public static final String HERBERA = "HERBERA";
    public static final String TULIP = "TULIP";
    public static final String CARNATION = "CARNATION";

    public static final String PRICE_ROSE = "15";
    public static final String PRICE_LILY = "7";
    public static final String PRICE_ASTER = "5";
    public static final String PRICE_HERBERA = "5";
    public static final String PRICE_TULIP = "8";
    public static final String PRICE_CARNATION = "11";

    public static final String[][] flowerNamePriceArray = {
            {ROSE, PRICE_ROSE},
            {LILY, PRICE_LILY},
            {ASTER, PRICE_ASTER},
            {HERBERA, PRICE_HERBERA},
            {TULIP, PRICE_TULIP},
            {CARNATION, PRICE_CARNATION}
    };
}
