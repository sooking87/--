
package Week7;

import java.awt.*;

public class KnowGridBagAxis {
    Frame f;
    Button b1, b2, b3, b4, b5, b6, b7;
    GridBagConstraints gbc = new GridBagConstraints();

    public KnowGridBagAxis() {
        f = new Frame("GridBag Practice");
        f.setSize(500, 500);
        f.setLayout(new GridBagLayout()); // GridBagLayout calls GridBagConstraints Object

        b1 = new Button("Button1");
        gbc.gridx = 0; // x postion is 0
        gbc.gridy = 0; // y position is 0

        f.add(b1, gbc);

        b2 = new Button("Button2");
        gbc.gridx = 1; // x postion is 1
        gbc.gridy = 1; // y position is 1

        f.add(b2, gbc);

        b3 = new Button("Button3");
        gbc.gridx = 2; // x postion is 2
        gbc.gridy = 2;

        f.add(b3, gbc);

        b4 = new Button("Button4");
        gbc.gridx = 3; // x postion is 3
        gbc.gridy = 3; // y position is 3

        f.add(b4, gbc);

        b5 = new Button("Button5");
        gbc.gridx = 4; // x postion is 4
        gbc.gridy = 4; // y position is 4

        f.add(b5, gbc);

        b6 = new Button("Button6");
        gbc.gridx = 3;
        gbc.gridy = 6;

        f.add(b6, gbc);

        b7 = new Button("Button7");
        gbc.gridx = 2;
        gbc.gridy = 7;

        f.add(b7, gbc);

        f.setVisible(true);
    }
}
