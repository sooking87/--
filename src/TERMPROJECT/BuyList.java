package TERMPROJECT;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.HashMap;
import java.util.Set;

public class BuyList extends JPanel {
    // 상품 + 선택 옵션 + 개수 버튼 패널 + 총 가격 + 삭제 버튼이 있는 패널
    HashMap<String, String> eachList = new HashMap<>();
    ListPanel li;
    JPanel list;
    JLabel beverName; // 상품 라벨
    String cost;
    JPanel selectedOption; // 선택 옵션
    JLabel ice; // 선택 옵션 1
    JLabel sugar; // 선택 옵션 2
    JPanel upDownPanel; // 개수 버튼 패널(1행 3열)
    JLabel count;
    JButton up, down;
    JLabel addCost;
    // 삭제 버튼
    JButton delete;

    public BuyList(ListPanel li, String bn, HashMap<String, String> each) {
        this.li = li;
        setLayout(new GridLayout(1, 5));
        this.beverName = new JLabel(bn);
        eachList = each;
        Set<String> keySet = eachList.keySet();
        for (String key : keySet) {
            System.out.println(key + " : " + eachList.get(key));
            if (key.equals(beverName)) {
                System.out.println("key가 " + beverName + "인 경우");
                cost = eachList.get(key);
            } else if (key.equals("주문 수량")) {
                System.out.println("key가  주문 수량인 경우");
                count = new JLabel(eachList.get(key));
            } else if (key.equals("얼음량")) {
                System.out.println("key가 얼음량인 경우");
                ice = new JLabel(eachList.get(key));

            } else {
                System.out.println("key가 당도인 경우");
                sugar = new JLabel(eachList.get(key));
            }
        }
        add(beverName);
        // 선택 옵션
        selectedOption = new JPanel();
        selectedOption.setLayout(new GridLayout(2, 2));
        selectedOption.add(new JLabel("얼음량"));
        selectedOption.add(ice);
        selectedOption.add(new JLabel("당도"));
        selectedOption.add(sugar);
        add(selectedOption);

        // 수량 버튼
        upDownPanel = new JPanel();
        upDownPanel.setLayout(new GridLayout(1, 3));
        down = new JButton(" - ");
        down.setBackground(new Color(205, 54, 41));
        upDownPanel.add(down);
        upDownPanel.add(count);
        up = new JButton(" + ");
        up.setBackground(new Color(68, 103, 151));
        upDownPanel.add(up);
        add(upDownPanel);

        // 가격
        addCost = new JLabel("가격");
        add(addCost);

        li.addList(this);
        setBackground(Color.DARK_GRAY);

    }

}
