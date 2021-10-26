package ru.mirea.task5.opt2;
public class Task {
    public static void main(String []args)
    {
        Dog dog=new SibaInu("Тобик",2);
        System.out.println(dog.toString());
        dog=new Sheepdog("Рекс",7);
        System.out.println(dog.toString());
        dog=new Bulldog("Стич",5);
        System.out.println(dog.toString());
        dog=new JackRussel("Чоп",1);
        System.out.println(dog.toString());

    }
}