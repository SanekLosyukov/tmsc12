public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String sex;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(int age) {
        this.age = age;
    }

    public User(String firstName, String lastName, int age, String sex) {
        this(firstName, lastName);
        this.age = age;
        this.sex = sex;
    }

    public static void name(String firstName, String lastName) {
        System.out.println("Имя " + firstName + " Фамилия " + lastName);
    }

    public static void age(int age) {
        age = age + 10;   // увеличение введенного возраста на 10 лет
        System.out.println("Увеличенный возраст " + age);
    }

    public static void userInfo(String firstName, String lastName, int age, String sex) {
        System.out.println("Имя " + firstName + " Фамилия " + lastName + " Возраст " + age + " Пол " + sex);
    }

    @Deprecated
    public User(String firstName, String lastName, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }
}

