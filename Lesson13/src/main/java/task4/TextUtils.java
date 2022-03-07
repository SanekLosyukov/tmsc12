package task4;

import java.util.Arrays;

import static org.apache.commons.lang3.ObjectUtils.isEmpty;
import static org.apache.commons.lang3.ObjectUtils.isNotEmpty;

public class TextUtils {
    public void numberOfWordsInString(String string) {
        String[] s1 = string.split("\\. "); // разбил текст на предложения сплитом через точку
        System.out.println(Arrays.toString(s1)); //вывел массив, в каждой ячейчке лежит предложение
        System.out.println("Количество предложений = " + s1.length); // посмотрел на консоли сколько их
        for (String strings : s1) {  // бегаю форичем по массиву предложений
            String[] s2 = strings.split(" ");  // создаю новые массивы, куда складываю слова из каждого предложения
            if (s2.length >= 3 && s2.length <= 5) { // условие от 3 до 5 слов
                System.out.println(Arrays.toString(s2));   // достаю тот массив, где от 3 до 5 слов
            }
        }
    }

    public void searchPolydrome(String string) throws Exception {
        String[] s1 = string.split(" "); //разбил сплитом текст на слова
        for (String strings : s1) {
            String reverseString = String.valueOf(new StringBuilder(strings).reverse()); //реверсирую все слова через СтрингБилдер и складываю их в reverseString
            if (reverseString.equals(strings) && isNotEmpty(reverseString) && !(strings.length() == 1)) { // проверяю на эквивалентность, пустоту и чтобы это не была одна буква
                System.out.println(reverseString);
            } else if (isEmpty(reverseString)) { // для разнообразия кинул эксепшн
                throw new Exception("Исключительная ситуация. Строки пустые");
            }
        }
    }
}
