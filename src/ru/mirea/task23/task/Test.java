package ru.mirea.task23.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    List<Client> clientList= new ArrayList<>();
    public boolean checkEnter(String login,String password)
    {
        for (int i=0;i<5;i++)
        {
            if(login.hashCode()==clientList.get(i).getLogin().hashCode()&&
                    password.hashCode()==clientList.get(i).getPassword().hashCode())
                return true;
        }
        return false;
    }
    public static void main(String[]args)
    {
        Test chelTest=new Test();
        chelTest.clientList.add(new Client("Superior","192321"));
        chelTest.clientList.add(new Client("DenEro","Пароль228"));
        chelTest.clientList.add(new Client("Zavet","Замок11"));
        chelTest.clientList.add(new Client("GucciMane","123321"));
        chelTest.clientList.add(new Client("Платина","300"));
        System.out.println("Clients:");
        for (int i=0;i<5;i++)
            System.out.println(chelTest.clientList.get(i).toString());
        Scanner sc=new Scanner(System.in);
        String login,password;
        System.out.println("Введите логин и пароль");
        login=sc.next();
        password=sc.next();
        while(!chelTest.checkEnter(login,password))
        {
            System.out.println("Ошибка, вы ввели неправильный логин или пароль");
            login=sc.next();
            password=sc.next();
        }
        System.out.println("Вы успешно вошли в свой акааунт");
    }
}