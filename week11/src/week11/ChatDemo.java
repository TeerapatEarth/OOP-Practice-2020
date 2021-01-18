package week11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;

public class ChatDemo implements ActionListener, WindowListener{

    private JFrame fr;
    private JTextArea text;
    private JTextField tf;
    private JButton bn1, bn2;
    private JPanel p1, p2, p3, p4;

    public ChatDemo() {
        fr = new JFrame("Chat Demo");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        text = new JTextArea();
        text.setEditable(false);
        tf = new JTextField();
        bn1 = new JButton("Submit");
        bn2 = new JButton("Reset");

        bn1.addActionListener(this);
        bn2.addActionListener(this);
        fr.addWindowListener(this);

        p1.setLayout(new BorderLayout());
        p1.add(text);

        p2.setLayout(new BorderLayout());
        p2.add(tf);

        p3.setLayout(new FlowLayout());
        p3.add(bn1);
        p3.add(bn2);

        p4.setLayout(new GridLayout(2, 1));
        p4.add(p2);
        p4.add(p3);

        fr.setLayout(new BorderLayout());
        fr.add(p1);
        fr.add(p4, BorderLayout.SOUTH);
        fr.setSize(500, 300);
        fr.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(bn1)) {
            String s = tf.getText();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            text.append(dtf.format(LocalDateTime.now()) + " : " + s + "\n");
            tf.setText("");
        } else {
            text.setText("");
            tf.setText("");
        }
    }
    public void windowClosed(WindowEvent e) {
        
    }
    public void windowIconified(WindowEvent e) {
        
    }
    public void windowDeiconified(WindowEvent e) {
        
    }
    public void windowActivated(WindowEvent e) {
        
    }
    public void windowDeactivated(WindowEvent e) {
        
    }
    public void windowOpened(WindowEvent we) {
        try (FileInputStream fin = new FileInputStream("data.dat");){
            int i = fin.read();
            while (i != -1){
                String s = ((char)i)+"";
                text.append(s);
                i = fin.read();
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    public void windowClosing(WindowEvent we) {
        try (FileOutputStream fin = new FileOutputStream("data.dat");){
            for (int i = 0; i < text.getText().length(); i++){
                fin.write(text.getText().charAt(i));
            }
        }
        catch(IOException e){
            System.out.print(e);
        }
    }
    
    public static void main(String[] args) {
        ChatDemo b = new ChatDemo();
    }
}
