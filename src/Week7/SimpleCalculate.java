package Week7;

import java.awt.*;
import java.awt.event.*;

public class SimpleCalculate {
    Frame f;
    GridBagConstraints gbc = new GridBagConstraints();
    Panel buttons;
    String btn[] = { "AC", "+/-", "%", "÷",
            "7", "8", "9", "×",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            ".", "0", "=" };
    Button button[]; // Array of functional elements components of a btn array
    TextField input;

    public SimpleCalculate() {
        f = new Frame("SimpleCalc : SSK");
        f.setLayout(new BorderLayout(2, 2));
        f.setBackground(new Color(233, 233, 233));

        input = new TextField(60);
        input.setFont(new Font("굴림", Font.BOLD, 50));
        f.add(input, BorderLayout.NORTH);

        buttons = new Panel();
        buttons.setSize(300, 400);
        gbc.insets = new Insets(3, 2, 3, 2);
        buttons.setLayout(new GridBagLayout());
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        int x = 0;
        int y = 0;
        button = new Button[btn.length];
        for (int i = 0; i < btn.length; i++) {
            button[i] = new Button(btn[i]); // Creates a button containing the i-th character of the btn array.
            button[i].setFont(new Font("Serif", Font.BOLD, 15));
            button[i].addActionListener(new CalcFunction());
            x = i % 4;

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
        f.add(buttons, BorderLayout.CENTER);

        f.setSize(350, 500);
        f.setVisible(true);

    }

    public void make(Component c, int x, int y, int w, int h) {
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.gridheight = h;

        buttons.add(c, gbc);
    }
}

class CalcFunction implements ActionListener {
    Label output;
    boolean state = false;
    double num1, num2;
    double result;
    String operator = "";
    String equal = "";

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        System.out.println(str); // str call button number

        if (str.equals("+")) {
            num1 = num2;
            operator = "+";
            equal = "";
        } else if (str.equals("÷")) {
            num1 = num2;
            operator = "÷";
            equal = "";
        } else if (str.equals("×")) {
            num1 = num2;
            operator = "×";
            equal = "";
        } else if (str.equals("-")) {
            num1 = num2;
            operator = "-";
            equal = "";

        } else if (str.equals("%")) {
            num1 = num2;
            operator = "%";
            equal = "";
            result = num1 / 100;
            output.setText(String.valueOf(result));
        } else if (str.equals("AC")) { // All Clear
            equal = "";
            num2 = 0;
            num1 = 0;
            output.setText("0");
        } else if (str.equals("=")) {
            if (operator.equals("+")) {
                result = num1 + num2;
                output.setText(String.valueOf(result));
                state = true;

            } else if (operator.equals("-")) {
                result = num1 - num2;
                output.setText(String.valueOf(result));
                state = true;

            } else if (operator.equals("×")) {
                result = num1 * num2;
                output.setText(String.valueOf(result));
                state = true;

            } else if (operator.equals("÷")) {
                result = num1 / num2;
                output.setText(String.valueOf(result));
                state = true;

            }
        } else {
            if (state) {
                output.setText("0");
                state = false;
                num1 = 0;
                num2 = 0;
                equal = "";
            }

            equal += e.getActionCommand();
            output.setText(equal);
            num2 = Double.parseDouble(equal);
        }
    }
}
