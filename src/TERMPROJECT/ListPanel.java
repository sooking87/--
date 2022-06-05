package TERMPROJECT;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ListPanel extends Order {
    ArrayList<JPanel> li = new ArrayList<>();
    int size;
    int totalCnt = 0;
    int totalCost = 0;
    boolean change = false;
    Order or;
    JPanel temp;
    // 추가 리스트
    JScrollPane sp;

    public ListPanel() {
    }

    public void addList(Order or, JPanel add, int dn, int dc) {
        this.or = or;
        this.totalCnt = dn;
        this.totalCost = dc;
        li.add(add);

        System.out.println("addList: after ADD -> " + li.size());
        returnListPanel();
    }

    public void returnListPanel() {
        size = li.size();
        temp = new JPanel();
        System.out.println("ListPanel: size -> " + size);
        temp.setLayout(new GridLayout(size, 1, 20, 0));

        for (int i = 0; i < li.size(); i++) {
            temp.add(li.get(i));
        }
        sp = new JScrollPane(temp, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setPreferredSize(new Dimension(580, 160));
        or.drawBottomPanel(sp, totalCnt, totalCost);
        System.out.println("DRAWBOTTOM");
    }

    public int getLength() {
        return size;
    }

    public boolean isChanged() {
        System.out.println("listPanel change: " + change);
        return change;
    }

    public void setTotalNum(String num) {

    }
}
