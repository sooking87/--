
package TERMPROJECT;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Tea extends BottomButtons {
    // 커피 및 라떼 이미지 가져오기
    ImageIcon[] images;
    JLabel[] imagesLabel; // ImageIcon을 넣어줄 라벨
    JLabel[] costLabel;;
    JPanel[] menuImages; // BorderLayout을 통해서 가운데는 imagesLabel, 아래는 cost 라벨을 넣을 패널
    JPanel imagesPanel1, imagesPanel2; // 사진을 넣을 패널
    int panelNum;
    // 이미지 파일 이름
    String[] fileName = { "green_grape_slim_tea", "slim_hives_tea", "assam_tea", "red_slim_teaade",
            "red_mango_teaade", "red_calamansi_teaade", "red_rich", "peach_green_grape", "peach_mango",
            "peach_rich_blossom", "peach_lemon_blossom", "peach_green_grape_tea", "peach_calamansi_tea",
            "rich_peach_blacktea", "peach_lemon_blacktea", "peach_pine_blacktea",
            "peach_lemon_blending", "peach_rich_blending", "peach_calamansi_blending", "peach_green_grape_blending",
            "peach_mango_blending" };
    // 음료 이름
    String[] beverName = { "청포도 슬립 비타민", "메테라 슬림 히비스커스", "메테라 슬림 아쌈티", "레드 청포도 슬림 티에이드",
            "레드 망고 슬림 티에이드", "레드 깔라만시 슬림 티에이드", "레드 리치 슬림 티에이드", "피치 청포도 블라썸", "피치 망고 블라썸",
            "피치 리치 블라썸", "피치 레몬 블라썸", "복숭아 청포도 캐모마일티", "리치 복숭아 블랙티",
            "복숭아 레몬 블랙티", "복숭아 청포도 블랙티", "복숭아 파인 블랙티", "피치 레몬 블랜딩", "피치 리치 블랜딩", "피치 깔라만시 블랜딩",
            "피치 청포도 블랜딩", "피치 망고 블랜딩" };
    // 가격
    String[] cost = { "4500", "5800", "5800", "5800", "5800", "5800", "5800", "5800", "5800", "5800", "5800", "5800",
            "5800", "5800", "5800", "5800", "6800", "6800", "6800", "6800", "6800" };

    public Tea() {
        System.out.println("fileName.length: " + fileName.length);
        System.out.println("beverName.length: " + beverName.length);
        System.out.println("cost.length: " + cost.length);
        images = new ImageIcon[21]; // 사진 추가시 숫자 변경 필요
        imagesLabel = new JLabel[21]; // 사진 추가시 숫자 변경 필요
        costLabel = new JLabel[21];
        // 메뉴 이미지를 넣을 패널들
        menuImages = new JPanel[21];
        imagesPanel1 = new JPanel();
        imagesPanel2 = new JPanel();

        imagesPanel1.setLayout(new GridLayout(3, 4, 0, 60));
        imagesPanel2.setLayout(new GridLayout(3, 4, 0, 60));

        // imagesPanel1.setBackground(Color.RED);
        // 이미지를 불러오기 위한 반복문 -> 하나의 라벨에서 이미지 + 텍스트 라벨을 사용하되, 이미지 "밑에" 텍스트 라벨을 불러옵니다.
        for (int i = 0; i < 21; i++) {
            // 라벨에 이미지와 해당 음료 이름이 붙어 있는 라벨 생성
            images[i] = new ImageIcon("C:\\STUDY\\3학기\\전공\\--\\src\\Images\\tea\\" + fileName[i] + ".png");
            images[i] = imageSetSize(images[i], 120, 120);
            imagesLabel[i] = new JLabel();
            imagesLabel[i].setText(beverName[i]);
            imagesLabel[i].setIcon(images[i]);
            imagesLabel[i].setHorizontalTextPosition(SwingConstants.CENTER);
            imagesLabel[i].setVerticalTextPosition(SwingConstants.BOTTOM);

            // 가격이 붙어있는 라벨 생성
            costLabel[i] = new JLabel(cost[i], JLabel.CENTER);

            // 패널에 음료 종류와 음료 이름 / 가격 라벨을 붙힌다.
            menuImages[i] = new JPanel();
            menuImages[i].setLayout(new BorderLayout());
            menuImages[i].add(imagesLabel[i], BorderLayout.CENTER);
            menuImages[i].add(costLabel[i], BorderLayout.SOUTH);

            // menuImages[i].addMouseListener(new ClickedImage());

            if (i < 12) {
                imagesPanel1.add(menuImages[i]);
            } else if (i <= 12 || i < 24) {
                imagesPanel2.add(menuImages[i]);
            }
        }

        imagesPanel1.setBounds(20, 100, 600, 600);
        imagesPanel1.setVisible(true);
        add(imagesPanel1);

        imagesPanel2.setBounds(20, 100, 600, 600);
        imagesPanel2.setVisible(false);
        add(imagesPanel2);

        super.addMouseListener(new ClickedButtomButtons());
        add(new BottomButtons());

    }

    // 이후, 이전 버튼이 클릭되었다면 해당 패널을 바꾸어 주어야함.
    class ClickedButtomButtons extends MouseAdapter {

        public ClickedButtomButtons() {

        }

        public void mouseClicked(MouseEvent e) {
            if (getPanelNum() == 0) {
                imagesPanel1.setVisible(true);
                imagesPanel2.setVisible(false);
            } else {
                imagesPanel1.setVisible(false);
                imagesPanel2.setVisible(true);
            }
        }

    }

    ImageIcon imageSetSize(ImageIcon icon, int width, int height) {
        Image ximg = icon.getImage(); // ImageIcon을 Image로 변환.
        Image yimg = ximg.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
        // 이미지 화질 유지를 하면서 크기를 조절할 수 있는 메소드 getScaledInstance
        ImageIcon xyimg = new ImageIcon(yimg);
        return xyimg;
    }
}
