package ru.mirea.task25.task;

public class Task {
    public static void main(String[]args)
    {
        int total;
        System.out.println("В банке можно взять кредит по 13% годовых. Однако он может быть понижен, если будет выполнено одно из следующих условий");
        System.out.println("Вы обладатель VIP статуса - на 6%");
        System.out.println("Вы планируете взять кредит на долгий срок - на 2,7%");
        System.out.println("Вы планируете взят в кредит большую сумму - на 2%");
        Percent credit=new Credit();
        Percent vipStatus=new Vip(credit);
        Percent longPeriod=new LongPeriod(vipStatus);
        Percent bigSumm=new Sum(longPeriod);
        total=bigSumm.getPercent();
        System.out.println("В таком случае минимально возможный процент, который доступен равен:");
        System.out.println(total+"%");
    }
}