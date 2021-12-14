package ru.mirea.task26.task;

public class OnlineWallet extends Payment{
    public OnlineWallet() {
        this.payStrategy=new OnlinePayStrategy();
    }
}