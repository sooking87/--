package TERMPROJECT;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Set;

public class BuyList extends JPanel {
    Order or;
    // 상품 + 선택 옵션 + 개수 버튼 패널 + 총 가격 + 삭제 버튼이 있는 패널
    HashMap<String, String> eachList = new HashMap<>();
    ListPanel li;
    JPanel list;
    JLabel beverName; // 상품 라벨
    String cost;
    JPanel selectedOption; // 선택 옵션
    JLabel ice; // 선택 옵션 1
    JLabel sugar; // 선택 옵션 2
    JPanel totalNumPanel; // 개수 버튼 패널(1행 3열)
    JLabel count, textCount;
    JLabel addCost;
    // 삭제 버튼
    JButton delete;
    // 정보 전달: 주문 수량. 전체 수량
    int eachNum = 0;
    int dilNum = 0;
    int eachCost = 0;
    int dilCost = 0;

    public BuyList(Order or, ListPanel li, String bn, HashMap<String, String> each) {
        this.or = or;
        this.li = li;
        list = new JPanel();
        list.setLayout(new GridLayout(1, 5, 50, 30));

        this.beverName = new JLabel(bn, JLabel.CENTER);
        eachList = each;
        Set<String> keySet = eachList.keySet();
        for (String key : keySet) {
            System.out.println(key + " : " + eachList.get(key));
            if (key.equals(beverName.getText())) {
                eachCost = Integer.parseInt(eachList.get(key));
                System.out.println("key가 " + beverName + "인 경우: eachCost -> " + eachCost);
                cost = eachList.get(key);
            } else if (key.equals("주문 수량")) {
                dilNum += Integer.parseInt(eachList.get(key));
                eachNum = Integer.parseInt(eachList.get(key));
                System.out.println("key가  주문 수량인 경우: eachNum -> " + eachNum);
                count = new JLabel(eachList.get(key), JLabel.CENTER);
            } else if (key.equals("얼음량")) {
                System.out.println("key가 얼음량인 경우");
                ice = new JLabel(eachList.get(key), JLabel.CENTER);

            } else {
                System.out.println("key가 당도인 경우");
                sugar = new JLabel(eachList.get(key), JLabel.CENTER);
            }
        }
        dilCost += eachNum * eachCost;
        System.out.println("BuyList: dilCost -> " + dilCost);
        list.add(beverName);
        // 선택 옵션
        selectedOption = new JPanel();
        selectedOption.setLayout(new GridLayout(2, 2, 20, 30));
        selectedOption.add(new JLabel("얼음량", JLabel.CENTER));
        selectedOption.add(ice);
        selectedOption.add(new JLabel("당도", JLabel.CENTER));
        selectedOption.add(sugar);
        list.add(selectedOption);

        // 수량 버튼
        totalNumPanel = new JPanel();
        totalNumPanel.setLayout(new GridLayout(1, 2));

        textCount = new JLabel("수량", JLabel.CENTER);
        totalNumPanel.add(textCount);
        totalNumPanel.add(count);
        list.add(totalNumPanel);

        // 가격

        addCost = new JLabel(Integer.toString(eachNum * eachCost), JLabel.CENTER);
        list.add(addCost);
        list.setBackground(Color.GRAY);
        setSize(500, 100);
        System.out.println("BuyList size: " + list.getWidth() + " " + list.getHeight());
        add(list);

        li.addList(or, this, dilNum, dilCost);
    }
}
