package p2;

import java.util.Arrays;

import static org.apache.commons.lang3.StringUtils.isEmpty;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

public class Authorization {

    public static boolean checkAuthorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        byte[] bytesPassword = password.getBytes(); // введенный с консоли пассворд передаю в массив байтов
        byte[] bytesconfirmPassword = confirmPassword.getBytes(); // введенное с консоли подтверждение пассворд передаю в массив байтов
        if (login.length() <= 20 && bytesPassword.length <= 20
                && Arrays.equals(bytesPassword, bytesconfirmPassword)
                && isNotEmpty(password) && isNotEmpty(confirmPassword)) {
            System.out.println("Логин и пароль успешно введены. Проверка пароля прошла успешно");
            return true;
        } else if (!(login.length() <= 20) || !(bytesPassword.length <= 20) || isEmpty(password) || isEmpty(confirmPassword)) {
            throw new WrongLoginException("не верный логин");
        } else {
            throw new WrongPasswordException("пароли не совпадают");
        }
    }
}

