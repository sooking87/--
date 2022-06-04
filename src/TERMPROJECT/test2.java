package TERMPROJECT;

import java.awt.Color;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test2 {
    public test2() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPanel p2 = new JPanel();
        JLabel tlqkf = new JLabel("tlqkf");
        p2.add(tlqkf);
        ListPanel li = new ListPanel();
        RepaintBottomPanel p = new RepaintBottomPanel(li);

        BuyList[] list = new BuyList[6];
        HashMap<String, String> eachList = new HashMap<>();
        eachList.put("아메리카노", "2900");
        eachList.put("얼음량", "많이");
        eachList.put("주문 수량", "3");
        eachList.put("당도", "0%");

        for (int i = 0; i < list.length; i++) {
            list[i] = new BuyList(li, "아메리카노", eachList);
        }

        p = new RepaintBottomPanel(li);

        p.setBackground(Color.red);
        frame.add(p2);
        panel.add(p);
        // frame.add(p);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 1000);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new test2();
    }
}
