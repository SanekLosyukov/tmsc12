public class Task2 {

    public class HomeWork {
        public void main(String[] args) {
            //вывод на консоль
            printLiterals();
            //Некоторые тесты для проверки задач.
            System.out.println(sum(100, 200));
            System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
            System.out.println(max(56, 349));
            System.out.println(calculateHypotenuse(3, 4));
        }

        private void printLiterals() {

            boolean bool = true;    //        логический
            String a = "String";    //        строковый
            char b = 'b';           //        символьный
            int c = 0b1101;         //        целочисленный 2-й
            int d = 010;            //        целочисленный 8-й
            int e = 514;            //        целочисленный 10-й
            int f = 0x6F;            //        целочисленный 16-й
            float g = 1.2f;         //        литерал типа float
            double h = 1.2;         //        литерал типа double

        }

        /**
         * 1. Метод должен вернуть сумму двух чисел a и b
         * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
         **/
        public int sum(int a, int b) {
            return 0;
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
        public int max(int a, int b) {
            return 0;
        }

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
        public double calculateHypotenuse(int a, int b) {
            return 0;
        }
    }
}
