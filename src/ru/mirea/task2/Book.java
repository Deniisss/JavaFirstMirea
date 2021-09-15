package ru.mirea.task2;

public class Book {
    String name,author;
    int page,rate;

    public Book(String name, String genre, int page) {
        this.name = name;
        this.author = genre;
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getRate() {
        return rate;
    }
    public String toString()
    {
        return "Книга: "+getName()+" автора "+getAuthor()+", с рейтингом "+getRate();
    }

}
