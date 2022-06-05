package TERMPROJECT;

import java.awt.*;
import javax.swing.*;

import SelfWeek6.BorderLayoutDemo;

import java.awt.event.*;
import java.util.ArrayList;

public class OptionCheckCenter extends JPanel {
    OptionCheck oc;
    String menuCategory;
    String fileName;
    String beverName;
    int cost;
    // 1행 1칸에 올 컴포넌트와 패널
    JPanel first, imgPanel, nameCountPanel, totalCostPanel;
    JLabel imgLabel;
    // 1행 2칸에 올 컴포넌트와 패널
    JPanel upDownButton;
    JLabel beverage, count;
    JButton up, down;
    // 1행 3칸에 올 컴포넌트
    JPanel aboutCost;
    JLabel addCost;
    JLabel showCost;
    // 2행: 얼음양
    JPanel second;
    JLabel secondTitle;
    JRadioButton[] ice;
    String[] iceStr = { "없음", "조금", "많이" };
    // 3행: 당도
    JPanel third;
    JLabel thirdTitle;
    JRadioButton[] sugar;
    String[] sugarStr = { "0%", "25%", "50%", "75%", "100%" };
    // 전달해야될 정보
    String totalNum; // 음료 개수
    String iceNum; // 얼음 정도
    String sugarNum; // 당도 정도

    public OptionCheckCenter() {
    }

