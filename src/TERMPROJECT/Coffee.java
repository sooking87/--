package TERMPROJECT;

import java.awt.*;
import javax.swing.*;

public class Coffee extends BottomButtons {
    // 커피 및 라떼 이미지 가져오기
    ImageIcon[] images;
    JLabel[] imagesLabel; // ImageIcon을 넣어줄 라벨
    JPanel imagesPanel1, imagesPanel2, imagesPanel3; // 사진을 넣을 패널
    int panelNum = 0;

    public Coffee() {
        images = new ImageIcon[30]; // 사진 추가시 숫자 변경 필요
        imagesLabel = new JLabel[30]; // 사진 추가시 숫자 변경 필요
        // 메뉴 이미지를 넣을 패널들
        imagesPanel1 = new JPanel();
        imagesPanel2 = new JPanel();
        imagesPanel3 = new JPanel();

        imagesPanel1.setLayout(new GridLayout(3, 4, 30, 80));
        imagesPanel2.setLayout(new GridLayout(3, 4, 30, 80));
        imagesPanel3.setLayout(new GridLayout(3, 4, 30, 80));

        // imagesPanel1.setBackground(Color.RED);
        // 이미지를 불러오기 위한 반복문 -> 하나의 라벨에서 이미지 + 텍스트 라벨을 사용하되, 이미지 "밑에" 텍스트 라벨을 불러옵니다.
        for (int i = 0; i < 30; i++) {
            images[i] = new ImageIcon("C:\\STUDY\\3학기\\전공\\--\\src\\Images\\coffee\\" + "americano" + ".png");
            images[i] = imageSetSize(images[i], 120, 120);
            imagesLabel[i] = new JLabel("아메리카노");
            imagesLabel[i].setIcon(images[i]);
            imagesLabel[i].setHorizontalTextPosition(SwingConstants.CENTER);
            imagesLabel[i].setVerticalTextPosition(SwingConstants.BOTTOM);
            // imagesLabel[i].addMouseListener(new ClickedImage());

            if (i < 12) {
                imagesPanel1.add(imagesLabel[i]);
            } else if (i <= 12 && i < 24) {
                imagesPanel2.add(imagesLabel[i]);
            } else {
                imagesPanel3.add(imagesLabel[i]);
            }
        }
        add(new BottomButtons());
        imagesPanel1.setVisible(true);
        add(imagesPanel1);
        imagesPanel2.setVisible(false);
        add(imagesPanel2);
        imagesPanel3.setVisible(false);
        add(imagesPanel3);
    }

    ImageIcon imageSetSize(ImageIcon icon, int width, int height) {
        Image ximg = icon.getImage(); // ImageIcon을 Image로 변환.
        Image yimg = ximg.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
        // 이미지 화질 유지를 하면서 크기를 조절할 수 있는 메소드 getScaledInstance
        ImageIcon xyimg = new ImageIcon(yimg);
        return xyimg;
    }
}
