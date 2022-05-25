
package Week12;

import java.awt.*;
import java.awt.event.*;

public class ItemEventType2 implements ActionListener, ItemListener {

    Frame f;
    Choice fruits;
    List color;
    Button exit;

    public ItemEventType2(String msg) {
        f = new Frame(msg);
        f.setSize(300, 200);
        f.setVisible(true);

        fruits = new Choice();
        fruits.addItemListener(this);
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        color = new List(3, true);
        color.addItemListener(this);
        color.addActionListener(this);
        color.add("blue");
        color.add("red");
        color.add("green");
        color.add("yellow");

        exit = new Button("Exit");
        exit.addActionListener(this);

        f.add("North", fruits);
        f.add("South", color);
        f.add("East", exit);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object o = e.getSource();

        if (o == fruits) {
            System.out.println(fruits.getSelectedItem());
        } else if (o == color) {
            Object si[] = color.getSelectedItems();

            System.out.println("Selected items currently");
            for (int i = 0; i < si.length; i++) {
                System.out.println(si[i] + " ");
            }

            System.out.println("\n----------------------------");
            System.out.println("Items event occurred");

            int index = ((Integer) e.getSource()).intValue();

            System.out.println(color.getItem(index));
            System.out.println("\n----------------------------\n");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o == color) {
            System.out.println("더블클릭이 발생한 아이템");
            System.out.println(e.getActionCommand());
        } else if (o == exit) {
            f.setVisible(false);
            f.dispose();
            System.exit(0);
        }
    }

}
