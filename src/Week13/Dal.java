package Week13;

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

public class Dal extends Thread {
    int x, y;
    int speed;
    JFrame app;

    public Dal(JFrame _app, int w, int h) {
        app = _app;
        x = w;
        y = h;
    }

    public void run() {
        while (true) {
            speed = (int) (Math.random() * 50);
            x += speed;
            app.repaint();

            try {
                sleep(speed * 100);
            } catch (Exception ex) {

            }
        }
    }
}
