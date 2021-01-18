package pre;

import java.awt.*;
import java.net.URL;
import javax.swing.*;


import java.awt.*;
import java.awt.event.*;

public class Pre implements ActionListener{

    private JFrame fr;
    private JButton bn1, bn2, bn3;

    public Pre() {
        fr = new JFrame("ShowAttribute");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bn1 = new JButton("OK");
        bn2 = new JButton("กดปุ่ม");
        bn3 = new JButton("Help");
        fr.setLayout(new FlowLayout());
        fr.add(bn1);
        fr.add(bn2);
        fr.add(bn3);
        bn2.setFont(new Font("TimesRoman", Font.BOLD, 16));
        fr.getContentPane().setBackground(Color.blue);
        bn2.setForeground(Color.red);
        fr.setSize(200, 150);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {
            Pre frame = new Pre();
        });
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
