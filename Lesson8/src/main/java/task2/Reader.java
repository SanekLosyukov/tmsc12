package task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Reader {
    private String name;
    private long id;
    private String faculty;
    private String birthday;
    private int phone;

    public void takeBook(int numberOfTakeBook) {  //число взятых книг, передаем из Main
        System.out.println(name + " взял " + numberOfTakeBook + " книг");
    }

    public void takeBook(String... books) {   //названия книг
        System.out.println(name + " взял книги: ");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public void takeBook(Book... books) {   //названия книг
        System.out.println(name + " взял книги: ");
        for (Book book : books) {
            System.out.println(book.getBookName() + " автора " + book.getAuthorName());
        }
    }

    public void returnBook(int numberOfReturnBook) {
        System.out.println(name + " вернул " + numberOfReturnBook + " книг");
    }

    public void returnBook(String... books) {
        for (String book : books) {
            System.out.println(book);
        }
    }

    public void returnBook(Book... books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
