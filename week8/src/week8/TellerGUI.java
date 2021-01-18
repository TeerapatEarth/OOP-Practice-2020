package week8;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TellerGUI implements ActionListener{
    private JFrame fr;
    private JLabel label1, label2, label3;
    private JPanel p1, p2;
    private JTextField tf;
    private JButton b1, b2, b3;
    public TellerGUI(){
        CheckingAccount acc = new CheckingAccount();
        fr = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        label1 = new JLabel("   Balance");
        label2 = new JLabel("   Amount");
        label3 = new JLabel(String.valueOf(acc.getBalance()));
        tf = new JTextField();
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        b3 = new JButton("Exit");
        b1.setPreferredSize(new Dimension(80, 30));
        b2.setPreferredSize(new Dimension(90, 30));
        b3.setPreferredSize(new Dimension(70, 30));
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        p1.setLayout(new GridLayout(2, 2));
        p1.add(label1);
        p1.add(label3);
        p1.add(label2);
        p1.add(tf);
        p1.setPreferredSize(new Dimension(100,80));
        
        p2.setLayout(new FlowLayout());
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        
        fr.setLayout(new BorderLayout());
        fr.add(p1, BorderLayout.NORTH);
        fr.add(p2);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 200);
        fr.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae, CheckingAccount acc){
        if (ae.getSource().equals(b1)){
            double num = Double.parseDouble(tf.getText());
            acc.deposit(num);
            label3.setText(String.valueOf(acc.getBalance()));
            tf.setText("");
        }
        else if(ae.getSource().equals(b2)){
            double num = Double.parseDouble(tf.getText());
            getAcct().withdraw(num);
            label3.setText(String.valueOf(acc.getBalance()));
            tf.setText("");
        }
    }
}
