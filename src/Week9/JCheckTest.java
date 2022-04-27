package Week9;

import javax.swing.*;

public class JCheckTest {
    JFrame jf;
    JCheckBox major, submajor, interdis;

    JRadioButton fre, sop, jun, sen;
    JToggleButton onoff;

    public JCheckTest(String msg) {
        // Frame 생성
        jf = new JFrame(msg);

        // Check Box
        major = new JCheckBox("Major", true);
        submajor = new JCheckBox("SubMajor", false);
        interdis = new JCheckBox("Interdis", false);

        // Radio Button
        fre = new JRadioButton("FreshMan", true);
        sop = new JRadioButton("Sophomore", false);
        jun = new JRadioButton("Junior", false);
        sen = new JRadioButton("Senior", false);

        // Radio Button 그룹
        ButtonGroup bg = new ButtonGroup();
        bg.add(fre);
        bg.add(sop);
        bg.add(jun);
        bg.add(sen);

        // Toggle
        onoff = new JToggleButton("On/Off");

        // Frame에 부착
        JPanel jp1 = new JPanel();
        jp1.add(major);
        jp1.add(submajor);
        jp1.add(interdis);

        JPanel jp2 = new JPanel();
        jp2.add(fre);
        jp2.add(sop);
        jp2.add(jun);
        jp2.add(sen);

        jf.getContentPane().add("North", jp1);
        jf.getContentPane().add("Center", jp2);
        jf.getContentPane().add("South", onoff);

        // Frame 크기 및 붙히기
        jf.setSize(600, 600);
        jf.setVisible(true);

    }
}
