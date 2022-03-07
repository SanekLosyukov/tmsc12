public class HW {
    /**
     * Домашка.1
     * 1) Можно добработать свой авто из предыдущей домашки, а можно заново сделать.
     * Создать собственное исключение.
     * - Создать класс Car c полями (марка, скорость, цена), конструкторы (с параметрами
     * и default) гетеры-сетеры.
     * Создать метод старт в котором пытаетесь завести автомобиль. В методе старт
     * генерируете случайное число от 0 до 20, если полученное число оказалось четным,
     * то выбрасываете созданное ранее вами исключение и передаете его к месту откуда
     * вызывали метод старт. Если все хорошо и исключение не вылетело,
     * то выводить в консоль сообщение что автомобиль с такой-то маркой завелся.
     * В main создаете парочку автомобилей и пытаетесь их завести. И обрабатываете
     * исключение которое может вылететь при старте автомобиля
     */
    /**  * Домашка.2
     * Создать статический метод "checkAuthorization" который будет вызваться из
     * метода main и принимает на вход три параметра: login, password и
     * confirmPassword. Поле login должен содержать:
     * - Tолько латинские буквы, цифры и знак подчеркивания.
     * - Длина login должна быть меньше 20 символов.
     * (Если не знаете как проверить первое условие, то проверяем только 2 условие
     * - вызваем метод lenght())
     * Если login не соответствует этим требованиям, необходимо выбросить
     * WrongLoginException.
     * Password должен содержать:
     * - Только латинские буквы, цифры и знак подчеркивания.
     * -  Длина password должна быть меньше 20 символов.
     * (Если не знаете как проверить первое условие, то проверяем только 2 условие
     * - вызваем метод lenght())
     * Также password и confirmPassword должны быть равны. Если password не
     * соответствует этим требованиям, необходимо выбросить WrongPasswordException.
     * WrongPasswordException и WrongLoginException - пользовательские классы
     * исключения с двумя конструкторами – один по умолчанию,
     * второй принимает сообщение исключения и передает его в конструктор класса Exception.
     * Обработка исключений проводится внутри метода "checkAuthorization".
     * Используем multi-catch block. Метод "checkAuthorization" возвращает true,
     * если значения верны или false в другом случае.
     * В методе main вызваем метод checkAuthorization и печатаем на консоль
     * результат выполнения метода.
     *
     * PS: если не знаем как сделать проверку, то можно просто оставить пустую
     * реализацию! Прорабатываем работу с исключениями
     */

}
