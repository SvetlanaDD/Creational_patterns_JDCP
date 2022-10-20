package ru.netology.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonBuilderTest {

    @Test
    void build() {
        Person person = new Person("Анна", "Вольф", 31, "Сидней");
        Person buildPerson = new PersonBuilder()
                .setName("Анна")
                .setLastname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Assertions.assertEquals(person.toString(), buildPerson.toString());
    }
}