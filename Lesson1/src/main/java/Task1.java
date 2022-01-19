import java.util.Scanner;
public class Task1 {

    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите число");
            int arg = scan.nextInt();
            if (arg > 0)  {
                count++;
            }
        }
        System.out.println("Число положительных чисел = " + count);
    }
}
