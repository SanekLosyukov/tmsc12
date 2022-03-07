package p2;

import java.util.Scanner;

import static p2.Authorization.checkAuthorization;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите логин ");
            String login = scanner.next();
            System.out.println("Введите пароль ");
            String password = scanner.next();
            System.out.println("Подтвердите пароль ");
            String confirmPassword = scanner.next();

            checkAuthorization(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
