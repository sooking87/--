package Week11;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ColorChooser extends JFrame implements ChangeListener {
    public JColorChooser color;

    public ColorChooser() {
        setTitle("Color Chooser :: SSK");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        color = new JColorChooser();
        color.getSelectionModel().addChangeListener(this); // 리스너 등록

        // 제목이 Color Select인 보더에 보더합니다.
        color.setBorder(BorderFactory.createTitledBorder("Color Select"));
        JPanel panel = new JPanel();
        panel.add(color);
        add(panel);
        pack(); // 윈도우에 화면이 차도록 해주는 메소드입니다.
        this.setVisible(true);
    }

    // 상태가 변환될 때 발생하는 이벤트 처리 메소드
    public void stateChanged(ChangeEvent e) {
        Color newColor = color.getColor();
    }
}
