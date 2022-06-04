package TERMPROJECT;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class Order extends JPanel {
    JPanel menuPanel;
    JButton[] menuBtn; // 메뉴 카테고리를 반복문을 통해서 넣어줌
    String[] beverage = { "커피&라테&디카페인", "요거트스무디&프라페", "티&스파클링에이드", "베이커리" };
    // 버튼이 클릭되었을 때, 보여줘야되는 메뉴 패널
    Coffee coffee;
    Smoothie smoothie;
    Tea tea;
    Bakery bakery;
    ListPanel li = new ListPanel();
    RepaintBottomPanel link;

    public Order() {
        setLayout(null);
        menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(1, 4));

        // 버튼에 패널 이름 넣어주기 + 이벤트 리스너 등록
        menuBtn = new JButton[beverage.length];
        for (int i = 0; i < beverage.length; i++) {
            // 버튼에 패널 이름 넣어주기
            menuBtn[i] = new JButton(beverage[i]);
            menuBtn[i].setFont(new Font("굴림", Font.BOLD, 13));
            menuBtn[i].setBackground(Color.GRAY);
            // 버튼에 이벤트 리스너 등록
            menuBtn[i].addActionListener(new ClickedMenuCategory());
            menuPanel.add(menuBtn[i]);
        }
        menuPanel.setBounds(20, 25, 650, 50);
        add(menuPanel);
        // 카테고리 선택 시 나와야 되는 음료 메뉴들 패널
        coffee = new Coffee(li, this);
        smoothie = new Smoothie(li, this);
        tea = new Tea(li, this);
        bakery = new Bakery(li, this);
        // 각 카테고리별
        coffee.setBounds(0, 100, 700, 550);
        add(coffee);
        smoothie.setBounds(0, 100, 700, 550);
        smoothie.setVisible(false);
        add(smoothie);
        tea.setBounds(0, 100, 700, 550);
        tea.setVisible(false);
        add(tea);
        bakery.setBounds(0, 100, 700, 550);
        bakery.setVisible(false);
        add(bakery);
        // coffee.setBackground(Color.PINK);
        BottomPanel p = new BottomPanel(li);
        // link = new RepaintBottomPanel(p);
        int size = li.getLength();
        System.out.println("order: size -> " + size);

        p.setBounds(0, 670, 700, 280);
        add(p);

        // RepaintBottomPanel p2 = new RepaintBottomPanel(li);
        // p.setBackground(Color.RED);
        // p.setBounds(0, 670, 700, 280);
        // add(p2);
    }

    public void drawPanel(JPanel draw) {
        System.out.println("Order li.length() -> " + li.getLength());
    }

    class ClickedMenuCategory implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            String menuCate = b.getText();
            if (menuCate.equals("커피&라테&디카페인")) {
                System.out.println("Coffee");
                coffee.setVisible(true);
                smoothie.setVisible(false);
                tea.setVisible(false);
                bakery.setVisible(false);

            } else if (menuCate.equals("요거트스무디&프라페")) {
                coffee.setVisible(false);
                smoothie.setVisible(true);
                tea.setVisible(false);
                bakery.setVisible(false);

            } else if (menuCate.equals("티&스파클링에이드")) {
                coffee.setVisible(false);
                smoothie.setVisible(false);
                tea.setVisible(true);
                bakery.setVisible(false);

            } else {
                coffee.setVisible(false);
                smoothie.setVisible(false);
                tea.setVisible(false);
                bakery.setVisible(true);

            }
        }
    }
}
