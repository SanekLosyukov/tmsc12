public class Task2 {
    public static void main(String[] args) {

        printLiterals();
        System.out.println(sum(100, 200));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(56, 349));
        System.out.println(calculateHypotenuse(3, 4));

    }

    private static void printLiterals() {

        boolean a = true;       //        логический
        String b = "String";    //        строковый
        char c = 'b';           //        символьный
        int d = 0b1101;         //        целочисленный 2-й
        int e = 010;            //        целочисленный 8-й
        int f = 514;            //        целочисленный 10-й
        int g = 0x6F;           //        целочисленный 16-й
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

    public static int sum(int a, int b) {

        long c = (long) a + b;
        if (c > Integer.MAX_VALUE) {
            return -1;
        } else {
            return a + b;
        }

    }

    public static int max(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }

    }

    public static double calculateHypotenuse(int a, int b) {

        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

    }

}



