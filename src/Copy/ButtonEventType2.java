package Copy;

import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
//import java.awt.geom.*;
import javax.swing.*;
//import java.io.*;
//import java.util.*;

public class ButtonEventType2 extends JPanel implements ActionListener {
	boolean flag = false;
	private int light = 0;

	public ButtonEventType2() {
		setLayout(new BorderLayout());
		setVisible(true);
		setSize(getPreferredSize());

		// ��ȣ�� �� ��ư ���� �� ������ ���, ����
		JButton b = new JButton("traffic light");
		b.addActionListener(this);
		add(b, BorderLayout.SOUTH);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// ��ȣ�� �׷��ֱ�
		g.setColor(Color.BLACK);
		g.drawOval(100, 100, 100, 100);
		g.drawOval(100, 200, 100, 100);
		g.drawOval(100, 300, 100, 100);

		// ������
		if (light == 0) {
			g.setColor(Color.RED);
			g.fillOval(100, 100, 100, 100);
		}
		// �ʷϺ�
		else if (light == 1) {
			g.setColor(Color.GREEN);
			g.fillOval(100, 200, 100, 100);
		}
		// �����
		else {
			g.setColor(Color.ORANGE);
			g.fillOval(100, 300, 100, 100);
		}
	}

	public void actionPerformed(ActionEvent arg0) {
		if (++light >= 3) // ��ư ���� ������ light�� 1����, �����(2)�� �Ǹ� ���������� light=3�� �Ǹ鼭
			light = 0; // �ٽ� ������(0)�� ���ư�
		repaint();
	}
}
