package week8;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CalculatorSample implements ActionListener {

    private JFrame fr;
    private JButton bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9,
            bn0, bnc, bnequals, bnplus, bnminus, bnmulti, bndivi;
    private JTextField tf;
    private JPanel p1;
    private String num = "";
    private double num1, num2, ans;
    private int check = 0;
    private int pl = 0, mi = 0, mu = 0, di = 0;

    public CalculatorSample() {
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

        bn1.addActionListener(this);
        bn2.addActionListener(this);
        bn3.addActionListener(this);
        bn4.addActionListener(this);
        bn5.addActionListener(this);
        bn6.addActionListener(this);
        bn7.addActionListener(this);
        bn8.addActionListener(this);
        bn9.addActionListener(this);
        bn0.addActionListener(this);
        bnc.addActionListener(this);
        bnequals.addActionListener(this);
        bnplus.addActionListener(this);
        bnminus.addActionListener(this);
        bnmulti.addActionListener(this);
        bndivi.addActionListener(this);

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
        fr.setSize(400, 400);
        fr.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(bn1)) {
            num += "1";
            tf.setText(num);
        } else if (ae.getSource().equals(bn2)) {
            num += "2";
            tf.setText(num);
        } else if (ae.getSource().equals(bn3)) {
            num += "3";
            tf.setText(num);
        } else if (ae.getSource().equals(bn4)) {
            num += "4";
            tf.setText(num);
        } else if (ae.getSource().equals(bn5)) {
            num += "5";
            tf.setText(num);
        } else if (ae.getSource().equals(bn6)) {
            num += "6";
            tf.setText(num);
        } else if (ae.getSource().equals(bn7)) {
            num += "7";
            tf.setText(num);
        } else if (ae.getSource().equals(bn8)) {
            num += "8";
            tf.setText(num);
        } else if (ae.getSource().equals(bn9)) {
            num += "9";
            tf.setText(num);
        } else if (ae.getSource().equals(bn0)) {
            num += "0";
            tf.setText(num);
        } else if (ae.getSource().equals(bnc)) {
            tf.setText("");
            num = "";
            num1 = 0;
            num2 = 0;
            pl = 0;
            mi = 0;
            mu = 0;
            di = 0;
        } else if (ae.getSource().equals(bnequals)) {
            if (pl == 1) {
                ans = num1 + Double.parseDouble(num);
                String result = String.valueOf(ans);
                tf.setText(result);
                pl--;
                num = result;
                check--;
            }
            if (mi == 1) {
                ans = num1 - Double.parseDouble(num);
                String result = String.valueOf(ans);
                tf.setText(result);
                mi--;
                num = result;
                check--;
            }
            if (mu == 1) {
                ans = num1 * Double.parseDouble(num);
                String result = String.valueOf(ans);
                tf.setText(result);
                mu--;
                num = result;
                check--;
            }
            if (di == 1) {
                ans = num1 / Double.parseDouble(num);
                String result = String.valueOf(ans);
                tf.setText(result);
                di--;
                num = result;
                check--;
            }
        } else if (ae.getSource().equals(bnplus)) {
            tf.setText("");
            pl = 1;
            mi = 0;
            mu = 0;
            di = 0;
            if (check == 0) {
                num1 = Double.parseDouble(num);
                num = "";
                check++;
            } else {
                num2 = Double.parseDouble(num);
                num = "";
                num1 = num1 + num2;
            }
        } else if (ae.getSource().equals(bnminus)) {
            if (num.equals("")) {
                num = "-";
                tf.setText(num);
            } else {
                tf.setText("");
                pl = 0;
                mi = 1;
                mu = 0;
                di = 0;
                if (check == 0) {
                    num1 = Double.parseDouble(num);
                    num = "";
                    check++;
                } else {
                    num2 = Double.parseDouble(num);
                    num = "";
                    num1 = num1 - num2;
                }
            }
        } else if (ae.getSource().equals(bnmulti)) {
            tf.setText("");
            pl = 0;
            mi = 0;
            mu = 1;
            di = 0;
            if (check == 0) {
                num1 = Double.parseDouble(num);
                num = "";
                check++;
            } else {
                num2 = Double.parseDouble(num);
                num = "";
                num1 = num1 * num2;
            }
        } else if (ae.getSource().equals(bndivi)) {
            tf.setText("");
            pl = 0;
            mi = 0;
            mu = 0;
            di = 1;
            if (check == 0) {
                num1 = Double.parseDouble(num);
                num = "";
                check++;
            } else {
                num2 = Double.parseDouble(num);
                num = "";
                num1 = num1 / num2;
            }
        }
    }
}
