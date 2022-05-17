package Week11;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ColorChooser extends JFrame implements ChangeListener {
    public JColorChooser color;

    public ColorChooser() {
        setTitle("Color Chooser");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        color = new JColorChooser();
        color.getSelectionModel(); // 리스너 등록
        color.setBorder(BorderFactory.createTitledBorder("Color Select"));
        JPanel panel = new JPanel();
        panel.add(color);
        add(panel);
        pack();
        this.setVisible(true);
    }

    public void stateChanged(ChangeEvent e) {
        Color newColor = color.getColor();
    }
}