    public OptionCheckCenter(OptionCheck oc, String mc, String f, String b, int c) {
        this.oc = oc;
        this.menuCategory = mc;
        this.fileName = f;
        this.beverName = b;
        this.cost = c;
        setLayout(new GridLayout(3, 1));

        // 1행 -> first Panel
        // first의 1열: 이미지
        first = new JPanel();
        first.setLayout(new GridLayout(1, 3, 50, 0));
        imgPanel = new JPanel();
        imgLabel = new JLabel();
        nameCountPanel = new JPanel();
        totalCostPanel = new JPanel();
        ImageIcon image = new ImageIcon(
                "C:\\STUDY\\3학기\\전공\\--\\src\\Images\\" + menuCategory + "\\" + fileName + ".png");
        image = imageSetSize(image, 150, 150);
        imgLabel.setIcon(image);
        imgPanel.add(imgLabel);
        first.add(imgPanel);
        // first의 2열: 이름, 카운트
        // 이름 설정
        nameCountPanel = new JPanel();
        nameCountPanel.setLayout(new GridLayout(2, 1));
        beverage = new JLabel(beverName, JLabel.CENTER);
        beverage.setFont(new Font("굴림", Font.BOLD, 20));
        nameCountPanel.add(beverage);
        // 카운트 버튼 + 개수 TextField + 버튼
        upDownButton = new JPanel();
        // upDownButton.setLayout(new GridLayout(1, 3));
        count = new JLabel();
        count.setFont(new Font("굴림", Font.BOLD, 20));
        count.setText("1");
        oc.setTotalNum(Integer.toString(1));
        showCost = new JLabel(Integer.toString(cost), JLabel.CENTER); // 합계금액에 필요
        // count.setPreferredSize(new Dimension(30, 10));
        down = new JButton();
        down.setText(" - ");
        down.setBackground(new Color(205, 54, 41));

        if (Integer.parseInt(count.getText()) == 1) {
            down.setBackground(Color.GRAY);
        }
        down.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int cnt = Integer.parseInt(count.getText());
                cnt--;
                if (cnt <= 1) {
                    down.setBackground(Color.GRAY);
                }
                if (cnt >= 1) {
                    count.setText(Integer.toString(cnt));
                    oc.setTotalNum(Integer.toString(cnt));
                    showCost.setText(Integer.toString(cost * cnt));
                }
            }
        });
        up = new JButton();
        up.setText(" + ");
        up.setBackground(new Color(68, 103, 151));
        up.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int cnt = Integer.parseInt(count.getText());
                if (++cnt > 1) {
                    down.setBackground(new Color(205, 54, 41));
                    count.setText(Integer.toString(cnt));
                    oc.setTotalNum(Integer.toString(cnt));
                    showCost.setText(Integer.toString(cost * cnt));
                }
            }
        });
        upDownButton.add(down);
        upDownButton.add(count);
        upDownButton.add(up);
        nameCountPanel.add(upDownButton);
        first.add(nameCountPanel);
        // first의 3열: total 가격
        aboutCost = new JPanel();
        aboutCost.setLayout(new GridLayout(2, 1));
        addCost = new JLabel("합계 금액", JLabel.CENTER);
        addCost.setFont(new Font("굴림", Font.BOLD, 20));
        showCost.setFont(new Font("굴림", Font.BOLD, 20));

        aboutCost.add(addCost);
        aboutCost.add(showCost);
        aboutCost.setBackground(Color.PINK);
        first.add(aboutCost);
        add(first);

        // 2행: 얼음량
        second = new JPanel();
        // "얼음량" 라벨
        secondTitle = new JLabel("얼음량", JLabel.LEFT);
        secondTitle.setPreferredSize(new Dimension(140, 50));
        secondTitle.setHorizontalAlignment(SwingConstants.CENTER);
        secondTitle.setVerticalAlignment(SwingConstants.CENTER);
        second.add(secondTitle, BorderLayout.WEST);
        secondTitle.setFont(new Font("굴림", Font.BOLD, 25));
        // 얼음량에 대한 라디오버튼
        ButtonGroup group = new ButtonGroup();
        JPanel radioBtnTemp = new JPanel();
        ice = new JRadioButton[3];
        for (int i = 0; i < ice.length; i++) {
            ice[i] = new JRadioButton(iceStr[i]);
            ice[i].setFont(new Font("굴림", Font.BOLD, 20));
            group.add(ice[i]);
            ice[i].setHorizontalAlignment(SwingConstants.CENTER);
            ice[i].setVerticalAlignment(SwingConstants.CENTER);
            radioBtnTemp.add(ice[i]);
            ice[i].addItemListener(new Checked(ice.length, ice));
        }
        second.add(radioBtnTemp, BorderLayout.CENTER);
        add(second);

        // 3행: 당도
        third = new JPanel();
        // "당도" 라벨
        thirdTitle = new JLabel("당도", JLabel.LEFT);
        thirdTitle.setPreferredSize(new Dimension(100, 50));
        thirdTitle.setHorizontalAlignment(SwingConstants.CENTER);
        thirdTitle.setVerticalAlignment(SwingConstants.CENTER);
        third.add(thirdTitle, BorderLayout.WEST);
        thirdTitle.setFont(new Font("굴림", Font.BOLD, 25));
        // 당도에 대한 라디오 버튼
        ButtonGroup group2 = new ButtonGroup();
        JPanel radioBtnTemp2 = new JPanel();

        sugar = new JRadioButton[5];
        for (int i = 0; i < sugar.length; i++) {
            sugar[i] = new JRadioButton(sugarStr[i]);
            sugar[i].setFont(new Font("굴림", Font.BOLD, 20));
            group2.add(sugar[i]);
            sugar[i].setHorizontalAlignment(SwingConstants.CENTER);
            sugar[i].setVerticalAlignment(SwingConstants.BOTTOM);
            radioBtnTemp2.add(sugar[i]);
            sugar[i].addItemListener(new Checked(sugar.length, sugar));
        }
        third.add(radioBtnTemp2, BorderLayout.CENTER);
        add(third);

    }

    class Checked implements ItemListener {
        int length;
        JRadioButton[] buttons;
        ArrayList<String> options = new ArrayList<>();

        public Checked(int length, JRadioButton[] var) {
            this.length = length;
            this.buttons = var;
        }

        public void itemStateChanged(ItemEvent e) {
            Object source = e.getItemSelectable();
            for (int i = 0; i < length; i++) {
                if (source == buttons[i]) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        // System.out.println(buttons[i].getText());
                        if (length == 3) {
                            oc.setIceNum(buttons[i].getText());
                        } else {
                            oc.setSugarNum(buttons[i].getText());
                        }
                    }
                }
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
