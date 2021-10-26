package ru.mirea.task5.opt1;

import ru.mirea.task5.opt1.Dish;

public class Spoon extends Dish {

    public Spoon(String type, String material) {
        super(type, material);
    }

    @Override
    public void doPurpose() {
        System.out.println("Eating smh");
    }
}
