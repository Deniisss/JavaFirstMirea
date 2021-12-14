package ru.mirea.task26.task;

public class CreditCard extends Payment{
    public CreditCard() {
        this.payStrategy=new CreditPayStrategy();
    }
}