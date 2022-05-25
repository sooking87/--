
package Week12;

import javax.swing.*;

public class TextureTest extends JFrame {
    public TextureTest() {
        setSize(300, 330);
        setTitle("Java 2D TexturePanel Test :: SSK");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new TexturePanel();
        add(panel);
        setVisible(true);
    }
}
