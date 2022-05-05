package Week9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HWRadioButtonwithEvent implements ItemListener {
    JFrame jf;
    Container c;
    JLabel title, choose;
    JPanel jp;
    ButtonGroup size;
    JRadioButton small, medium, large;
    String[] compare = { "Small Size", "Medium Size", "Large Size" };

    public HWRadioButtonwithEvent() {
        // Create container
        jf = new JFrame("Radio Button Test : SSK");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = jf.getContentPane();
        c.setLayout(new BorderLayout());

        jp = new JPanel();

        // Create label
        title = new JLabel("What size of Coffee do you like to order?", JLabel.CENTER);
        choose = new JLabel("Did not select the size", JLabel.CENTER);
        choose.setForeground(Color.RED);

        // Create RadioButton -> Add to ButtonGroup
        size = new ButtonGroup();
        small = new JRadioButton("Small Size");
        medium = new JRadioButton("Medium Size");
        large = new JRadioButton("Large Size");
        size.add(small);
        size.add(medium);
        size.add(large);

        /*
         * Register an event listener on the RadioButton
         * because you need to handle an event depending on whether the RadioButton is
         * clicked or not.
         */
        small.addItemListener(this);
        medium.addItemListener(this);
        large.addItemListener(this);

        // Attach radio button to panel
        jp.add(small);
        jp.add(medium);
        jp.add(large);

        // Attach components to containers
        c.add(title, BorderLayout.NORTH);
        c.add(jp, BorderLayout.CENTER);
        c.add(choose, BorderLayout.SOUTH);

        jf.setSize(400, 200);
        jf.setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JRadioButton clicked = (JRadioButton) e.getItemSelectable();

        // When an item is selected, only the selected item can be handled.
        if (e.getStateChange() == ItemEvent.SELECTED) {
            if (clicked == small || clicked == medium || clicked == large) {
                choose.setText("Ordered " + clicked.getText() + ".");
            }
        }

    }
}
