package TERMPROJECT;

import java.awt.Color;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import SelfWeek6.BorderLayoutDemo;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class test2 {
    public test2() {

        JFrame frame = new JFrame();
        frame.setLayout(null);
        JPanel p1 = new JPanel();
        p1.setBackground(Color.RED);
        p1.setPreferredSize(new Dimension(500, 300));
        JPanel p2 = new JPanel();
        p2.setBackground(Color.BLUE);
        p2.setPreferredSize(new Dimension(500, 300));
        JPanel p3 = new JPanel();
        p3.setBackground(Color.YELLOW);
        p3.setPreferredSize(new Dimension(500, 300));
        JPanel p4 = new JPanel();
        p4.setLayout(new GridLayout(3, 1));
        p4.add(p1);
        p4.add(p2);
        p4.add(p3);

        JScrollPane scroll = new JScrollPane(p4);
        scroll.setPreferredSize(new Dimension(300, 300));
        // scroll.setBounds(100, 50, 300, 300);

        JPanel panel = new JPanel();
        panel.add(scroll);
        JPanel finalP = new JPanel();
        finalP.add(panel);
        finalP.setBounds(100, 50, 500, 500);
        panel.setBackground(Color.PINK);
        frame.add(finalP);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 1000);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new test2();
    }
}
