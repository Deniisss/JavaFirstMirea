package ru.mirea.task12.opt3;

public class Student {
    int id,ball;

    public Student(int id, int ball) {
        this.id = id;
        this.ball = ball;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", ball=" + ball +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}