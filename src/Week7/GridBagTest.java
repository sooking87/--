package Week7;

import java.awt.*;

public class GridBagTest extends Frame {
    Button b1, b2, b3, b4, b5, b6, b7;

    public GridBagTest() {
        super("GridBag Test");
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints constraint = new GridBagConstraints();
        setLayout(gridbag);

        constraint.fill = GridBagConstraints.BOTH;
        // constraint.weightx = 0.0;

        b1 = new Button("Button1");
        gridbag.setConstraints(b1, constraint);
        add(b1);

        b2 = new Button("Button2");
        gridbag.setConstraints(b2, constraint);
        add(b2);

        constraint.gridwidth = GridBagConstraints.REMAINDER;
        b3 = new Button("Button3");
        gridbag.setConstraints(b3, constraint);
        add(b3);

        constraint.gridwidth = 2;
        constraint.gridheight = 3;
        b4 = new Button("Button4");
        gridbag.setConstraints(b4, constraint);
        add(b4);

        constraint.gridwidth = GridBagConstraints.REMAINDER;
        constraint.gridheight = 1;
        constraint.weighty = 1.0;
        b5 = new Button("Button5");
        gridbag.setConstraints(b5, constraint);
        add(b5);

        b6 = new Button("Button6");
        gridbag.setConstraints(b6, constraint);
        add(b6);

        b7 = new Button("Button7");
        gridbag.setConstraints(b7, constraint);
        add(b7);
        pack(); // 컴포넌트들이 올라간 후의 최소 윈도우 크기
        setVisible(true);
    }
}
