package ru.mirea.task26.task;

public class Payment {
    PayStrategy payStrategy;
    public void pay()
    {
        payStrategy.pay();
    }

}