package ru.mirea.task2;

public class TestBook {
    public static void main(String [] args)
    {
        Book bk=new Book("Война и мир","Толстой",8);
        System.out.println(bk);
        bk.setAuthor("Пушкин");
        bk.setName("Мёртвые души");
        bk.setRate(7);
        System.out.println(bk);
    }
}