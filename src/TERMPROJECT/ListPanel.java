package TERMPROJECT;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ListPanel extends JPanel {
    ArrayList<JPanel> arrayListPanel = new ArrayList<>();
    int size = 1;
    int totalCnt = 0;
    int totalCost = 0;
    boolean change = false;
    Order or;
    JPanel temp = new JPanel();
    // 추가 리스트
    JScrollPane sp;

    public ListPanel() {

    }

    public void addList(Order or, JPanel add, int dn, int dc) {
        this.or = or;
        this.totalCnt = dn;
        this.totalCost = dc;
        arrayListPanel.add(add);
        System.out.println("addList: after ADD -> " + arrayListPanel.size());
        returnListPanel();
    }

    public void returnListPanel() {
        size = arrayListPanel.size();
        temp.setLayout(new GridLayout(size, 1, 20, 0));
        System.out.println("ListPanel: size -> " + size);

        temp.add(arrayListPanel.get(size - 1));
        sp = new JScrollPane(temp, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setPreferredSize(new Dimension(580, 160));

        or.drawBottomPanel(sp, totalCnt, totalCost);
        sp.updateUI();
        System.out.println("DRAWBOTTOM");
    }

    public int getLength() {
        return size;
    }

    public boolean isChanged() {
        System.out.println("listPanel change: " + change);
        return change;
    }

    public void deleteArraList() {
        arrayListPanel.clear();
        temp.removeAll();
        updateUI();
    }
}
