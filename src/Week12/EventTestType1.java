package Week12;

import javax.swing.*;
import java.awt.event.*;

public class EventTestType1 extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    public EventTestType1(String msg) {
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        button = new JButton("Button");
        label = new JLabel("Please, Click the Button");

        // 1st type :: Inherits Listener
        button.addActionListener(this);

        panel.add(button);
        panel.add(label);

        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            label.setText("Clicked ths Button");
        }

    }
}
