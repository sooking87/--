package Week11;

import javax.swing.*;
import java.awt.*;

public class HWIntro extends JPanel {
    ImageIcon icon = new ImageIcon("C:\\STUDY\\3학기\\전공\\객체\\src\\Images\\sm_logo.png");
    Image img = icon.getImage();

    public HWIntro() {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(img, 150, 20, 300, 300, this);

        g.setFont(new Font("돋움", Font.PLAIN, 15));
        g.drawString("제가 1학기에 듣는 수업은 총 6개입니다.", 170, 320);
        g.drawString("월요일 4개, 화요일 2개, 수요일 4개, 목요일 2개, 금요일 0개입니다.", 100, 340);
        g.drawString("전공은 월요일 3개, 화요일 1개, 수요일 3개, 목요일 1개, 금요일 0개입니다.", 80, 360);
        g.drawString("이러한 값을 통해 요일에 따른 수업의 개수를 차트로 만들어보겠습니다.", 90, 380);
        g.drawString("나만의 차트에서는 막대 그래프를 통해서 걸음 수를 보여줍니다.", 110, 400);
        g.drawString("요일에 해당하는 버튼을 누르면, 구체적인 걸음수와 평균 걸음 수와의 차이를 보여줍니다. ", 30, 420);
    }
}