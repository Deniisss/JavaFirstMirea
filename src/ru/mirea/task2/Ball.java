package ru.mirea.task2;

public class Ball {
    private String type;
    private int size;

    public Ball(String n, int a){
        type = n;
        size = a;
    }
    public Ball(String n){
        type = n;
        size = 0;
    }
    public Ball(){
        type = "Football";
        size = 5;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(String type){
        return type;
    }
    public int getSize(){
        return size;
    }
    public String toString(){
        return this.type+", size "+this.size;
    }
    public void intoBallSize(){
        System.out.println(type+"'s ball size is "+size);
    }

}
