package ru.mirea.task21.task;
import java.util.ArrayList;
import java.util.List;

public class Test {
    List<Client> clientList= new ArrayList<>();
    List<Worker> workerList=new ArrayList<>();
    void addClient(Client client)
    {
        clientList.add(client);
    }
    void addWorker(Worker worker)
    {
        workerList.add(worker);
    }
    public static void main(String[]args)
    {
        Test testJen=new Test();
        for (int i=0;i<5;i++)
        {
            Client client=new Client("TestName "+i,""+i,""+(int)(Math.random()*50000));
            Worker worker=new Worker("TestWorkerName"+i,""+(int)(Math.random()*10000),i);
            testJen.addClient(client);
            testJen.addWorker(worker);
        }
        System.out.println("Clients:");
        for (int i=0;i<5;i++)
            System.out.println(testJen.clientList.get(i).toString());
        System.out.println("Workers:");
        for (int i=0;i<5;i++)
            System.out.println(testJen.workerList.get(i).toString());

    }
}