package ru.mirea.task6;

public class Person implements Nameable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return "Имя человека: " + name + " , кол-во лет:" + age;
    }
}
