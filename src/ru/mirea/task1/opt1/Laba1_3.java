package ru.mirea.task1.opt1;

import java.util.Scanner;

public class Laba1_3 {
    public static void main(String[] args) {
        int Sum = 0;
        Scanner s = new Scanner(System.in);
        int[]a= new int[10];
        int i=0;
        System.out.println("Введите элементы массива");
        do
        {
            a[i]=s.nextInt();
            Sum=Sum+a[i];
            i++;
        }while(i<10);
        System.out.println("Сумма ="+Sum);

    }
}
