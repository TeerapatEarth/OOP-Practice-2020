package week7;
import java.awt.*;
import javax.swing.*;
public class CalculatorSample {
    private JFrame fr;
    private JButton bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9,
            bn0, bnc, bnequals, bnplus, bnminus, bnmulti, bndivi;
    private JTextField tf;
    private JPanel p1;
    public CalculatorSample(){
        fr = new JFrame("My Calculator");
        p1 = new JPanel();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf = new JTextField();
        fr.setLayout(new BorderLayout());
        fr.add(tf, BorderLayout.NORTH);
        
        bn1 = new JButton("1");
        bn2 = new JButton("2");
        bn3 = new JButton("3");
        bn4 = new JButton("4");
        bn5 = new JButton("5");
        bn6 = new JButton("6");
        bn7 = new JButton("7");
        bn8 = new JButton("8");
        bn9 = new JButton("9");
        bn0 = new JButton("0");
        bnc = new JButton("c");
        bnequals = new JButton("=");
        bnplus = new JButton("+");
        bnminus = new JButton("-");
        bnmulti = new JButton("*");
        bndivi = new JButton("/");
        p1.setLayout(new GridLayout(4, 4));
        p1.add(bn7);
        p1.add(bn8);
        p1.add(bn9);
        p1.add(bnplus);
        p1.add(bn4);
        p1.add(bn5);
        p1.add(bn6);
        p1.add(bnminus);
        p1.add(bn1);
        p1.add(bn2);
        p1.add(bn3);
        p1.add(bnmulti);
        p1.add(bn0);
        p1.add(bnc);
        p1.add(bnequals);
        p1.add(bndivi);
        fr.add(p1);
        fr.setSize(500, 400);
        fr.setVisible(true);
    }
}
