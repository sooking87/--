package TERMPROJECT;

import javax.swing.*;
import java.awt.*;

public class Smoothie extends JPanel {
    // 커피 및 라떼 이미지 가져오기
    ImageIcon[] images;
    JLabel[] imagesLabel; // ImageIcon을 넣어줄 라벨
    JPanel imagesPanel; // 사진을 넣을 패널

    public Smoothie() {
        images = new ImageIcon[7];
        imagesLabel = new JLabel[7];
        imagesPanel = new JPanel();
        imagesPanel.setLayout(new GridLayout(2, 4, 30, 80));
        for (int i = 0; i < 7; i++) {
            images[i] = new ImageIcon("C:\\STUDY\\3학기\\전공\\--\\src\\Images\\coffee\\smoothie.png");
            images[i] = imageSetSize(images[i], 120, 120);
            imagesLabel[i] = new JLabel(images[i]);
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
