package TERMPROJECT;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ListPanel extends JPanel {
    ArrayList<JPanel> li = new ArrayList<>();
    int size;
    int totalCnt = 0;
    int totalCost = 0;
    boolean change = false;
    Order or;
    JScrollPane js;

    public ListPanel() {
    }

    public void addList(Order or, JPanel add, int dn, int dc) {
        this.or = or;
        this.totalCnt = dn;
        this.totalCost = dc;
        int sizeBefore = li.size();
        li.add(add);
        int sizeAfter = li.size();
        if (sizeBefore != sizeAfter) {
            change = true;
        }

        System.out.println("addList: after ADD -> " + li.size());
        returnListPanel();
    }

    public void returnListPanel() {
        size = li.size();
        System.out.println("ListPanel: size -> " + size);
        setLayout(new GridLayout(size, 1));
        for (int i = 0; i < li.size(); i++) {
            this.add(li.get(i));
        }
        or.drawBottomPanel(this, totalCnt, totalCost);
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
