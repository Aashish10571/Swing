import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField screen;
    JPanel panel;
    JButton[] numButtons = new JButton[10];
    JButton[] funButtons = new JButton[6];
    JButton addButton, subButton, mulButton, divButton, dotButton, equButton, clrButton, delButton;
    Font myFont = new Font("JetBrains Mono", Font.BOLD, 40);
    Border myBorder = BorderFactory.createLineBorder(Color.BLACK, 2, true);
    String textNum = "";
    double num1, num2, result, temp;
    char operator;
    boolean sign = false;

    Calculator() {
        screen = new JTextField(textNum);
        screen.setBounds(30, 20, Variable.SCREEN_WIDTH, Variable.SCREEN_HEIGHT);
        screen.setHorizontalAlignment(JTextField.RIGHT);
        screen.setFont(myFont);
        screen.setEditable(false);
        screen.setFocusable(false);
        screen.setBorder(myBorder);

        for (int i = 0; i < 10; i++) {
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].setFocusable(false);
            numButtons[i].setFont(myFont);
            numButtons[i].setBorder(myBorder);
            numButtons[i].addActionListener(this);
        }

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        dotButton = new JButton(".");
        equButton = new JButton("=");

        funButtons[0] = addButton;
        funButtons[1] = subButton;
        funButtons[2] = mulButton;
        funButtons[3] = divButton;
        funButtons[4] = dotButton;
        funButtons[5] = equButton;

        for (int i = 0; i < 6; i++) {
            funButtons[i].setFont(myFont);
            funButtons[i].setBorder(myBorder);
            funButtons[i].addActionListener(this);
            funButtons[i].setFocusable(false);
        }

        panel = new JPanel();
        panel.setBounds(30, 140, Variable.PANEL_WIDTH, Variable.PANEL_HEIGHT);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.add(numButtons[7]);
        panel.add(numButtons[8]);
        panel.add(numButtons[9]);
        panel.add(funButtons[3]);
        panel.add(numButtons[4]);
        panel.add(numButtons[5]);
        panel.add(numButtons[6]);
        panel.add(funButtons[2]);
        panel.add(numButtons[1]);
        panel.add(numButtons[2]);
        panel.add(numButtons[3]);
        panel.add(funButtons[1]);
        panel.add(funButtons[4]);
        panel.add(numButtons[0]);
        panel.add(funButtons[0]);
        panel.add(funButtons[5]);


        clrButton = new JButton("clear");
        clrButton.setBounds(30, 490, Variable.BUTTON_WIDTH, Variable.BUTTON_HEIGHT);
        clrButton.setBorder(myBorder);
        clrButton.setFocusable(false);
        clrButton.setFont(myFont);
        clrButton.addActionListener(this);

        delButton = new JButton("del");
        delButton.setBounds(230, 490, Variable.BUTTON_WIDTH, Variable.BUTTON_HEIGHT);
        delButton.setBorder(myBorder);
        delButton.setFocusable(false);
        delButton.setFont(myFont);
        delButton.addActionListener(this);

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Variable.FRAME_WIDTH, Variable.FRAME_HEIGHT);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.add(screen);
        frame.add(panel);
        frame.add(clrButton);
        frame.add(delButton);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public void calculate() {
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numButtons[i]) {
                textNum += String.valueOf(i);
                screen.setText(textNum);
            }
        }

        if (e.getSource() == addButton) {
            sign = true;
            operator = '+';
            num1 = Double.parseDouble(screen.getText());
            if (sign) {
                num1 += temp;
                temp = num1;
            }
            textNum = "";
            screen.setText(textNum);
        }

        if (e.getSource() == subButton) {
            sign = true;
            operator = '-';
            num1 = Double.parseDouble(screen.getText());
            if (sign) {
                num1 -= temp;
                temp = num1;
            }
            textNum = "";
            screen.setText(textNum);
        }

        if (e.getSource() == mulButton) {
            sign = true;
            operator = '*';
            num1 = Double.parseDouble(screen.getText());
            if (sign) {
                num1 *= temp;
                temp = num1;
            }
            textNum = "";
            screen.setText(textNum);
        }

        if (e.getSource() == divButton) {
            sign = true;
            operator = '/';
            num1 = Double.parseDouble(screen.getText());
            if (sign) {
                num1 /= temp;
                temp = num1;
            }
            textNum = "";
            screen.setText(textNum);
        }

        if (e.getSource() == dotButton) {
            textNum += ".";
            screen.setText(textNum);
        }

        if (e.getSource() == clrButton) {
            num1 = 0;
            num2 = 0;
            result = 0;
            temp = 0;

            sign = false;

            textNum = "";
            screen.setText(textNum);
        }

        if (e.getSource() == delButton) {
            String temp = "";
            for (int i = 0; i < textNum.length() - 1; i++) {
                temp += textNum.charAt(i);
            }
            screen.setText(temp);
            textNum = temp;
        }

        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(screen.getText());
            calculate();
            screen.setText(String.valueOf(result));
            num1 = result;
            sign = false;
            temp = 0;
        }
    }
}
