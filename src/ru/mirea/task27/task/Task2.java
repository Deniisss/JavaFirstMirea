package ru.mirea.task27.task;

import java.util.ArrayList;
import java.util.HashMap;

public class Task2 {
    public static void main(String[]args)
    {
        HashMap<String, ArrayList<String>> countries=new HashMap<>();
        HashMap<String,String>cities=new HashMap<>();
        City moscow = new City("Moscow","Russia");
        City st = new City("St. Petersburg","Russia");
        City krasnodar = new City("Krasnodar","Russia");
        City london=new City("London","UK");
        City liverpool=new City("Liverpool","UK");
        City manchester=new City("Manchester","UK");
        City barca=new City("Barcelona","Ukraine");
        City madrid=new City("Madrid","Ukraine");
        City valens=new City("Valensia","Ukraine");
        countries.put("Russia",new ArrayList<>());
        countries.get("Russia").add(moscow.getCity());
        countries.get("Russia").add(st.getCity());
        countries.get("Russia").add(krasnodar.getCity());
        countries.put("UK",new ArrayList<>());
        countries.get("UK").add(london.getCity());
        countries.get("UK").add(liverpool.getCity());
        countries.get("UK").add(manchester.getCity());
        countries.put("Ukraine",new ArrayList<>());
        countries.get("Ukraine").add(madrid.getCity());
        countries.get("Ukraine").add(barca.getCity());
        countries.get("Ukraine").add(valens.getCity());
        System.out.println(countries);
    }
}