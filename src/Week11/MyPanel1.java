package Week11;

import javax.swing.*;
import java.awt.*;

public class MyPanel1 extends JPanel {
    public MyPanel1() {
        // 화면에 그릴 때 필요한 초기화 기능
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    // 그리기 함수 정의
    public void paintComponent(Graphics g) {
        // 여기에 그리기 기능 구현
        g.drawRect(50, 50, 50, 100);
        g.drawOval(200, 200, 50, 50);
    }
}
