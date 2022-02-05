public class PersonRegistry {
    private Person[] citizens;


    public PersonRegistry(Person[] citizens) {
        this.citizens = citizens;
    }

    public PersonRegistry() {
    }

    public Person[] findByAddress(String city) {
        Person[] result = new Person[citizens.length];
        for (int i = 0; i < citizens.length; i++) {
            Person person = citizens[i];
            if (person.getAddress() != null && city != null && city.equals(person.getAddress().getCity())) {
                // или без проверки на налл if (person.getAddress().getCity().equals(city)) {
                result[i] = person;
            }

        }
        return result;
    }


}

