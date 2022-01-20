public class Task2 {
    public static void main(String[] args) {

        //вывод на консоль
        printLiterals();
        //Некоторые тесты для проверки задач.
        System.out.println(sum(100, 200));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        /*System.out.println(max(56, 349));
        System.out.println(calculateHypotenuse(3, 4));*/


    }

    private static void printLiterals() {

        boolean a = true;    //        логический
        String b = "String";    //        строковый
        char c = 'b';           //        символьный
        int d = 0b1101;         //        целочисленный 2-й
        int e = 010;            //        целочисленный 8-й
        int f = 514;            //        целочисленный 10-й
        int g = 0x6F;            //        целочисленный 16-й
        float h = 1.2f;         //        литерал типа float
        double i = 1.2;         //        литерал типа double
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
    }

    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     **/
    public static int sum(int a, int b) {
        long c = (long) a + b;
        if (c > Integer.MAX_VALUE)
            return -1;
        else return a + b;
    }

    /**
     * Метод должен вернуть максимальное значение из двух чисел
     *
     * <p>
     * Example1:
     * a = 4,
     * b = 5
     * <p>
     * Метод должен вернуть 5
     * Example2:
     * a = 10,
     * b = 10
     * <p>
     * Метод должен вернуть 10
     */
/*    public int max(int a, int b) {
        return 0;
    }
*/
    /**
     * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
     * <p>
     * Example1:
     * 3
     * 4
     * return 5
     * <p>
     * Example2:
     * 12
     * 16
     * return 20
     */
/*    public double calculateHypotenuse(int a, int b) {
        return 0;
*/

}



