package ru.mirea.task2;

public class TestBall {
    public static void main(String[] size) {
        Ball d1 = new Ball("Volleyball", 4);
        Ball d2 = new Ball("Football", 5);
        Ball d3 = new Ball("Basketball");
        d3.setSize(4);
        System.out.println(d1);
        d1.intoBallSize();
        d2.intoBallSize();
        d3.intoBallSize();
    }
}
