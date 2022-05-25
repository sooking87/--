package Week12;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HWCalwithEvent implements ActionListener {
    JFrame jf;
    Panel buttons;
    GridBagConstraints gbc = new GridBagConstraints(); // add cells
    String btn[] = { "AC", "+/-", "%", "÷",
            "7", "8", "9", "×",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            ".", "0", "=" };
    JButton button[]; // Array of functional elements components of a btn array

    JTextField output; // 연산 결과창
    boolean state = false; // 숫자 인지 아닌지 확인
    String num1 = "", num2 = "";
    double result; // 연산 결과
    String operator = ""; // 연산자 저장용
    String nInput = ""; // 입력받은 문자열
    JButton opBtn; // 연산자의 이벤트 소스를 저장하는 변수 -> 버튼 색깔 변화를 위해서

    public HWCalwithEvent() {
        jf = new JFrame("Calculator with Event :: SSK");
        jf.setLayout(new BorderLayout(2, 2));
        jf.setBackground(new Color(233, 233, 233));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        output = new JTextField(60);
        output.setHorizontalAlignment(JTextField.RIGHT);
        output.setFont(new Font("굴림", Font.BOLD, 50));
        jf.add(output, BorderLayout.NORTH);

        buttons = new Panel();
        buttons.setSize(300, 400);
        gbc.insets = new Insets(3, 2, 3, 2);
        buttons.setLayout(new GridBagLayout());
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        // 버튼의 위치를 맞춰줄 변수
        int x = 0;
        int y = 0;

        button = new JButton[btn.length];
        for (int i = 0; i < btn.length; i++) {
            // Creates a button containing the i-th character of the btn array.
            button[i] = new JButton(btn[i]);
            button[i].setFont(new Font("Serif", Font.BOLD, 15));
            button[i].addActionListener(this);
            x = i % 4; // 열이 4이므로 버튼의 배치를 위해서 4로 나눈 나머지를 x라고 함

            // Conditional statement for adding color to a button
            if (i == 0) {
                button[i].setBackground(new Color(255, 123, 111));
            } else if (i == 1 || i == 2 || i == 3 || i == 7 || i == 11 || i == 15 || i == 18) {
                button[i].setBackground(new Color(191, 205, 232));
            } else {
                button[i].setBackground(new Color(192, 192, 192));
            }

            // At the end = conditional statement to create a button
            if (i == 18) {
                make(button[i], x, y, 2, 1);
                break;
            }

            // Code to create a button
            make(button[i], x, y, 1, 1);

            // Conditional statement for adjusting the coordinates of the button
            if (x == 3) {
                y++;
            }
        }

        jf.add(buttons, BorderLayout.CENTER);

        jf.setSize(350, 500);
        jf.setVisible(true);
    }

    public void make(Component c, int x, int y, int w, int h) {
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.gridheight = h;

        buttons.add(c, gbc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton tempBtn = (JButton) e.getSource(); // 숫자든 연산자든 일단 버튼의 정보를 불러와서 tempBtn 변수에 저장

        nInput = tempBtn.getText(); // tempBtn의 버튼 문자 정보를 nInput에 저장

        // 숫자인 경우
        if ((nInput.charAt(0) >= '0' && nInput.charAt(0) <= '9') || nInput.charAt(0) == '.') {
            if (operator.equals("")) {
                num1 += nInput;
                output.setText(num1);
            } else {
                num2 += nInput;
                output.setText(num2);
            }
        } else if (nInput.charAt(0) == '=') { // = 연산자인 경우

            // 사치 연산에 따라 계산 -> setText();
            if (operator.equals("+")) { // 더하기
                result = (Double.parseDouble(num1) + Double.parseDouble(num2));
            } else if (operator.equals("-")) { // 빼기
                result = (Double.parseDouble(num1) - Double.parseDouble(num2));
            } else if (operator.equals("×")) { // 곱하기
                result = (Double.parseDouble(num1) * Double.parseDouble(num2));
            } else { // 나누기
                result = (Double.parseDouble(num1) / Double.parseDouble(num2));
            }

            // 결과 값 출력
            // setText를 통해서 결과창의 Text를 변화
            output.setText(Double.toString(result));

            num1 = Double.toString(result); // 앞 수식의 결과는 num1에 남겨놓습니다.

            operator = num2 = ""; // 그 외의 연산자와 두 번째 피연산자는 초기화
            // 기존 버튼 색과 글씨 색깔로 맞춥니다.
            opBtn.setBackground(new Color(191, 205, 232));
            opBtn.setForeground(Color.BLACK);

        } else if (nInput.equals("AC")) {
            num1 = num2 = ""; // 모든 값 초기화
            operator = "";
            output.setText("");

        } else if (nInput.equals("C")) {
            num1 = num1.substring(0, num1.length() - 1); // substirng(startIdx, endIdx) : start ~ end 까지 잘라줍니다.
            output.setText(num1);

        } else if (nInput.equals("+/-")) { // +인 경우 -로, -인 경우는 +로 바꿔주는 연산자
            num1 = Double.toString(-1 * Double.parseDouble(num1));
            output.setText(num1);

        } else if (nInput.equals("%")) { // % 연산
            num1 = Double.toString(Double.parseDouble(num1) * 0.01);
            output.setText(num1);
        } else { // 사칙 연산인 경우
            opBtn = tempBtn; // 연산자의 Source를 저장
            operator = tempBtn.getText(); // 연산자 저장
            // 연산자 버튼이 눌리면 색깔을 다르게 만들어 줍니다.
            opBtn.setBackground(new Color(255, 201, 14));
        }

        // 입력이 주어지면 AC(All Clear) 을 C(Clear)로 바꾸어줍니다.
        if (num1 != "") {
            button[0].setText("C"); // button[0]은 AC 버튼입니다.
        } else {
            button[0].setText("AC"); // 첫 번째 입력값도 없다면 다시 AC 버튼으로 바꾸어줍니다.
        }
    }
}