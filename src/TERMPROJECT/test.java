
package TERMPROJECT;

import java.awt.*;
import javax.swing.*;

class test extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    public test() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new dots());

        setSize(700, 1080);
        setVisible(true);
    }

    class dots extends JPanel {
        public dots() {

        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.GRAY);
            g.fillOval(30, 750, 40, 40);
        }
    }

    public static void main(String[] args) {
        new test();
    }
}