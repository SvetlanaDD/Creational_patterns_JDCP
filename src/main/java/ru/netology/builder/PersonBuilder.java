package ru.netology.builder;

public class PersonBuilder {
    private String name;
    private String lastname;
    private int age;
    private String city;

    public PersonBuilder() {
        this.name = null;
        this.lastname = null;
        this.age = -1;
        this.city = null;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Введен недопустимый возраст");
        } else {
            this.age = age;
            return this;
        }
    }

    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if ((name == null) || (lastname == null)) {
            throw new IllegalStateException("Не хватает обязательных полей");
        } else {
            return new Person(name, lastname, age, city);
        }
    }

}
