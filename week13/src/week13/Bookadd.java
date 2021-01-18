package week13;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
public class Bookadd implements ActionListener{
    private JFrame fr;
    private JPanel panelInfo, panelButton;
    private JLabel labelName, labelPrice, labelType;
    private JTextField textName, textPrice;
    private JComboBox typeBox;
    private JButton insert;
    private ArrayList<Book> list = new ArrayList<Book>();
    public Bookadd(){
        fr = new JFrame("Bookadd");
        panelInfo = new JPanel();
        panelButton = new JPanel();
        labelName = new JLabel("Name");
        labelPrice = new JLabel("Price");
        labelType = new JLabel("Type");
        textName = new JTextField();
        textPrice = new JTextField();
        typeBox = new JComboBox();
        typeBox.addItem("General");
        typeBox.addItem("Computer");
        typeBox.addItem("Math&Sci");
        typeBox.addItem("Photo");
        insert = new JButton("Insert");
        panelInfo.setLayout(new GridLayout(3, 2));
        panelInfo.add(labelName);
        panelInfo.add(textName);
        panelInfo.add(labelPrice);
        panelInfo.add(textPrice);
        panelInfo.add(labelType);
        panelInfo.add(typeBox);
        panelButton.setLayout(new FlowLayout());
        panelButton.add(insert);
        insert.addActionListener(this);
        fr.setLayout(new BorderLayout());
        fr.add(panelInfo, BorderLayout.NORTH);
        fr.add(panelButton);
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr.setSize(280, 165);
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(insert)){
            Book b = new Book();
            b.setName(textName.getText());
            b.setPrice(Double.parseDouble(textPrice.getText()));
            b.setType(typeBox.getSelectedItem().toString());
            list.add(b);
            JOptionPane.showMessageDialog(fr, "Done it.");
            fr.dispose();
        }
    }

    public void setList(ArrayList<Book> list) {
        this.list = list;
    }

    public ArrayList<Book> getList() {
        return list;
    }
    
}
