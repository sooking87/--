package Week7;

import java.awt.*;
import java.awt.Insets;

public class GridBagPrac {
    Frame f;
    Button b1, b2, b3, b4, b5, b6, b7;
    GridBagConstraints gbc = new GridBagConstraints();

    public GridBagPrac() {
        f = new Frame("GridBag Practice");
        f.setSize(500, 500);

        gbc.insets = new Insets(5, 5, 5, 5); // like padding, (top, left, bottom, right)

        f.setLayout(new GridBagLayout()); // GridBagLayout calls GridBagConstraints Object
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 0.0;

        b1 = new Button("Button1");
        make(b1, 0, 0, 1, 10);

        b2 = new Button("Button2");
        make(b2, 1, 0, 1, 1);

        b3 = new Button("Button3");
        make(b3, 2, 0, 1, 1);

        b4 = new Button("Button4");
        make(b4, 3, 0, 1, 1);

        b5 = new Button("Button5");
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        make(b5, 4, 0, 1, 1);

        b6 = new Button("Button6");
        gbc.gridheight = GridBagConstraints.REMAINDER;
        make(b6, 1, 9, 4, 1);

        b7 = new Button("Button7");
        make(b7, 2, 8, 3, 1);

        f.setVisible(true);
    }

    public void make(Component c, int x, int y, int w, int h) {
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.gridheight = h;

        f.add(c, gbc);
    }
}
