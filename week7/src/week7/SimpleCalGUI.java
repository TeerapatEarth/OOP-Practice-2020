package week7;
import java.awt.*;
import javax.swing.*;
public class SimpleCalGUI {
    private JFrame fr;
    private JPanel p1;
    private JTextField tf1, tf2, tf3;
    private JButton b1, b2, b3, b4;
    public SimpleCalGUI(){
        fr = new JFrame("เครื่องคิดเลข");
        p1 = new JPanel();
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        b1 = new JButton("บวก");
        b2 = new JButton("ลบ");
        b3 = new JButton("คูณ");
        b4 = new JButton("หาร");
        
        p1.setLayout(new FlowLayout());
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        
        fr.setLayout(new GridLayout(4, 1));
        fr.add(tf1);
        fr.add(tf2);
        fr.add(p1);
        fr.add(tf3);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400, 200);
        fr.setVisible(true);
    }
}
