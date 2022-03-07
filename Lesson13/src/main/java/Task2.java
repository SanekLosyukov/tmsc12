public class Task2 {
    public static void main(String[] args) {
        //в aqwertyabcdqwerty  "е" заменим на "а"
        String string = new String("aqwertyabcdqwerty");
        System.out.println(string.replace(string.charAt(3), string.charAt(0)));
    }
}
