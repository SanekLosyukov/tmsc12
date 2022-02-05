public class User {
    String firstName;
    String lastName;
    int age;
    String sex;

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

    @Deprecated
    public User(String firstName, String lastName, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }
}

