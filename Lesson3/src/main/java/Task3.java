import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        printAlphabet();
        findChet();
        module();
        clock();
        table();
        System.out.println(average());
        System.out.println(max());

    }

    //1) Используя тип данных char и операцию инкремента вывести на консоль все буквы английского алфавита.

    private static void printAlphabet() {

        char alpha = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.print(alpha++ + "\t");
        }

    }

    //2)Проверка четности числа
    //Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
    // чётным или нет. Ввод числа осуществлять с помощью класса Scanner.
    // Если пользователь введёт не целое число, то сообщать ему об ошибке.

    public static void findChet() {

        System.out.println("\n Введите целое число");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int a = scan.nextInt();
            if (a % 2 == 0) {
                System.out.println("Число является четным");
            } else {
                System.out.println("Число является нечетным");
            }
        } else {
            System.out.println("Вы не ввели целое число! " + scan);
        }

    }

    //3) Меньшее по модулю число
    //Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
    // пользователем вещественных чисел с консоли.

    public static void module() {

        Scanner scan = new Scanner(System.in);
        int[] array = new int[3];

        System.out.println("Введите первое число");
        array[0] = scan.nextInt();
        System.out.println("Введите второе число");
        array[1] = scan.nextInt();
        System.out.println("Введите третье число");
        array[2] = scan.nextInt();

        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (min > Math.abs(value)) {
                min = Math.abs(value);
            }
        }
        System.out.println("Минимальное значение по модулю: " + min);

    }

    //4) На некотором предприятии инженер Петров создал устройство, на табло которого показывается количество секунд,
    // оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
    // когда времени 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0»
    // (т.е. рабочий день закончился).
    //Программист Иванов заметил, как страдают офисные сотрудницы — им неудобно оценивать остаток рабочего дня в секундах.
    // Иванов вызвался помочь сотрудницам и написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том,
    // сколько полных часов осталось до конца рабочего дня. Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
    //Итак, в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800],
    // далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна
    // выводиться фраза о количестве полных часов, содержащихся в n секундах.

    public static void clock() {

        int[] array = new int[28801];
        int sec = new Random().nextInt(array.length);
        int hour = sec / 3600;
        System.out.println("Осталось: " + sec + " секунд. Полных часов: " + hour);

    }

    //5) Необходимо написать программу, которая будет выводить на консоль таблицу приведения типов!
//              byte	short	char	int 	long	float	double	boolean
//    byte
//    short
//    char
//    int
//    long
//    float
//    double
//    boolean
//
//    На пересечении напишите следующие фразы:
//    ня (неявное) – если преобразование происходит автоматически,
//    я (явное) – если нужно использовать явное преобразование,
//    х – если преобразование невозможно,
//    т  - если преобразование тождественно.
//    Внимание! используйте System.out.printLn

    public static void table() {

        System.out.println("                          ТАБЛИЦА ПРИВЕДЕНИЯ ТИПОВ               ");
        System.out.println("        byte   short   char   int    long  float  double boolean ");
        System.out.println("byte      Т      НЯ     Я      НЯ     НЯ    НЯ     НЯ       X    ");
        System.out.println("short     Я      Т      Я      НЯ     НЯ    НЯ     НЯ       X    ");
        System.out.println("char      Я      Я      Т      НЯ     НЯ    НЯ     НЯ       X    ");
        System.out.println("int       Я      Я      Я      Т      НЯ    НЯ     HЯ       X    ");
        System.out.println("long      Я      Я      Я      Я      Т     НЯ     НЯ       X    ");
        System.out.println("float     Я      Я      Я      Я      Я     Т      HЯ       X    ");
        System.out.println("double    Я      Я      Я      Я      Я     Я      Т        X    ");
        System.out.println("boolean   X      X      X      X      X     X      X        Т    ");

    }

    /**
     * 6) Метод должен вернуть среднее значение из массива чисел
     * (необходимо сумму всех элеменов массива разделить на длину массива)
     * <p>
     * Example:
     * array = {1,2,3,4,5}
     * Метод должен return 3.0
     * <p>
     * return
     */

    public static double average() {

        int[] array = new int[]{1, 2, 3, 4, 5};
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        sum = sum / array.length;
        return sum;

    }

    /**
     * 7) Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
     **/

    public static int max() {

        int[] array = new int[]{1, 2, 10, 3};
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;

    }

}




