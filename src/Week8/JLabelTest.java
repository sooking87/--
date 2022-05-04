package Week8;

import java.awt.*;

import javax.swing.*;

public class JLabelTest {

    JLabel label1, label2;

    public JLabelTest(String msg) {
        JFrame jf = new JFrame(msg);
        jf.setTitle("Image Label Test : SSK");
        jf.setSize(500, 500);
        jf.getContentPane().setBackground(Color.YELLOW);

        // Make Label
        label1 = new JLabel("University_Logo");
        // label2 = new JLabel("Sookmyung");

        // make Image Label
        ImageIcon logo = new ImageIcon("C:\\STUDY\\3학기\\전공\\객체\\src\\Images\\sm_logo.png");
        logo = imageSetSize(logo, 450, 450);

        // 라벨에 이미지 설정(붙히기)
        label2 = new JLabel("Sookmyung", logo, JLabel.CENTER);

        // 프레임에 컴포넌트 추가
        jf.getContentPane().add("North", label1);
        jf.getContentPane().add("South", label2);

        jf.setVisible(true);

    }

    // image Size Setting
    // How to setSize image :
    // 1. ImageIcon 의 크기를 품질이 깨지지 않고 변환하기 위해서 Image 로 변환.

    // 2. Image 함수인 getScaledInstance() 를 통해 품질을 유지한 채 사이즈 변경

    // 3. 바로 사용을 위해 다시 ImageIcon 으로 변환 후 리턴
    ImageIcon imageSetSize(ImageIcon icon, int width, int height) {
        Image ximg = icon.getImage(); // ImageIcon을 Image로 변환.
        Image yimg = ximg.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
        // 이미지 화질 유지를 하면서 크기를 조절할 수 있는 메소드 getScaledInstance
        ImageIcon xyimg = new ImageIcon(yimg);
        return xyimg;
    }
}
