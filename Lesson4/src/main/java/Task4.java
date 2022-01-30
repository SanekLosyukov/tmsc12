import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
//        dniNedeli();
//        System.out.println("Количство амёб " + amoeba());

        cifry();

//        znakZodiaka();
//        printArray();
//        System.out.println(num(-25));
//        System.out.println("Количество нечетных чисел в массиве " + massive());
//        stroki(15);

//        operation();
    }

//1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.

    public static void dniNedeli() {
        int rand = new Random().nextInt(8);
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
        if (a == 0) {
            do {
                System.out.println("Вы ввели 0. Это не положительное и не отрицательное. Снова введите число");
                scanner.next();
            }
            while (a != 0);
        }
        if (a > 0) {
            System.out.println("Число положительное");
        } else if (a < 0) {
            System.out.println("Число отрицательное");
        }
        String b = Integer.toString(Math.abs(a));
        System.out.println("Количество цифр: " + b.length());
    }

    //4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.
    public static void znakZodiaka() {
        System.out.println("Введите день рождения");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        System.out.println("Введите месяц рождения");
        int month = scanner.nextInt();
        if ((month == 1 && day >= 21 && day <= 31) || (month == 2 && day >= 1 && day <= 19)) {
            System.out.println("Водолей");
        } else if ((month == 2 && day >= 20 && day <= 28) || (month == 3 && day >= 1 && day <= 20)) {
            System.out.println("Рыбы");
        } else if ((month == 3 && day >= 21 && day <= 31) || (month == 4 && day >= 1 && day <= 20)) {
            System.out.println("Овен");
        } else if ((month == 4 && day >= 21 && day <= 30) || (month == 5 && day >= 1 && day <= 21)) {
            System.out.println("Телец");
        } else if ((month == 5 && day >= 22 && day <= 31) || (month == 6 && day >= 1 && day <= 21)) {
            System.out.println("Близнецы");
        } else if ((month == 6 && day >= 22 && day <= 30) || (month == 7 && day >= 1 && day <= 22)) {
            System.out.println("Рак");
        } else if ((month == 7 && day >= 23 && day <= 31) || (month == 8 && day >= 1 && day <= 21)) {
            System.out.println("Лев");
        } else if ((month == 8 && day >= 22 && day <= 31) || (month == 9 && day >= 1 && day <= 23)) {
            System.out.println("Дева");
        } else if ((month == 9 && day >= 24 && day <= 30) || (month == 10 && day >= 1 && day <= 23)) {
            System.out.println("Весы");
        } else if ((month == 10 && day >= 24 && day <= 31) || (month == 11 && day >= 1 && day <= 23)) {
            System.out.println("Скорпион");
        } else if ((month == 11 && day >= 24 && day <= 30) || (month == 12 && day >= 1 && day <= 22)) {
            System.out.println("Телец");
        } else if ((month == 12 && day >= 23 && day <= 31) || (month == 1 && day >= 1 && day <= 20)) {
            System.out.println("Козерог");
        }
    }


    /**
     * 5)
     * Необходимо прочитать с консоли значение числа типа int,
     * сделать проверку что если пользователь ввел не положительное число,
     * то вывести ошибку и отправить пользователя вводить заново новое число!
     * далее создать одномерный массив типа int размера прочитанного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        System.out.println("Введите положительное число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) {
            int[] array = new int[a];
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(array.length);
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("Вы ввели не положительное число. Введите положительное число");
            scanner.next();
        }
    }


// * 6)
// * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
// * - if number положительное число, то необходимо number увеличить на 1
// * - if number отрицательное - уменьшить на 2
// * - if number равно 0 , то замените значение number на 10
// * вернуть number после выполнения операций

    public static int num(int number) {
        if (number > 0) {
            number++;
        } else {
            if (number == 0) {
                number = 10;
            } else {
                number = number - 2;
            }
        }
        return number;
    }


// * 7)
// * На вход приходит массив целых чисел типа int
// * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
// * в котором это значение распечатается на консоль.

    public static int massive() {
        int result = 0;
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
        }
        for (int i : array) {
            if (array[i] % 2 != 0) {
                result++;
            }
        }
        return result;
    }

    // * 8)
// * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
// * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
// * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
// * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
    private static void foo() {
        System.out.print("foo");
    }

    private static void bar() {
        System.out.print("bar");
    }

    private static void stroki(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            foo();
            bar();
        } else if (number % 3 == 0) {
            foo();
        } else if (number % 5 == 0) {
            bar();
        }
    }

}

//В РАЗРАБОТКЕ
// * 9)
// * Задача со звездочкой!
// * Метод должен печатать все простые числа <1000
// * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
// * //
// */
//    public static void operation() {
//        int[] array = new int[1001];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i;
//        }
//        System.out.print("2 5 7");
//        for (int i : array) {
//            if (array[i] != 1 && !(array[i] % 2 == 0) && !(array[i] % 3 == 0) && !(array[i] % 5 == 0) && !(array[i] % 7 == 0)) {
//                System.out.print(" " + array[i]);
//            }
//        }
//    }
//}


