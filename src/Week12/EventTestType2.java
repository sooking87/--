package Week12;

import java.awt.event.*;
import javax.swing.*;

public class EventTestType2 extends JFrame {
    JButton button;
    JLabel label;

    public EventTestType2(String msg) {
        super(msg);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        button = new JButton("Button");
        label = new JLabel("Please, Click the Button");

        // 이벤트 리스너 등록
        // 2nd type :: Named Inner Class
        button.addActionListener(new MyListener());
        panel.add(button);
        panel.add(label);

        add(panel);
        setVisible(true);
    }

    private class MyListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                label.setText("Clicked the Button");
            }

        }
    }
}
