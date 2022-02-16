package task2;

public class Main {
    public static void main(String[] args) {

        Reader petrov = new Reader("Petrov", 524, "архитектурный факультет", "9 may 1995", 411227);
        Reader ivanov = new Reader("Ivanov", 511, "архитектурный факультет", "11 february 1992", 412221);
        Reader sidorov = new Reader("Sidorov", 555, "архитектурный факультет", "21 yanuary 1990", 455781);
        Reader[] readers = {petrov, ivanov, sidorov};

        Book book1 = new Book("Приключения", "Тургенев");
        Book book2 = new Book("Словарь", "Ожегов");
        Book book3 = new Book("Энциклопедия", "<Академия Наук>");
        Book[] books = {book1, book2, book3};

        petrov.takeBook(3);
        System.out.println();
        ivanov.takeBook("Донцова", "Есенин", "Пушкин");
        System.out.println();
        sidorov.takeBook(book1, book2, book3);
        System.out.println();

        petrov.returnBook(1);
        System.out.println();
        ivanov.returnBook("Донцова");
        System.out.println();
        sidorov.takeBook(book1);
        System.out.println();
    }
}
