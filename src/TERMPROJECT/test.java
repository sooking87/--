
package TERMPROJECT;

import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.event.*;

class test extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    ListPanel li = new ListPanel();

    public test() {

        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 1000);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new test();
    }
}