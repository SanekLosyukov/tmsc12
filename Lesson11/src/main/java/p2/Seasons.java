package p2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Seasons {
    SUMMER(22, "Я люблю лето") {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(10, "Я люблю осень"),
    WINTER(-5, "Я люблю зиму"),
    SPRING(15, "Я люблю весну");

    private final int temperature;
    private final String info;

    public String getDescription() {
        return "Холодное время года";
    }

}
