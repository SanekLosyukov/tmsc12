package regEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    /* Должно вывести:
           * cab
    * ccab
     cccab */
    public static void main(String[] args) {
        public void print (String str){
            Pattern pattern = Pattern.compile("c+ab");
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }


        }

    }

}
