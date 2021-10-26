package ru.mirea.task3.opt3;
import java.util.Scanner;
public class TestBook {
    public static void main(String []args) {
        Book book = new Book("Дюна", "Фрэнк Герберт", 735, 1965);
        System.out.println(book.toString());
        book.setName("Преступление и наказание");
        book.setAuthor("Достоевский Ф.М.");
        book.setYear(1866);
        book.setPage(1023);
        System.out.println(book.toString());
    }
}