package p2;

public class Authorization {

    public static boolean checkAuthorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() <= 20 && password.length() <= 20 && password.equals(confirmPassword)) {
            System.out.println("Логин и пароль успешно введены. Проверка пароля прошла успешно");
            return true;
        } else if (login.length() > 20 || password.length() > 20) {
            throw new WrongLoginException("не верный логин");
        } else {
            throw new WrongPasswordException("пароли не совпадают");
        }
    }
}

