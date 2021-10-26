package ru.mirea.task5.opt1;

import ru.mirea.task5.opt1.Dish;

public class Plate extends Dish {
    public Plate(String type, String material) {
        super(type, material);
    }

    @Override
    public void doPurpose() {
        System.out.print("Put smh");
    }
}
