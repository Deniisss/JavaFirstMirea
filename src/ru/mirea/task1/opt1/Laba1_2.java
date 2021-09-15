package ru.mirea.task1.opt1;

import java.util.Scanner;

public class Laba1_2 {
    public static void main(String[] args) {
        int Sum = 0;
        Scanner s = new Scanner(System.in);
        int[]a= new int[10];
        System.out.println("Введите элементы массива");
        for(int i = 0; i < 10; i++)
        {
            a[i]=s.nextInt();
            Sum=Sum+a[i];
        }
        System.out.println("Сумма ="+Sum);
    }
}
