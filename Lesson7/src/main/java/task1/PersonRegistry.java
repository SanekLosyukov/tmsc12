package task1;

public class PersonRegistry {
    private Person[] citizens;

    public PersonRegistry(Person[] citizens) {
        this.citizens = citizens;
    }

    public PersonRegistry() {
    }

    public Person[] findByMinsk(String city) {
        Person[] result = new Person[citizens.length];
        for (int i = 0; i < citizens.length; i++) {
            Person person = citizens[i];
            if (person.getAddress() != null && city != null && city.equals(person.getAddress().getCity())
                    && person.getAge() >= 18 && person.getAge() <= 27) {
                result[i] = person;
            }
        }
        return result;
    }

    public Person[] findByAge() {
        Person[] result = new Person[citizens.length];
        for (int i = 0; i < citizens.length; i++) {
            Person person = citizens[i];
            if (person.getAge() >= 18 && person.getAge() <= 27) {
                result[i] = person;
            }
        }
        return result;
    }

    public Person[] findByAge25to27() {
        Person[] result = new Person[citizens.length];
        for (int i = 0; i < citizens.length; i++) {
            Person person = citizens[i];
            if (person.getAge() >= 25 && person.getAge() <= 27) {
                result[i] = person;
            }
        }
        return result;
    }

    public Person[] findByAlexandr(String name) {
        Person[] result = new Person[citizens.length];
        for (int i = 0; i < citizens.length; i++) {
            Person person = citizens[i];
            if (person.getName() != null && name != null && name.equals(person.getName())) {
                result[i] = person;
            }
        }
        return result;
    }
}

