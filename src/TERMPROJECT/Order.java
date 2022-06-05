package TERMPROJECT;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class Order extends JPanel {
    IntroPanel intro;
    JPanel menuPanel;
    JButton[] menuBtn; // 메뉴 카테고리를 반복문을 통해서 넣어줌
    String[] beverage = { "커피&라테&디카페인", "요거트스무디&프라페", "티&스파클링에이드", "베이커리" };
    // 버튼이 클릭되었을 때, 보여줘야되는 메뉴 패널
    Coffee coffee;
    Smoothie smoothie;
    Tea tea;
    Bakery bakery;
    ListPanel li;
    // JPanel li;
    // 패널 아래 전체 화면
    JPanel finalPanel;
    JButton allClear;
    JPanel countCost; // 주문 수량, 주문 금액을 넣을 패널(2, 1);
    JLabel count;
    int putCount = 0, putTotalCost = 0;
    JLabel totalCost;
    JLabel placePC, placePTC;
    JButton card;
    JButton cash;
    // 추가 리스트

    public Order() {
    }

    public Order(ListPanel li, IntroPanel intro) {
        this.li = li;
        this.intro = intro;
        setBackground(Color.DARK_GRAY);
        System.out.println("order 시작");
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
        // BottomPanel p = new BottomPanel(li);
        // p.setBounds(0, 670, 700, 280);

        drawFinalPanel();
        // RepaintBottomPanel p2 = new RepaintBottomPanel(li);
        // p.setBounds(0, 670, 700, 280);
        // add(p2);
    }

    public void drawBottomPanel(JScrollPane li, int totalCnt, int totalCost) {
        this.putCount += totalCnt;
        this.putTotalCost += totalCost;
        System.out.println("Order: totalCnt, totalCost -> " + putCount + " " + putTotalCost);
        JPanel p = new JPanel();
        // sp = new JScrollPane(li, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
        // JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        // sp.setViewportView(li);
        p.setBounds(30, 670, 600, 160);
        p.add(li);
        this.add(p);
        drawFinalPanel();
    }

    public void drawFinalPanel() {
        System.out.println("DrawFinalPanel 그려야됨");
        System.out.println("Order: totalCnt, totalCost -> " + putCount + " " + putTotalCost);
        finalPanel = new JPanel();
        finalPanel.setBackground(Color.DARK_GRAY);
        finalPanel.setLayout(new GridLayout(1, 4, 50, 50));
        // 전체 취소 버튼
        allClear = new JButton("<html>전체<br>취소</html>");
        allClear.setBackground(Color.GRAY);
        // allClear.setBounds(0, 800, 120, 120);
        allClear.setFont(new Font("굴림", Font.PLAIN, 20));
        allClear.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                li = new ListPanel();
                updateUI();
            }
        });
        finalPanel.add(allClear);
        // 주문 수량, 주문 금액
        countCost = new JPanel();
        countCost.setLayout(new GridLayout(2, 2));

        count = new JLabel("개수", JLabel.CENTER);
        placePC = new JLabel(Integer.toString(putCount), JLabel.CENTER);
        count.setFont(new Font("굴림", Font.ITALIC, 15));
        totalCost = new JLabel("금액", JLabel.CENTER);
        placePTC = new JLabel(Integer.toString(putTotalCost), JLabel.CENTER);
        totalCost.setFont(new Font("굴림", Font.ITALIC, 15));
        countCost.add(count);
        countCost.add(placePC);
        countCost.add(totalCost);
        countCost.add(placePTC);
        // countCost.setBounds(200, 30, 200, 70);
        finalPanel.add(countCost);
        // 카드 버튼
        card = new JButton("카드");
        card.setBackground(new Color(68, 103, 151));
        card.addActionListener(new ClickedPayButton(this, intro));
        // card.setBounds(420, 20, 90, 120);
        finalPanel.add(card);
        // 현금 버튼
        cash = new JButton("현금");
        cash.setBackground(new Color(83, 166, 116));
        cash.addActionListener(new ClickedPayButton(this, intro));
        // cash.setBounds(530, 20, 90, 120);
        finalPanel.add(cash);
        finalPanel.setBounds(40, 850, 600, 100);
        this.add(finalPanel);
    }

    public void setListPanel(ListPanel li) {
        this.li = li;
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

class ClickedPayButton implements ActionListener {
    Order or;
    IntroPanel intro;

    public ClickedPayButton(Order or, IntroPanel intro) {
        this.or = or;
        this.intro = intro;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        PayOptionCheck pay = new PayOptionCheck(or, intro);
        pay.setLocation(100, 300);
        pay.setVisible(true);
    }
}
