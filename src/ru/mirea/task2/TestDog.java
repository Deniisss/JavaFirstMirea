package ru.mirea.task2;

public class TestDog {
    public static void main(String [] args)
    {
        Dog dog=new Dog("Тобик",2);
        System.out.println(dog);
        dog.setAge(1);
        dog.setName("Фонк");
        System.out.println(dog);
    }
}
