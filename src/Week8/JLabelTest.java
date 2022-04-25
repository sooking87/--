package Week8;

import javax.swing.*;

public class JLabelTest {

    JLabel label1, label2;

    public JLabelTest(String msg) {
        JFrame jf = new JFrame(msg);
        jf.setTitle("Image Label Test : SSK");
        jf.setSize(500, 500);

        label1 = new JLabel("University_Logo");
        // label2 = new JLabel("Sookmyung");

        // make Image Label
        ImageIcon logo = new ImageIcon("University_Logo.png");
        label2 = new JLabel("Sookmyung", logo, JLabel.CENTER);

        jf.getContentPane().add("North", label1);
        jf.getContentPane().add("South", label2);

        jf.setVisible(true);

    }
}
