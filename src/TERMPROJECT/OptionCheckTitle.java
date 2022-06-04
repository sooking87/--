package TERMPROJECT;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class OptionCheckTitle extends JPanel {

    public OptionCheckTitle() {
        setBackground(Color.DARK_GRAY);

        JLabel title = new JLabel("옵션 메뉴 선택", JLabel.CENTER);
        title.setFont(new Font("굴림", Font.ITALIC, 30));
        title.setForeground(Color.WHITE);
        add(title);
    }
}
