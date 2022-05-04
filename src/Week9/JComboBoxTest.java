package Week9;

import java.awt.*;
import javax.swing.*;

public class JComboBoxTest {
    JComboBox fruits;

    public JComboBoxTest() {
        JFrame jf = new JFrame("JComboBox Test");
        jf.getContentPane();
        jf.setLayout(new FlowLayout());

        String items[] = { "apple", "grape", "melon", "orange", "banana", "pear" };
        fruits = new JComboBox(items);

        jf.getContentPane().add(fruits);
        jf.setSize(200, 200);
        jf.setVisible(true);
    }
}
