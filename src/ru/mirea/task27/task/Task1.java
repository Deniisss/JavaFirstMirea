package ru.mirea.task27.task;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[]args)
    {
        HashMap<String,String> people=new HashMap<>();
        people.put("Быба","Даниил");
        people.put("Федотов","Владислав");
        people.put("Савин","Максим");
        people.put("Новиков","Дима");
        people.put("Иванов","Вова");
        people.put("Путилин","Саша");
        people.put("Ступин","Петя");
        people.put("Городов","Антон");
        people.put("Артебулецкий","Иван");
        people.put("Лунев","Данила");
        System.out.println(people);

        HashMap<String,Integer> count=new HashMap<>();
        for(Map.Entry<String,String>entry: people.entrySet())
            if(count.containsKey(entry.getValue()))
                count.put(entry.getValue(),count.get(entry.getValue())+1);
            else
                count.put(entry.getValue(),1);

        for(Map.Entry<String,String> entry: new HashMap<>(people).entrySet())
            if(count.get(entry.getValue())>1)
                people.remove(entry.getKey());

        System.out.println(people);
    }
}