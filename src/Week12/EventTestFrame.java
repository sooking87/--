package Week12;

import javax.swing.*;
import java.awt.event.*;

public class EventTestFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    public EventTestFrame(String msg) {
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        button = new JButton("Button");
        label = new JLabel("Please, Click the Button");
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
