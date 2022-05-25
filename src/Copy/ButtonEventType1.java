package Copy;

import java.awt.*;
//import java.awt.Graphics;
import java.awt.event.*;
//import java.awt.geom.*;
import javax.swing.*;
//import java.io.*;
//import java.util.*;

public class ButtonEventType1 {
	// �ʿ��� ������Ʈ ����
	JFrame jf;
	JPanel panel;
	JButton btn1;
	JButton btn2;

	MyListener listener = new MyListener();

	public ButtonEventType1(String msg) {
		// ������ ���� �� ����
		jf = new JFrame(msg);
		jf.setSize(300, 200);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle(msg);

		// �г�, ��ư ���� + ������ ��� + �����ӿ� add
		panel = new JPanel();

		btn1 = new JButton("Yellow");
		btn1.addActionListener(listener);
		panel.add(btn1);

		btn2 = new JButton("Pink");
		btn2.addActionListener(listener);
		panel.add(btn2);

		jf.add(panel);
		jf.setVisible(true);
	}

	// �̺�Ʈ ó��
	class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btn1) { // when btn1 pressed
				panel.setBackground(Color.YELLOW); // set background yellow
			}

			else if (e.getSource() == btn2) { // when btn2 pressed
				panel.setBackground(Color.PINK); // set background pink
			}

		}
	}
}
