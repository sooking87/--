package Week11;

import javax.swing.*;

public class SmileFace {
    public SmileFace(String msg) {
        JFrame jf = new JFrame(msg);
        jf.add(new SmileFacePanel());

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500, 500);
        jf.setVisible(true);
    }

}
