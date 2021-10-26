package ru.mirea.task8.opt2;
import javax.swing.*;

public class Task extends JFrame {
    Task() {
        super("Task");
        setSize(500,500);
        JLabel jLabel = new JLabel();
        ////C:\Users\krivo\OneDrive\Рабочий стол\zxc-cat.gif;
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Msi-1\\OneDrive\\Рабочий стол\\1323123.png");
        jLabel.setIcon(imageIcon);
        add(jLabel);
        setVisible(true);
    }
    public static void main(String []args)
    {
        new Task();
    }

}