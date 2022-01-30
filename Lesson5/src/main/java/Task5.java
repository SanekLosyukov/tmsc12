import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        System.out.println(summ(-5, -7));
        treug();
        nechetMassive();
        maxElement();
        zamena();
        zamenaMaxElementa();
        proverkaElementov();
        printMatrix();
        calculateSumOfDiagonalElements();
    }

    //        1) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
    public static int summ(int a, int b) {
        int[] array = new int[Math.abs(a)];
        int sum = 0;
        Arrays.fill(array, Math.abs(b));
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
            return (-sum);
        } else {
            return (sum);
        }
    }

    //        2) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида
//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *
    public static void treug() {
        String[][] array = {
                {"       *        *       "},
                {"     * *        * *     "},
                {"   * * *        * * *   "},
                {" * * * *        * * * * "},
                {"                        "},
                {"                        "},
                {"                        "},
                {" * * * *        * * * * "},
                {"   * * *        * * *   "},
                {"     * *        * *     "},
                {"       *        *       "},
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //        3) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
    public static void nechetMassive() {
        int[] arr = new int[100];
        int a = 0;
        for (int i = 1; i <= arr.length; i++) {
            if (i % 2 != 0)
                a++;
        }
        int[] array = new int[a];
        for (int i = 1, j = 0; i <= arr.length; i++) {
            if (i % 2 != 0) {
                array[j] = i;
                j++;
            }
        }
        System.out.println(Arrays.toString(array));
        invertArray(array);
        System.out.println(Arrays.toString(array));
    }

    private static void invertArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }

    //        4) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

    public static void maxElement() {
        int[] array = new int[15];
        int max = 0;
        int index = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
            if (array[i] >= max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(max + " " + index);
    }

    //        5) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.
    public static void zamena() {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //        6) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
    public static void zamenaMaxElementa() {
        int[] array = new int[]{4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println(Arrays.toString(array));
        int temp = array[0];
        array[0] = max;
        array[index] = temp;
        System.out.println(Arrays.toString(array));
    }

    //        7) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов
    public static void proverkaElementov() {
        int[] array = new int[]{0, 3, 46, 3, 2, 1, 2};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Массив имеет повторяющиеся элементы" + array[i]);
                }
            }
        }
    }

    //        8) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7
    public static void printMatrix() {
        System.out.println("Введите количество строк матрицы");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите количество столбцов матрицы");
        int b = scanner.nextInt();
        int[][] array = new int[a][b];
        Random random = new Random();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = random.nextInt(51);
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("");
        int[][] transp = new int[b][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                transp[j][i] = array[i][j];
            }
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(transp[i][j] + " ");
            }
            System.out.println("");
        }
    }

    /*10)
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     * <p>
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * <p>
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */

    public static void calculateSumOfDiagonalElements() {
        System.out.println("Введите количество строк матрицы");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите количество столбцов матрицы");
        int b = scanner.nextInt();
        int[][] array = new int[a][b];
        Random random = new Random();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = random.nextInt(101);
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        String[][] neWarray = new String[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                neWarray[i][j] = String.valueOf(array[i][j]);
                if (array[i][j] % 3 == 0) {
                    neWarray[i][j] = "+";
                } else if (array[i][j] % 7 == 0) {
                    neWarray[i][j] = "-";
                } else {
                    neWarray[i][j] = "*";
                }
                System.out.print(neWarray[i][j] + " ");
            }
            System.out.println("");
        }
    }
}



