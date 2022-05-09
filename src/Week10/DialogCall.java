package Week10;

import java.awt.event.*;
import javax.swing.*;

public class DialogCall extends JFrame {
    MyDialog dialog;
    JButton btn;

    public DialogCall() {
        super("Jdialog Example :: SSK");
        btn = new JButton("Show Dialog");
        dialog = new MyDialog(this, "Test Dialog");

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);
            }
        });

        getContentPane().add(btn);
        setSize(300, 300);
        setVisible(true);
    }

}
