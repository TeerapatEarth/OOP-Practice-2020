package week12;

import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Timer extends JLabel implements Runnable {

    Font myFont = new Font("Serif", Font.BOLD, 50);
    private int numSec = 55, numMin = 59, numHour, check;
    private final Object lock = new Object();

    public void setCheck(int check) {
        this.check = check;
    }

    public int getCheck() {
        return check;
    }

    public void run() {
        while (true) {
            if (check % 2 == 0) {
                numSec++;
                if (numSec == 60) {
                    numMin++;
                    numSec = 0;
                }
                if (numMin == 60) {
                    numHour++;
                    numMin = 0;
                }
                this.setFont(myFont);
                String stringSec = String.valueOf(numSec);
                String stringMin = String.valueOf(numMin);
                String stringHour = String.valueOf(numHour);
                if (numSec < 10) {
                    stringSec = "0" + stringSec;
                }
                if (numMin < 10) {
                    stringMin = "0" + stringMin;
                }
                if (numHour < 10) {
                    stringHour = "0" + stringHour;
                }
                this.setText(stringHour + " : " + stringMin + " : " + stringSec);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MyClock.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                continue;
            }
        }
    }
}
