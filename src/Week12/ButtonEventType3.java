
package Week12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonEventType3 extends JPanel implements ActionListener {
    // double a, b, c;
    JButton[][] buttons = new JButton[3][3];
    char[][] board = new char[3][3];
    private char turn = 'X';

    public ButtonEventType3() {
        setLayout(new GridLayout(3, 3, 5, 5)); // GridLayout 설정
        Font f = new Font("Dialog", Font.ITALIC, 50);

        // 버튼 생성 2중 for문
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton(" ");
                buttons[i][j].setFont(f);
                buttons[i][j].addActionListener(this);
                add(buttons[i][j]);
            }
        }
    }

    // 버튼 이벤트 함수
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // 버튼이 빈 버튼 인경우
                if (e.getSource() == buttons[i][j]
                        && buttons[i][j].getText().equals(" ") == true) {
                    if (turn == 'X') { // i행 j열을 X로 바꿈
                        buttons[i][j].setText("X");
                        turn = 'O'; // turn을 O으로 바꿈
                    } else {
                        buttons[i][j].setText("O"); // i행 j열을 O로 바꿈
                        turn = 'X'; // turn을 X로 바꿈
                    }
                }
            }
        }
    }
}
