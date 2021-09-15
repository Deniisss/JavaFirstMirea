package ru.mirea.task6;

public class Task {
    public static void main(String [] args)
    {
        Nameable nameable=new Book("Война и мир","Толстой");
        System.out.println(nameable.getName());
        nameable=new Person("Федя",11);
        System.out.println(nameable.getName());
        nameable=new Animal("Вуди","Дятел");
        System.out.println(nameable.getName());
    }
}
