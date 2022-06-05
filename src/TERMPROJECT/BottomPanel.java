package TERMPROJECT;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BottomPanel extends JPanel {
    Order or;
    // 상품 리스트(BuyList())를 보여줄 패널
    ListPanel li;
    JPanel totalListPane;
    JScrollPane sp;

    boolean change;

    public BottomPanel(ListPanel addList) {
        this.li = addList;

        if (li.getLength() % 2 == 0) {
            setBackground(Color.RED);
        } else {
            setBackground(Color.CYAN);
        }
        // 스크롤팬
        sp = new JScrollPane(li, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        // sp.setSize(700, 100);
        // sp.add(li);
        add(sp);

        System.out.println("BottomPanel end");
    }
}
