import static org.apache.commons.lang3.ObjectUtils.isEmpty;
import static org.apache.commons.lang3.ObjectUtils.isNotEmpty;

public class Task3 {
    public static void main(String[] args) throws Exception {
        String[] string = new String[]{"дом", "казак", "привет", "дед"};
        // в стринговую reverseString ложу реверсированный текст из оперделенной ячейке массива. И с помощью valueOf
        // преобразую полученный объект StringBuildera в String
        for (String strings : string) {
            String reverseString = String.valueOf(new StringBuilder(strings).reverse());
            if (reverseString.equals(strings) && isNotEmpty(reverseString)) {
                System.out.println(reverseString);
            } else if (isEmpty(reverseString)) {
                throw new Exception("Исключительная ситуация. Строки пустые");
            }
        }
    }
}
