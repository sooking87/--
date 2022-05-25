
package Week12;

import java.awt.event.*;
import javax.swing.*;

public class EventTestType4 extends JFrame {
    JButton button;
    JLabel label;

    public EventTestType4(String msg) {
        super(msg);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        button = new JButton("Button");
        label = new JLabel("Please, Click the Button");

        // 이벤트 리스너 등록
        // 4th type :: Independent class
        button.addActionListener(new MyListener(label));
        panel.add(button);
        panel.add(label);

        add(panel);
        setVisible(true);
    }
}

class MyListener implements ActionListener {

    JLabel label;

    MyListener(JLabel l) {
        label = l;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (e.getSource() == button) {
            label.setText("Clicked the Button");
        }

    }
}