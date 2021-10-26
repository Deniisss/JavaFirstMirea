package ru.mirea.task5.opt1;

import ru.mirea.task5.opt1.Dish;

public class Pan extends Dish {
    public Pan(String type, String material) {
        super(type, material);
    }

    @Override
    public void doPurpose() {
        System.out.println("Frying smh");
    }
}
