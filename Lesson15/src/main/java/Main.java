public class Main {
    public static void main(String[] args) throws Exception {
        GenericClass<String, Animal, Integer> string = new GenericClass<>("String", new Animal(), new Integer(1));
        string.getNameClasses();

        Calculator calculator = new Calculator();
        calculator.sum(15, 16);
        calculator.divide(10, 12);
        calculator.multiply(54, 54);
        calculator.subtraction(58, 34);

        Integer[] numbersInteger = {112, 25, 65, 2, 23};
        MinMax<Integer> integerMinMax = new MinMax<>(numbersInteger);
        System.out.println("Максимальный элемент " + integerMinMax.getMax());
        System.out.println("Минимальный элемент " + integerMinMax.getMin());

        integerMinMax.getInfo();
    }
}

