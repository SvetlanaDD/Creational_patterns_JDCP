package ru.netology.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void newChildBuilder() {
        Person mom = new Person("Анна", "Вольф", 31, "Сидней");
        Person buildSon = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        Person son = new Person("Антошка", "Вольф", -1, "Сидней");
        Assertions.assertEquals(son.toString(), buildSon.toString());
    }
}