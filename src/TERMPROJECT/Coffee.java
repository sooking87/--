package TERMPROJECT;

import java.awt.*;
import javax.swing.*;

public class Coffee extends JPanel {
    // 커피 및 라떼 이미지 가져오기
    ImageIcon[] images;
    JLabel[] imagesLabel; // ImageIcon을 넣어줄 라벨
    JPanel imagesPanel; // 사진을 넣을 패널

    public Coffee() {
        images = new ImageIcon[15];
        imagesLabel = new JLabel[15];
        imagesPanel = new JPanel();
        imagesPanel.setLayout(new GridLayout(2, 4, 30, 80));
        imagesPanel.setBackground(Color.RED);
        for (int i = 0; i < 15; i++) {
            images[i] = new ImageIcon("C:\\STUDY\\3학기\\전공\\객체\\src\\Images\\coffee\\americano.png");
            images[i] = imageSetSize(images[i], 120, 120);
            imagesLabel[i] = new JLabel(images[i]);
            // imagesLabel[i].addMouseListener(new ClickedImage());
            imagesPanel.add(imagesLabel[i]);
        }
        add(imagesPanel);

    }

    ImageIcon imageSetSize(ImageIcon icon, int width, int height) {
        Image ximg = icon.getImage(); // ImageIcon을 Image로 변환.
        Image yimg = ximg.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
        // 이미지 화질 유지를 하면서 크기를 조절할 수 있는 메소드 getScaledInstance
        ImageIcon xyimg = new ImageIcon(yimg);
        return xyimg;
    }
}
