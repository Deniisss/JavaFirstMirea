package ru.mirea.task5.opt2;
public class Sheepdog extends Dog{
    public Sheepdog(String name, int age) {
        super(name, age);
    }

    @Override
    String getType() {
        return "Sheepdog";
    }

}