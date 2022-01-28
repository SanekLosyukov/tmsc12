import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
//        dniNedeli();
//        System.out.println("Количство амёб " + amoeba());
        cifry();
    }

//1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.

    public static void dniNedeli() {
        int[] array = new int[7];
        int rand = new Random().nextInt(array.length);
        switch (rand) {
            case 1:
                System.out.println("Рандомное число " + rand + ". Это понедельник");
                break;
            case 2:
                System.out.println("Рандомное число " + rand + ". Это вторник");
                break;
            case 3:
                System.out.println("Рандомное число " + rand + ". Это среда");
                break;
            case 4:
                System.out.println("Рандомное число " + rand + ". Это четверг");
                break;
            case 5:
                System.out.println("Рандомное число " + rand + ". Это пятница");
                break;
            case 6:
                System.out.println("Рандомное число " + rand + ". Это выходные");
                break;
            case 7:
                System.out.println("Рандомное число " + rand + ". Это выходные");
                break;
        }
    }

    //2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа

    public static int amoeba() {
        int sum = 1;
        for (int i = 0; i < 24; i = i + 3) {
            sum = sum * 2;
        }
        return sum;
    }

    //3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"
    public static void cifry() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
        String b = Integer.toString(a);
        System.out.println("Количество цифр: " + b.length());
    }

//4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.

    //Некоторые тесты для проверки задач. Можно также написать свои тесты.
//            printArray();
//            System.out.println(operation(1));
//            System.out.println(operation(0));
//            System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
//            countDevs(103);
//            countDevs(11);
//            foobar(6);
//            foobar(10);
//            foobar(15);
//            printPrimeNumbers();
//        }

    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * сделать проверку что если пользователь ввел не положительное число,
     * то вывести ошибку и отправить пользователя вводить заново новое число!
     * далее создать одномерный массив типа int размера прочитанного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
//    private static void printArray() {
//        // тут пишем логику
//    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
//    public static int operation(int number) {
//        // тут пишем логику
//        return 0;
//    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
//    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
//        // тут пишем логику
//        return 0;
//    }

//    /**
//     * На вход приходит число.
//     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
//     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
//     * уместное с точки зрения русского языка.
//     * Пример: 1 программист, 42 программиста, 50 программистов
//     *
//     * @param count - количество программистов
//     */
//    public static void countDevs(int count) {
//        // тут пишем логику
//    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
//    public static void foobar(int number) {
//        // тут пишем логику
//    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     //     */
//    public static void printPrimeNumbers() {
//        // тут пишем логику
//    }
}

