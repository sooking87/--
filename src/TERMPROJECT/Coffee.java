package TERMPROJECT;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Coffee extends BottomButtons {
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
    String[] fileName = { "americano", "decaffine_coffee", "banana_latte", "banila_latte",
            "cafelatte", "milktea_latte",
            "caramel_macchiato", "dothelatte", "einspanner", "einspanner_latte", "cafemoca", "bubblemilktea",
            "caffeore", "chocobanana", "blackmilktea", "realchoco", "shucream", "strawberry_latte", "mangolatte" };
    String[] beverName = { "아메리카노", "디카페인 커피", "바나나 라떼", "바닐라 라떼", "카페라떼", "밀크티 라떼", "카라멜 마키아또",
            "돌체라떼", "아인슈페너", "아인슈페너 라떼", "카페모카", "버블 밀크티", "카페 오레오", "초코 바나나", "홍차",
            "리얼 초코", "슈크림 JMT", "딸기 라떼", "망고 라떼" };
    String[] cost = { "2900", "3500", "5800", "5800", "2900", "4900", "4300",
            "5800", "4800", "5800", "2900", "4500", "3900", "4900", "3900", "4800", "3900", "5800", "5800" };

    public Coffee(ListPanel li, Order or) {
        this.li = li;
        this.or = or;
        images = new ImageIcon[19]; // 사진 추가시 숫자 변경 필요
        imagesLabel = new JLabel[19]; // 사진 추가시 숫자 변경 필요
        costLabel = new JLabel[19];
        // 메뉴 이미지를 넣을 패널들
        menuImages = new JPanel[19];
        imagesPanel1 = new JPanel();
        imagesPanel2 = new JPanel();

        imagesPanel1.setLayout(new GridLayout(3, 4, 30, 30));
        imagesPanel2.setLayout(new GridLayout(2, 4, 30, 30));

        // imagesPanel1.setBackground(Color.RED);
        // 이미지를 불러오기 위한 반복문 -> 하나의 라벨에서 이미지 + 텍스트 라벨을 사용하되, 이미지 "밑에" 텍스트 라벨을 불러옵니다.
        for (int i = 0; i < 19; i++) {
            // 라벨에 이미지와 해당 음료 이름이 붙어 있는 라벨 생성
            images[i] = new ImageIcon("C:\\STUDY\\3학기\\전공\\--\\src\\Images\\coffee\\" + fileName[i] + ".png");
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
                    .addMouseListener(new ClickedImage(or, li, "coffee", fileName[i], imagesLabel[i], costLabel[i]));

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

        add(new BottomButtons());
        super.addMouseListener(new ClickedButtomButtons());

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
