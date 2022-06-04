
package TERMPROJECT;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Smoothie extends BottomButtons {
    ListPanel li;
    Order or;
    // 커피 및 라떼 이미지 가져오기
    ImageIcon[] images;
    JLabel[] imagesLabel; // ImageIcon을 넣어줄 라벨
    JLabel[] costLabel;;
    JPanel[] menuImages; // BorderLayout을 통해서 가운데는 imagesLabel, 아래는 cost 라벨을 넣을 패널
    JPanel imagesPanel1, imagesPanel2; // 사진을 넣을 패널
    int panelNum;
    // 이미지 파일 이름
    String[] fileName = { "javachip_frappe", "hawaiian_coconut", "calamansi_smoothie", "mango_smoothie",
            "strawberry_smoothie", "green_grape_smoothie", "calamansi_yogurt_smoothie", "strawberry_yogrut_smoothie",
            "mango_yogurt_smoothie", "plain_yogurt_smoothie", "peach_lemon_smoothie", "peach_green_grape_smoothie",
            "realchoco_frappe", "peach_leach_smoothie", "tropical_smoothie" };
    // 음료 이름
    String[] beverName = { "자바칩 프라페", "하와이안 코코넛 프라페", "깔라만시 스무디", "망고 스무디", "딸기 스무디",
            "청포도 스무디", "깔라만시 요거트 스무디", "딸기 요거트 스무디", "망고 요거트 스무디", "플레인 요거트 스무디",
            "피치 레몬 스무디", "피치 청포도 스무디", "생초코 파르페 스무디", "피치 리치 스무디", "트로피칼쥬스 스무디" };
    // 가격
    String[] cost = { "6400", "7000", "6300", "6300", "6300", "6300", "7300", "7300", "7300", "7300", "5800", "5800",
            "6800", "5800", "5900" };

    public Smoothie(ListPanel li, Order or) {
        this.li = li;
        this.or = or;
        images = new ImageIcon[15]; // 사진 추가시 숫자 변경 필요
        imagesLabel = new JLabel[15]; // 사진 추가시 숫자 변경 필요
        costLabel = new JLabel[15];
        // 메뉴 이미지를 넣을 패널들
        menuImages = new JPanel[15];
        imagesPanel1 = new JPanel();
        imagesPanel2 = new JPanel();

        imagesPanel1.setLayout(new GridLayout(3, 4, 0, 30));
        imagesPanel2.setLayout(new GridLayout(1, 4, 0, 30));

        // imagesPanel1.setBackground(Color.RED);
        // 이미지를 불러오기 위한 반복문 -> 하나의 라벨에서 이미지 + 텍스트 라벨을 사용하되, 이미지 "밑에" 텍스트 라벨을 불러옵니다.
        for (int i = 0; i < 15; i++) {
            // 라벨에 이미지와 해당 음료 이름이 붙어 있는 라벨 생성
            images[i] = new ImageIcon("C:\\STUDY\\3학기\\전공\\--\\src\\Images\\smoothie\\" + fileName[i] + ".png");
            images[i] = imageSetSize(images[i], 100, 100);
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

            // 이벤트 리스너 등록
            menuImages[i]
                    .addMouseListener(new ClickedImage(or, li, "smoothie", fileName[i], imagesLabel[i], costLabel[i]));

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
