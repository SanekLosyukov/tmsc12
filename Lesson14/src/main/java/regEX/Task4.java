package regEX;

public class Task4 {
    public static void main(String[] args) {
        String str = "One two three раз два три one1 two2 123 ";
        System.out.println(str.split("(\\s+)|([а-я]+)|([a-z]*\\d+)").length);
    }
}