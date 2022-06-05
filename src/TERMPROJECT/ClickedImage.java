package TERMPROJECT;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ClickedImage extends MouseAdapter {
    String menuCategory;
    String fileName;
    String beverName;
    int cost;
    GetBeverInfo link = new GetBeverInfo();
    ListPanel li;
    Order or;

    ClickedImage(Order or, ListPanel li, String mc, String f, JLabel b, JLabel c) {
        this.or = or;
        this.li = li;
        this.menuCategory = mc;
        // System.out.println("ClickedImage: oc.getName(): " + oc.getName());
        this.fileName = f;
        this.beverName = b.getText();
        this.cost = Integer.parseInt(c.getText());
    }

    public void mouseClicked(MouseEvent e) {
        OptionCheck oc = new OptionCheck();
        System.out.println(beverName);
        System.out.println(cost);
        oc.setName(fileName);
        oc.setBeverName(beverName);
        oc.setCost(cost);
        oc.add(new OptionCheckTitle(), BorderLayout.NORTH);
        oc.add(new OptionCheckCenter(oc, menuCategory, fileName, beverName, cost), BorderLayout.CENTER);
        oc.add(new OptionCheckBottom(or, li, oc, beverName, cost), BorderLayout.SOUTH);
        oc.setLocation(100, 200);
        oc.setVisible(true);
    }

}
