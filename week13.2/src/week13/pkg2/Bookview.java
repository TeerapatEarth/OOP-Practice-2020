
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.util.ArrayList;

public class Bookview implements ActionListener, WindowListener {

    private int view = 0;
    private Bookadd book;
    private int max;
    private JFrame fr;
    private JLabel l1, l2, l3;
    private JPanel p1, p2, p3, p4;
    private JTextField tf1, tf2, tf3;
    private JComboBox cb;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private ArrayList<Book> list2 = new ArrayList<Book>();

    public Bookview() {
        fr = new JFrame();
        l1 = new JLabel("Name");
        l2 = new JLabel("Price");
        l3 = new JLabel("Type");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField(String.valueOf(view), 5);
        cb = new JComboBox();
        btn1 = new JButton("<<<");
        btn2 = new JButton(">>>");
        btn3 = new JButton("Add");
        btn4 = new JButton("Update");
        btn5 = new JButton("Delete");

        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);

        fr.setLayout(new BorderLayout());
        p1.setLayout(new GridLayout(3, 2));
        p2.setLayout(new GridLayout(2, 1));
        p3.setLayout(new FlowLayout());
        p4.setLayout(new FlowLayout());

        cb.addItem("General");
        cb.addItem("Computer");
        cb.addItem("Math&Sci");
        cb.addItem("Photo");

        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);
        p1.add(l3);
        p1.add(cb);

        p3.add(btn1);
        p3.add(tf3);
        p3.add(btn2);

        p4.add(btn3);
        p4.add(btn4);
        p4.add(btn5);

        p2.add(p3);
        p2.add(p4);

        fr.add(p1, BorderLayout.NORTH);
        fr.add(p2, BorderLayout.CENTER);

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        fr.addWindowListener(this);
        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Bookview();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        max = list2.size();
        if (e.getSource().equals(btn1)) {
            view--;
            if (max == 0) {
                view = 0;
                tf1.setText("");
                tf2.setText("");
            } else if (view > 1) {
                tf1.setText(list2.get(view - 1).getName());
                tf2.setText(String.valueOf(list2.get(view - 1).getPrice()));
                if (list2.get(view - 1).getType().equals("General")) {
                    cb.setSelectedIndex(0);
                } else if (list2.get(view - 1).getType().equals("Computer")) {
                    cb.setSelectedIndex(1);
                } else if (list2.get(view - 1).getType().equals("Math&Sci")) {
                    cb.setSelectedIndex(2);
                } else if (list2.get(view - 1).getType().equals("Photo")) {
                    cb.setSelectedIndex(3);
                }
                tf3.setText(String.valueOf(view));
            } else if (view <= 1) {
                view = 1;
                tf1.setText(list2.get(view - 1).getName());
                tf2.setText(String.valueOf(list2.get(view - 1).getPrice()));
                if (list2.get(view - 1).getType().equals("General")) {
                    cb.setSelectedIndex(0);
                } else if (list2.get(view - 1).getType().equals("Computer")) {
                    System.out.println(list2.get(view - 1).getType());
                    cb.setSelectedIndex(1);
                } else if (list2.get(view - 1).getType().equals("Math&Sci")) {
                    System.out.println(list2.get(view - 1).getType());
                    cb.setSelectedIndex(2);
                } else if (list2.get(view - 1).getType().equals("Photo")) {
                    System.out.println(list2.get(view - 1).getType());
                    cb.setSelectedIndex(3);
                }

                tf3.setText(String.valueOf(view));
            }
        } else if (e.getSource().equals(btn2)) {
            view++;
            if (view <= max) {
                System.out.println(list2.size());
                tf1.setText(list2.get(view - 1).getName());
                tf2.setText(String.valueOf(list2.get(view - 1).getPrice()));
                if (list2.get(view - 1).getType().equals("General")) {
                    cb.setSelectedIndex(0);
                } else if (list2.get(view - 1).getType().equals("Computer")) {
                    cb.setSelectedIndex(1);
                } else if (list2.get(view - 1).getType().equals("Math&Sci")) {
                    cb.setSelectedIndex(2);
                } else if (list2.get(view - 1).getType().equals("Photo")) {
                    cb.setSelectedIndex(3);
                }
                tf3.setText(view + "");
            } else if (view > max) {
                view = max;
            }
        } else if (e.getSource().equals(btn3)) {
            book = new Bookadd();
            book.getBtn1().addActionListener(this);

        } else if (e.getSource().equals(btn4)) {
            double d = Double.parseDouble(String.valueOf(tf2.getText()));
            list2.set(view - 1, new Book(tf1.getText(), d, cb.getSelectedItem().toString()));
            JOptionPane.showMessageDialog(null, "Done it.");
        } else if (e.getSource().equals(btn5)) {
            if (list2.size() == 1){
                list2.remove(view - 1);
                view -= 1;
                tf1.setText("");
                tf2.setText("");
                cb.setSelectedIndex(0);
                tf3.setText("0");
            } 
            if (view != 0) {
                list2.remove(view - 1);
                view = 1;
                tf1.setText(list2.get(view - 1).getName());
                tf2.setText(String.valueOf(list2.get(view - 1).getPrice()));
                if (list2.get(view - 1).getType().equals("General")) {
                    cb.setSelectedIndex(0);
                } else if (list2.get(view - 1).getType().equals("Computer")) {
                    System.out.println(list2.get(view - 1).getType());
                    cb.setSelectedIndex(1);
                } else if (list2.get(view - 1).getType().equals("Math&Sci")) {
                    System.out.println(list2.get(view - 1).getType());
                    cb.setSelectedIndex(2);
                } else if (list2.get(view - 1).getType().equals("Photo")) {
                    System.out.println(list2.get(view - 1).getType());
                    cb.setSelectedIndex(3);
                }
                tf3.setText(String.valueOf(view));
            }

            JOptionPane.showMessageDialog(null, "Done it.");
        } else if (e.getSource().equals(book.getBtn1())) {
            double d = Double.parseDouble(String.valueOf(book.getTf2().getText()));
            list2.add(new Book(book.getTf1().getText(), d, book.getCb().getSelectedItem().toString()));
            JOptionPane.showMessageDialog(null, "Done it.");
            book.getFr().dispose();
        }

    }

    @Override
    public void windowOpened(WindowEvent e) {
        ArrayList list = new ArrayList();
        String line;
        File f = new File("test.dat");
        if (f.exists()) {
            try (FileReader fw = new FileReader(f);
                    BufferedReader input = new BufferedReader(fw)) {
                while ((line = input.readLine()) != null) {
                    list.add(line);
                }
                input.close();
                System.out.println("Writing successful");
            } catch (IOException ex) {
                System.out.print(ex);
            }
            int sz = list.size();
            for (int i = 0; i < sz; i += 3) {
                double d = Double.parseDouble(String.valueOf(list.get(i + 1)));
                list2.add(new Book(list.get(i).toString(), d, list.get(i + 2).toString()));
            }

        }

    }

    @Override
    public void windowClosing(WindowEvent e) {
        File f = new File("test.dat");
        try (FileWriter reader = new FileWriter(f);
            Writer output = new BufferedWriter(reader)) {
            int sz = list2.size();
            for (int i = 0; i < sz; i++) {
                output.write(list2.get(i).getName() + "\n");
                output.write(String.valueOf(list2.get(i).getPrice()) + "\n");
                output.write(list2.get(i).getType() + "\n");
            }

            System.out.println("Writing successful");
        } catch (IOException ee) {
            System.out.print(ee);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
