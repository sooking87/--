package Copy;

import java.awt.*;
//import java.awt.Graphics;
import java.awt.event.*;
//import java.awt.geom.*;
import javax.swing.*;
//import java.io.*;
//import java.util.*;

public class ButtonEventType3 extends JPanel implements ActionListener {
	// ������Ʈ ����
	// double a, b, c;
	JButton[][] buttons = new JButton[3][3];
	char[][] board = new char[3][3];
	private char turn = 'X';

	public ButtonEventType3() {
		setLayout(new GridLayout(3, 3, 5, 5)); // ���̾ƿ� ����
		Font f = new Font("Dialog", Font.ITALIC, 50); // ��Ʈ����

		// ��ư ���� + ������ ���
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				buttons[i][j] = new JButton(" ");
				buttons[i][j].setFont(f);
				buttons[i][j].addActionListener(this);
				add(buttons[i][j]);
			}
		}
	}

	// �̺�Ʈ ó��
	@Override
	public void actionPerformed(ActionEvent e) {
		// ������ ���鼭 �ƹ��͵� ������ ���� Ŭ���� ��ư���� �˾Ƴ�
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (e.getSource() == buttons[i][j]
						&& buttons[i][j].getText().equals(" ") == true) {
					if (turn == 'X') { // X�����̸�
						buttons[i][j].setText("X"); // X ���
						turn = 'O'; // �״����� O�� ������ ���� �������� �ٲ���
					} else {
						buttons[i][j].setText("O"); // O����
						turn = 'X'; // �״����� X�� ������ ���� �������� �ٲ���
					}
				}
			}
		}
	}
}
