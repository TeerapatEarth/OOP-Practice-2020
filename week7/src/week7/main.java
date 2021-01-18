package week7;
import java.awt.*;
import javax.swing.*;
public class main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {
            TellerGUI frame = new TellerGUI();
        });
        new TellerGUI();
    }

}
