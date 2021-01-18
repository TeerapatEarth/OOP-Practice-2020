package week13;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TextGUI implements ActionListener {

    private JFrame fr;
    private JPanel panel;
    private JMenuBar mb;
    private JMenu menuFile;
    private JMenuItem menuNew, menuOpen, menuSave, menuClose;
    private JTextArea area;

    public TextGUI() {
        fr = new JFrame("Text Editor");
        panel = new JPanel();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mb = new JMenuBar();
        menuFile = new JMenu("File");
        menuNew = new JMenuItem("New");
        menuOpen = new JMenuItem("Open");
        menuSave = new JMenuItem("Save");
        menuClose = new JMenuItem("Close");
        area = new JTextArea();
        menuFile.add(menuNew);
        menuFile.add(menuOpen);
        menuFile.add(menuSave);
        menuFile.addSeparator();
        menuFile.add(menuClose);

        menuNew.addActionListener(this);
        menuClose.addActionListener(this);
        menuOpen.addActionListener(this);
        menuSave.addActionListener(this);
        fr.add(area);
        fr.setJMenuBar(mb);
        mb.add(menuFile);
        fr.setSize(300, 250);
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(menuNew)) {
            area.setText("");
        } else if (ae.getSource().equals(menuClose)) {
            System.exit(0);
        } else if (ae.getSource().equals(menuOpen)) {
            area.setText("");
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(fr);
            File f = fc.getSelectedFile();
            try (FileInputStream fin = new FileInputStream(f);) {
                int i = fin.read();
                while (i != -1) {
                    String s = ((char) i) + "";
                    area.append(s);
                    i = fin.read();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        } else if (ae.getSource().equals(menuSave)) {
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(fr);
            File f = fc.getSelectedFile();
            try (FileOutputStream fin = new FileOutputStream(f);) {
                for (int i = 0; i < area.getText().length(); i++) {
                    fin.write(area.getText().charAt(i));
                }
            } catch (IOException e) {
                System.out.print(e);
            }
        }
    }

}
