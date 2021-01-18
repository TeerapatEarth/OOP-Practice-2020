package week12;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;

public class PoringConstructor implements ActionListener {
    private JFrame fr;
    private JButton addbtn;
    private int num;
    public PoringConstructor(){
        fr = new JFrame();
        addbtn = new JButton("Add");
        addbtn.addActionListener(this);
        fr.setLayout(new FlowLayout());
        fr.add(addbtn);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(200, 100);
        fr.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(addbtn)){
            num++;
            Poring p = new Poring(num);
            Thread t = new Thread(p);
            t.start();
        }
    }
}
