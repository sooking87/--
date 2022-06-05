package TERMPROJECT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TimerRunnable implements Runnable {
    private int i = 10;
    private JLabel timerLabel;
    private PayOptionCheck oc;

    public TimerRunnable(JLabel timerLabel, PayOptionCheck oc) {
        this.timerLabel = timerLabel;
        this.oc = oc;
    }

    public void run() {
        while (i >= 0) {

            timerLabel.setText(Integer.toString(i));
            i--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        oc.setVisible(false);
    }
}

public class PayThread extends JPanel {
    PayOptionCheck oc;

    public PayThread(PayOptionCheck oc) {
        this.oc = oc;
        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 15));
        timerLabel.setForeground(Color.RED);
        add(timerLabel);

        TimerRunnable runnable = new TimerRunnable(timerLabel, oc);
        Thread th = new Thread(runnable);

        th.start();
    }

}
