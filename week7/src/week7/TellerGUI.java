package week7;
import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame fr;
    private JLabel label1, label2;
    private JPanel p1, p2;
    private JTextField tf1, tf2;
    private JButton b1, b2, b3;
    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        label1 = new JLabel("   Balance");
        label2 = new JLabel("   Amount");
        tf1 = new JTextField();
        tf2 = new JTextField();
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        b3 = new JButton("Exit");
        b1.setPreferredSize(new Dimension(80, 30));
        b2.setPreferredSize(new Dimension(90, 30));
        b3.setPreferredSize(new Dimension(70, 30));
        
        p1.setLayout(new GridLayout(2, 2));
        p1.add(label1);
        p1.add(tf1);
        p1.add(label2);
        p1.add(tf2);
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
}
