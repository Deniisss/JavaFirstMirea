package ru.mirea.task2;

public class TestShape {
    public static void main(String []args)
    {
        Shape sh1=new Shape("Квадрат");
        System.out.println(sh1.toString());
        sh1.setShapeName("Круг");
        System.out.println(sh1.toString());
        sh1.setShapeName("Треугольник");
        System.out.println(sh1.toString());
    }
}
