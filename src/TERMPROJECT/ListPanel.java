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

    public ListPanel() {

    }

    public void addList(JPanel add) {
        System.out.println("addList: add");
        int sizeBefore = li.size();
        li.add(add);
        int sizeAfter = li.size();
        if (sizeBefore != sizeAfter) {
            change = true;
        }

        System.out.println("addList: after ADD -> " + li.size());
    }

    public JPanel returnListPanel() {
        size = li.size();
        System.out.println("ListPanel: size -> " + size);
        setLayout(new GridLayout(size, 1));
        for (int i = 0; i < li.size(); i++) {
            add(li.get(i));
        }
        return this;
    }

    public int getLength() {
        return size;
    }

    public boolean isChanged() {
        System.out.println("listPanel change: " + change);
        return change;
    }
}
