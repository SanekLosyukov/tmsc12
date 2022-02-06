public class Main {
    public static void main(String[] args) {
        User.name("Gennadiy", "Sapozhnikov");
        User.age(34);
        User.userInfo("Ivan", "Sidorov", 54, "M");

        User user = new User("Alexandr", "Ivanov");
        User user1 = new User(34);
        User user2 = new User("Elena", "Smirnova", 39, "F");
        User user3 = new User("Valeriy", "Petrov", "M");
    }
}
