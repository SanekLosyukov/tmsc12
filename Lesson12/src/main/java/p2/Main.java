package p2;

import static p2.Authorization.checkAuthorization;

public class Main {
    public static void main(String[] args) {
        try {
            checkAuthorization("Dima", "qwerty", "qwerty");
        } catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
