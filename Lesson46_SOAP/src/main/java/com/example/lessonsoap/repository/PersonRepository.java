package com.example.lessonsoap.repository;

import com.example.lessonsoap.model.Person;
import com.example.lessonsoap.model.Sex;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonRepository {
    private static final List<Person> persons = new ArrayList<>();

    @PostConstruct
    public void initData() {
        Person firstPerson = new Person();
        firstPerson.setId(1);
        firstPerson.setName("Vasya");
        firstPerson.setSurname("Petrov");
        firstPerson.setAge(25);
        firstPerson.setSex(Sex.MALE);
        persons.add(firstPerson);

        Person secondPerson = new Person();
        secondPerson.setId(2);
        secondPerson.setName("Gennadiy");
        secondPerson.setSurname("Alekseev");
        secondPerson.setAge(29);
        secondPerson.setSex(Sex.MALE);
        persons.add(secondPerson);

        Person thirdPerson = new Person();
        thirdPerson.setId(3);
        thirdPerson.setName("Anna");
        thirdPerson.setSurname("Ianova");
        thirdPerson.setAge(32);
        thirdPerson.setSex(Sex.FEMALE);
        persons.add(thirdPerson);
    }

    public Person findPerson(int id) {
        Person resultFinding = null;
        for (Person person : persons) {
            if (id == (person.getId())) {
                resultFinding = person;
            }
        }
        return resultFinding;
    }
}