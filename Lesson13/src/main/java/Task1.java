public class Task1 {
    public static void main(String[] args) {
        //Будем вырезать подстроку от первого вхождения "а" до последнего вхождения "q"
        // Должно из aqwertyabcdqwerty получиться - - >  aqwertyabcd
        String string = new String("aqwertyabcdqwerty");
        System.out.println(string.substring(string.indexOf("a"), string.lastIndexOf("q")));

    }
}
