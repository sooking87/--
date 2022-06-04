
package TERMPROJECT;

import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;

class test extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    ListPanel li = new ListPanel();

    public test() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel[] test = new JPanel[6];
        ScrollPane sc = new ScrollPane();
        // test.setBackground(Color.RED);
        // ArrayList<BuyList> li = new ArrayList<>();
        HashMap<String, String> eachList = new HashMap<>();
        eachList.put("아메리카노", "2900");
        eachList.put("얼음량", "많이");
        eachList.put("주문 수량", "3");
        eachList.put("당도", "0%");

        BuyList[] list = new BuyList[6];

        for (int i = 0; i < list.length; i++) {
            list[i] = new BuyList(li, "아메리카노", eachList);
        }

        JPanel testListPanel = li.returnListPanel();
        add(testListPanel);
        System.out.println(testListPanel);
        add(testListPanel);
        testListPanel.removeAll();

        setSize(700, 1000);
        setVisible(true);
    }

    public static void main(String[] args) {
        new test();
    }
}