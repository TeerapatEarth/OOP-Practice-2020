/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;

import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class MyFrame {
    private JFrame fr;
    private MyClock clock = new MyClock();
    private Thread t =  new Thread(clock);
    public MyFrame(){
        fr = new JFrame();
        t.start();
        fr.setLayout(new FlowLayout());
        fr.add(clock);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400, 120);
        fr.setVisible(true);
    }
}
