package week11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.*;

public class StudentView extends Student implements ActionListener, WindowListener {

    private JFrame fr;
    private JPanel p1, p2;
    private JLabel l1, l2, l3;
    private JTextField tf1, tf2, tf3;
    private JButton bn1, bn2;

    public StudentView() {
        fr = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        l1 = new JLabel("ID :");
        l2 = new JLabel("Name :");
        l3 = new JLabel("Money :");
        tf3 = new JTextField("0");
        tf1 = new JTextField();
        tf2 = new JTextField();
        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf3.setEditable(false);

        bn1.addActionListener(this);
        bn2.addActionListener(this);
        fr.addWindowListener(this);
        p1.setLayout(new GridLayout(3, 2));
        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);
        p1.add(l3);
        p1.add(tf3);

        p2.setLayout(new FlowLayout());
        p2.add(bn1);
        p2.add(bn2);

        fr.setLayout(new GridLayout(2, 1));
        fr.add(p1);
        fr.add(p2);
        fr.setSize(300, 200);
        fr.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(bn1)) {
            String s = String.valueOf(getMoney() + 100);
            setMoney(getMoney() + 100);
            tf3.setText(s);
        } else {
            if(getMoney()-100 > 0){
                String s = String.valueOf(getMoney() - 100);
                setMoney(getMoney() - 100);
                tf3.setText(s);
            }
            else{
                String s = String.valueOf(0);
                setMoney(0);
                tf3.setText(s);
            }
        }
    }

    public void windowClosed(WindowEvent e) {

    }

    public void windowIconified(WindowEvent e) {

    }

    public void windowDeiconified(WindowEvent e) {

    }

    public void windowActivated(WindowEvent e) {

    }

    public void windowDeactivated(WindowEvent e) {

    }

    public void windowOpened(WindowEvent we){
        Student s = null;
        try {
            FileInputStream fin = new FileInputStream("StudentM.dat");
            ObjectInputStream in = new ObjectInputStream(fin);
            s = (Student) in.readObject();
            tf1.setText(String.valueOf(s.getID()));
            tf2.setText(s.getName());
            tf3.setText(String.valueOf(s.getMoney()));
            setMoney(s.getMoney());
            in.close();
            fin.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException c){
            c.printStackTrace();
        }
    }

    public void windowClosing(WindowEvent we) {
        int idNum = Integer.parseInt(tf1.getText());
        String name = tf2.getText();
        int money = Integer.parseInt(tf3.getText());
        Student s = new Student();
        s.setID(idNum);
        s.setName(name);
        s.setMoney(money);
        try (FileOutputStream fOut = new FileOutputStream("StudentM.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fOut);){
            oout.writeObject(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StudentView b = new StudentView();
    }
}
