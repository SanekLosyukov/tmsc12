package files.task2;

import java.util.Arrays;

import static org.apache.commons.lang3.ObjectUtils.isNotEmpty;

public class TextFormatter {
    public String wordsInString(String string) {
        String[] s1 = string.split("\\.");
        for (String strings : s1) {
            String[] s2 = strings.trim().split("\\s");
            if (s2.length >= 3 && s2.length <= 5) {
                return Arrays.toString(s2);
            }
        }
        return null;
    }

    public boolean searchPalindrome(String string) {
        String[] s1 = string.split("\\s");
        for (String strings : s1) {
            String reverseString = String.valueOf(new StringBuilder(strings).reverse()); //реверсирую все слова через СтрингБилдер и складываю их в reverseString
            if (reverseString.equals(strings) && isNotEmpty(reverseString) && strings.length() != 1) { // проверяю на эквивалентность, пустоту и чтобы это не была одна буква
                return true;
            }
        }
        return false;
    }
}

