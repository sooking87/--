package TERMPROJECT;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BottomPanel extends JPanel {
    // 상품 리스트(BuyList())를 보여줄 패널
    ListPanel li;
    JPanel totalListPane;
    ScrollPane sp;
    // 패널 아래 전체 화면
    JPanel finalPanel;
    JButton allClear;
    JPanel countCost; // 주문 수량, 주문 금액을 넣을 패널(2, 1);
    JLabel count;
    JLabel totalCost;
    JButton card;
    JButton cash;

    boolean change;

    public BottomPanel(ListPanel addList) {
        this.li = addList;
        System.out.println(addList);
        change = li.isChanged();

        setLayout(new GridLayout(2, 1));
        // setBackground(Color.DARK_GRAY);
        // 스크롤팬
        this.totalListPane = li.returnListPanel();
        //// sp = new ScrollPane();
        // sp.setSize(700, 200);
        // sp.add(totalListPane);
        // add(sp);
        add(totalListPane);

        // 스크롤패널 아래 화면
        finalPanel = new JPanel();
        finalPanel.setLayout(null);
        // finalPanel.setBackground(Color.DARK_GRAY);

        // finalPanel.setLayout(new GridLayout(1, 4, 30, 30));

        // 전체 취소 버튼
        allClear = new JButton("<html>전체<br>취소</html>");
        allClear.setBackground(Color.GRAY);
        allClear.setBounds(50, 20, 120, 120);
        allClear.setFont(new Font("굴림", Font.PLAIN, 20));
        finalPanel.add(allClear);
        // 주문 수량, 주문 금액
        countCost = new JPanel();
        countCost.setLayout(new GridLayout(2, 1));
        count = new JLabel("주문 수량");
        count.setFont(new Font("굴림", Font.ITALIC, 20));
        totalCost = new JLabel("주문 금액");
        totalCost.setFont(new Font("굴림", Font.ITALIC, 20));
        countCost.add(count);
        countCost.add(totalCost);
        countCost.setBounds(200, 30, 200, 70);
        finalPanel.add(countCost);
        // 카드 버튼
        card = new JButton("카드");
        card.setBackground(new Color(68, 103, 151));
        card.setBounds(420, 20, 90, 120);
        finalPanel.add(card);
        // 현금 버튼
        cash = new JButton("현금");
        cash.setBackground(new Color(83, 166, 116));
        cash.setBounds(530, 20, 90, 120);
        finalPanel.add(cash);

        add(finalPanel);
        System.out.println("BottomPanel end");
    }

}
