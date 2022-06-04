package TERMPROJECT;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class OptionCheck extends JDialog {
    String fileName;
    String beverName;
    int cost;
    String totalNum;
    String iceNum;
    String sugarNum;

    public OptionCheck() {
        // super(new IntroFrame(), title);
        setLayout(new BorderLayout());

        // setFont(new Font("굴림", Font.ITALIC, 100));
        setSize(500, 800);
    }

    public void setName(String fileName) {
        this.fileName = fileName;
    }

    public String getName() {
        return fileName;
    }

    public void setBeverName(String beverName) {
        this.beverName = beverName;
    }

    public String getBeverName() {
        return beverName;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setTotalNum(String totalNum) {
        this.totalNum = totalNum;
    }

    public String getTotalNum() {
        return totalNum;
    }

    public void setIceNum(String iceNum) {
        this.iceNum = iceNum;
    }

    public String getIceNum() {
        return iceNum;
    }

    public void setSugarNum(String sugarNum) {
        this.sugarNum = sugarNum;
    }

    public String getSugarNum() {
        return sugarNum;
    }
}
