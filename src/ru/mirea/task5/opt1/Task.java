package ru.mirea.task5.opt1;

import ru.mirea.task5.opt1.Pan;
import ru.mirea.task5.opt1.Plate;
import ru.mirea.task5.opt1.Spoon;

public class Task {
    public static void main(String[] args)
    {
        Pan pan=new Pan("Кухонная","Чугун");
        pan.doPurpose();
        Spoon spoon=new Spoon("Столовая","Серебро");
        spoon.doPurpose();
        Plate plate=new Plate("Столовая","Керамика");
        plate.doPurpose();
    }
}
