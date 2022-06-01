package Week12;

import javax.swing.*;

public class ButtonEventType2Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("ButtonEvent Type 2 Test :: SSK");
        f.setSize(300, 500);
        f.setVisible(true);

        ButtonEventType2 p = new ButtonEventType2();

        f.add(p);
    }
}
