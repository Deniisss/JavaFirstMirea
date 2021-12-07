package ru.mirea.task22.task;


import java.util.ArrayList;

enum UserType
{
    Client,
    Worker,
    Director
}
public class UserManage {
    public User createUser(UserType type)
    {
        User user=null;
        switch (type)
        {
            case Client -> user=new Client();
            case Worker -> user=new Worker();
            case Director -> user=new Director();
        }
        return user;
    }
    public static void main(String[]args)
    {
        ArrayList<User> list= new ArrayList<>();
        UserManage userManage=new UserManage();
        list.add(userManage.createUser(UserType.Client));
        list.add(userManage.createUser(UserType.Client));
        list.add(userManage.createUser(UserType.Director));
        list.add(userManage.createUser(UserType.Worker));
        list.add(userManage.createUser(UserType.Worker));
        for (User user : list) {
            System.out.println(user.getType());
        }
    }
}
