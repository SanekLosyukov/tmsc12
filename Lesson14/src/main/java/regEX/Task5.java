package regEX;

public class Task5 {
    public static void main(String[] args) {
        String str = "qweqewrqweqwe15we";
        System.out.println(str.matches("[a-z15]{4,20}"));
    }
}
