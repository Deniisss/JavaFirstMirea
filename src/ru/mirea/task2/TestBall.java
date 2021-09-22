package ru.mirea.task2;

public class TestBall {
    public static void main(String [] args)
    {
        Ball ball=new Ball("Футбольный","Белый","Стандартный");
        System.out.println(ball);
        ball.setType("Баскетбольный");
        ball.setColor("Красный");
        ball.setSize("Маленький");
        System.out.println(ball);
    }
}
