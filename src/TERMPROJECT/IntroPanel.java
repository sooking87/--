package TERMPROJECT;

import java.awt.*;
import javax.swing.*;

public class IntroPanel extends JPanel {
    ImageIcon icon = new ImageIcon("C:\\STUDY\\3학기\\전공\\--\\src\\Images\\imgLogo.png"); // 로고 사람 부분
    Image logoImg = icon.getImage();
    ImageIcon icon2 = new ImageIcon("C:\\STUDY\\3학기\\전공\\--\\src\\Images\\dessert39_logo.png"); // 로고 글씨 부분
    Image logoTitle = icon2.getImage();

    public IntroPanel() {
        setBackground(Color.BLACK);
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        // background: Black, rect: White
        g.setColor(Color.WHITE);
        g.fillRect(50, 50, 600, 880);

        g.setColor(Color.BLACK);
        // Logo
        g.drawImage(logoImg, 250, 300, 200, 280, this);
        g.drawImage(logoTitle, 200, 580, 300, 100, this);
        // Command
        g.setFont(new Font("굴림", Font.ITALIC, 30));
        g.drawString("[주문하려면 화면을 클릭해주세요]", 100, 800);
    }
}

// pc 경로: C:\\STUDY\\3학기\\전공\\객체\\src\\Images\\dessert39_logo.png