package TERMPROJECT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.HashMap;
import java.util.Set;

public class OptionCheckBottom extends JPanel {
    OptionCheck oc;
    String beverName;
    String totalNum;
    String iceNum;
    String sugarNum;
    int cost;
    JButton cancel, ok;
    HashMap<String, String> beverInfo = new HashMap<>();
    ListPanel li;
    Order or;

    public OptionCheckBottom(Order or, ListPanel li, OptionCheck oc, String beverName, int cost) {
        this.li = li;
        this.oc = oc;
        this.beverName = beverName;
        this.cost = cost;

        cancel = new JButton("취소");
        cancel.setFont(new Font("굴림", Font.PLAIN, 20));
        cancel.setBackground(Color.gray);
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("cancel");
                oc.setVisible(false);
            }
        });
        ok = new JButton("확인");
        ok.setFont(new Font("굴림", Font.PLAIN, 20));
        ok.setBackground(Color.gray);
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("OK");
                // oc 객체의 정보를 전달 -> saveOption 클래스로 정보 전달
                oc.setVisible(false);
                totalNum = oc.getTotalNum();
                iceNum = oc.getIceNum();
                sugarNum = oc.getSugarNum();

                beverInfo.put(beverName, Integer.toString(cost));
                beverInfo.put("주문 수량", totalNum);
                beverInfo.put("얼음량", iceNum);
                beverInfo.put("당도", sugarNum);
                // printBeverInfo();
                new BuyList(li, beverName, beverInfo);
                or.drawPanel(new BottomPanel(li));
                new RepaintBottomPanel(li);
                System.out.println("OCBottom end");

            }
        });

        add(cancel);
        add(ok);

    }

    public void printBeverInfo() {
        Set<String> keySet = beverInfo.keySet();
        for (String key : keySet) {
            System.out.println(key + " : " + beverInfo.get(key));
        }
    }

}
