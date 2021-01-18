import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class Bookadd {

//    private ArrayList list= new ArrayList();
    private Bookview bookView;
//    private String line;
    private JFrame fr;
    private JPanel p1,p2, p3;
    private JLabel l1,l2,l3;
    private JTextField tf1,tf2;
    private JComboBox cb;
    private JButton btn1;

    public Bookadd(){

        fr = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        l1 = new JLabel("Name");
        l2 = new JLabel("Price");
        l3 = new JLabel("Type");
        tf1 = new JTextField();
        tf2 = new JTextField();
        cb = new JComboBox();
        btn1 = new JButton("Insert");

        cb.addItem("General");
        cb.addItem("Computer");
        cb.addItem("Math&Sci");
        cb.addItem("Photo");

        p1.setLayout(new BorderLayout());
        p2.setLayout(new GridLayout(3,2));
        p3.setLayout(new FlowLayout());

        p2.add(l1);
        p2.add(tf1);
        p2.add(l2);
        p2.add(tf2);
        p2.add(l3);
        p2.add(cb);

        p3.add(btn1);

        p1.add(p2, BorderLayout.NORTH);
        p1.add(p3, BorderLayout.CENTER);




        fr.add(p1);


        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);





    }

    public JButton getBtn1() {
        return btn1;
    }
    

    public JFrame getFr() {
        return fr;
    }

    public JTextField getTf1() {
        return tf1;
    }

    public JTextField getTf2() {
        return tf2;
    }

    public JComboBox getCb() {
        return cb;
    }
}
