package week7;
import java.awt.*;
import javax.swing.*;
public class MnGUI {
    private JFrame fr;
    private JDesktopPane dp;
    private JInternalFrame f1, f2, f3;
    private JMenuBar mb;
    private JMenu m1, m2, m3, ms1;
    private JMenuItem mi2, mi3, mi4, msi1, msi2;
    public MnGUI(){
        
        fr = new JFrame("SubMenuItem Demo");
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        dp = new JDesktopPane();
        f1 = new JInternalFrame("Applicatio 01", true, true, true,true);
        f2 = new JInternalFrame("Applicatio 02", true, true, true,true);
        f3 = new JInternalFrame("Applicatio 03", true, true, true,true);
        
        fr.setJMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        
        ms1 = new JMenu("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");
        m1.add(ms1);
        m1.addSeparator();
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);
        ms1.setPreferredSize(new Dimension(100, 20));
        
        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");
        ms1.add(msi1);
        ms1.addSeparator();
        ms1.add(msi2);
        msi1.setPreferredSize(new Dimension(100, 20));
        
        f1.getContentPane();
        f1.setSize(350, 200);
        f1.setVisible(true);
        f1.setLocation(70, 350);
        
        f2.getContentPane();
        f2.setSize(250, 250);
        f2.setVisible(true);
        f2.setLocation(300, 60);
        
        f3.getContentPane();
        f3.setSize(350, 350);
        f3.setVisible(true);
        f3.setLocation(700, 270);
        
        dp.add(f1);
        dp.add(f2);
        dp.add(f3);
        fr.add(dp);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1300, 800);
        fr.setVisible(true);
    }
}
