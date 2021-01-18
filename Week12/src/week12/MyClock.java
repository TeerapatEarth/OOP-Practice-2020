package week12;

import java.awt.Font;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class MyClock extends JLabel implements Runnable{
    Font myFont = new Font("Serif", Font.BOLD, 50);
    public void run() {
        while(true){
            Calendar d = Calendar.getInstance();
            int sec = d.get(Calendar.SECOND);
            int min = d.get(Calendar.MINUTE);
            int hour = d.get(Calendar.HOUR_OF_DAY);
            this.setFont(myFont);
            String stringSec = String.valueOf(sec);
            String stringMin = String.valueOf(min);
            String stringHour = String.valueOf(hour);
            if(sec < 10){
                stringSec = "0"+stringSec;
            }
            if(min < 10){
                stringMin = "0"+stringMin;
            }
            if(hour < 10){
                stringHour = "0"+stringHour;
            }
            this.setText(stringHour+" : "+stringMin+" : "+stringSec);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyClock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }    
}
