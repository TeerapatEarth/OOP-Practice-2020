package week13;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Bookview extends Book implements ActionListener, WindowListener {

    private JFrame fr;
    private JPanel panelInfo, panelNextandPre;
    private JLabel labelName, labelPrice, labelType;
    private JTextField textName, textPrice, textNum;
    private JButton pre, next, add, update, delete;
    private JComboBox listType;
    private Bookadd ba;
    private ArrayList<Bookadd> listbookadd = new ArrayList<Bookadd>();
    private int count = 0;

    public Bookview() {
        listbookadd.add(null);
        fr = new JFrame("Bookview");
        panelInfo = new JPanel();
        panelNextandPre = new JPanel();
        labelName = new JLabel("Name");
        labelPrice = new JLabel("Price");
        labelType = new JLabel("Type");
        textName = new JTextField();
        textPrice = new JTextField();
        textNum = new JTextField("0");
        pre = new JButton("<<<");
        next = new JButton(">>>");
        add = new JButton("Add");
        update = new JButton("Update");
        delete = new JButton("Delete");
        listType = new JComboBox();
        listType.addItem("General");
        listType.addItem("Computer");
        listType.addItem("Math&Sci");
        listType.addItem("Photo");
        textNum.setPreferredSize(new Dimension(99, 27));
        panelInfo.setLayout(new GridLayout(3, 2));
        panelInfo.add(labelName);
        panelInfo.add(textName);
        panelInfo.add(labelPrice);
        panelInfo.add(textPrice);
        panelInfo.add(labelType);
        panelInfo.add(listType);

        panelNextandPre.setLayout(new FlowLayout());
        panelNextandPre.add(pre);
        panelNextandPre.add(textNum);
        panelNextandPre.add(next);
        panelNextandPre.add(add);
        panelNextandPre.add(update);
        panelNextandPre.add(delete);

        add.addActionListener(this);
        update.addActionListener(this);
        delete.addActionListener(this);
        next.addActionListener(this);
        pre.addActionListener(this);

        fr.setLayout(new GridLayout(2, 1));
        fr.add(panelInfo);
        fr.add(panelNextandPre);
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr.setSize(300, 250);
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(add)) {
            ba = new Bookadd();
            listbookadd.add(ba);
        } else if (ae.getSource().equals(update)) {
            listbookadd.get(count).getList().get(0).setName(textName.getText());
            listbookadd.get(count).getList().get(0).setPrice(Double.parseDouble(textPrice.getText()));
            listbookadd.get(count).getList().get(0).setType(listType.getSelectedItem().toString());
            JOptionPane.showMessageDialog(fr, "Done it.");

        } else if (ae.getSource().equals(delete)) {
            if (count - 1 == 0) {
                listbookadd.remove(count);
                count = 0;
                textNum.setText(Integer.toString(0));
                textName.setText("");
                textPrice.setText("");
                listType.setSelectedItem("General");
                JOptionPane.showMessageDialog(fr, "Done it.");
            } else {
                listbookadd.remove(count);
                count--;
                textNum.setText(Integer.toString(count));
                textName.setText(listbookadd.get(count).getList().get(0).getName());
                textPrice.setText(Double.toString(listbookadd.get(count).getList().get(0).getPrice()));
                listType.setSelectedItem(listbookadd.get(count).getList().get(0).getType());
                JOptionPane.showMessageDialog(fr, "Done it.");
            }
        } else if (ae.getSource().equals(next)) {
            try {
                count++;
                if (listbookadd.size() - 1 >= count) {
                    textNum.setText(Integer.toString(count));
                    textName.setText(listbookadd.get(count).getList().get(0).getName());
                    textPrice.setText(Double.toString(listbookadd.get(count).getList().get(0).getPrice()));
                    listType.setSelectedItem(listbookadd.get(count).getList().get(0).getType());
                } else {
                    count--;
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("");
                textNum.setText(Integer.toString(count));
            }
        } else if (ae.getSource().equals(pre)) {
            try {
                count--;
                if (count > 0) {
                    textNum.setText(Integer.toString(count));
                    textName.setText(listbookadd.get(count).getList().get(0).getName());
                    textPrice.setText(Double.toString(listbookadd.get(count).getList().get(0).getPrice()));
                    listType.setSelectedItem(listbookadd.get(count).getList().get(0).getType());
                } else if (listbookadd.size() > 1) {
                    count = 1;
                    textNum.setText(Integer.toString(count));
                } else {
                    count = 0;
                    textNum.setText(Integer.toString(count));
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("");
                textNum.setText(Integer.toString(count));
            }
        }
    }

    public JFrame getFr() {
        return fr;
    }

    public JPanel getPanelInfo() {
        return panelInfo;
    }

    public JPanel getPanelNextandPre() {
        return panelNextandPre;
    }

    public JLabel getLabelName() {
        return labelName;
    }

    public JLabel getLabelPrice() {
        return labelPrice;
    }

    public JLabel getLabelType() {
        return labelType;
    }

    public JTextField getTextName() {
        return textName;
    }

    public JTextField getTextPrice() {
        return textPrice;
    }

    public JTextField getTextNum() {
        return textNum;
    }

    public JButton getPre() {
        return pre;
    }

    public JButton getNext() {
        return next;
    }

    public JButton getAdd() {
        return add;
    }

    public JButton getUpdate() {
        return update;
    }

    public JButton getDelete() {
        return delete;
    }

    public JComboBox getListType() {
        return listType;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Bookadd getBa() {
        return ba;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public void setPanelInfo(JPanel panelInfo) {
        this.panelInfo = panelInfo;
    }

    public void setPanelNextandPre(JPanel panelNextandPre) {
        this.panelNextandPre = panelNextandPre;
    }

    public void setLabelName(JLabel labelName) {
        this.labelName = labelName;
    }

    public void setLabelPrice(JLabel labelPrice) {
        this.labelPrice = labelPrice;
    }

    public void setLabelType(JLabel labelType) {
        this.labelType = labelType;
    }

    public void setTextName(JTextField textName) {
        this.textName = textName;
    }

    public void setTextPrice(JTextField textPrice) {
        this.textPrice = textPrice;
    }

    public void setTextNum(JTextField textNum) {
        this.textNum = textNum;
    }

    public void setPre(JButton pre) {
        this.pre = pre;
    }

    public void setNext(JButton next) {
        this.next = next;
    }

    public void setAdd(JButton add) {
        this.add = add;
    }

    public void setUpdate(JButton update) {
        this.update = update;
    }

    public void setDelete(JButton delete) {
        this.delete = delete;
    }

    public void setListType(JComboBox listType) {
        this.listType = listType;
    }

    public void setBa(Bookadd ba) {
        this.ba = ba;
    }

    @Override
    public void windowOpened(WindowEvent we) {

    }

    @Override
    public void windowClosing(WindowEvent we) {
       
    }

    @Override
    public void windowClosed(WindowEvent we) {
        ArrayList list= new ArrayList();
        String line;
        File f = new File("test.dat");
        if(f.exists()){
            try(FileReader fw = new FileReader(f);
                BufferedReader input = new BufferedReader(fw)){
                while ((line = input.readLine()) != null){
                    list.add(line);
                }
                input.close();
                System.out.println("Writing successful");
            }catch(IOException ex){
                System.out.print(ex);
            }
            int sz = list.size();
            for(int i = 0; i < sz; i+=3){
                double d=Double.parseDouble(String.valueOf(list.get(i+1)));
                list2.add(new Book(list.get(i).toString(),d,list.get(i+2).toString()));
            }

        }
    }

    @Override
    public void windowIconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
