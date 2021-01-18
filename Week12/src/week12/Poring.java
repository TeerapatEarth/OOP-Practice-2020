package week12;

import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.*;
;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;



public class Poring implements MouseListener, Runnable {

    private JFrame fr;
    private JLabel pic;
    private int nump;
    private boolean check = true;

    public Poring(int num) {
        nump = num;
    }

    public void run() {
        fr = new JFrame();
        pic = new JLabel();
        URL imageURL = Poring.class.getResource("p.png");
        pic.setIcon(new ImageIcon(imageURL));
        pic.setText(Integer.toString(nump));
        fr.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
               fr.dispose(); check = false;
            }
        });
        fr.setLayout(new FlowLayout());
        fr.add(pic);
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        fr.setSize(150, 150);
        int x = (int) ((Math.random() * (1000 - 0)) + 0);
        int y = (int) ((Math.random() * (700 - 0)) + 0);
        while (true) {
            try {
                fr.setLocation(x, y);
                Thread.sleep(200);
                fr.setLocation(x + 2, y + 2);
                Thread.sleep(200);
                fr.setLocation(x - 4, y - 4);
                Thread.sleep(200);
                fr.setLocation(x + 2, y + 2);
                Thread.sleep(200);
                if(check){
                    fr.setVisible(true);
                }
                else{
                    fr.dispose();
                }
            }
            catch(InterruptedException e){
                
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
