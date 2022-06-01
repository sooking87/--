
package Week12;

import javax.swing.*;

public class TextureTest extends JFrame {
    public TextureTest() {
        setSize(900, 900);
        setTitle("Java 2D TexturePanel Test :: SSK");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new TexturePanel();
        add(panel);
        setVisible(true);
    }
}
