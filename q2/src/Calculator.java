import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener, FocusListener, KeyListener {

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[5];
    JButton addButton, subtractButton, multiplyButton, divideButton, equalButton;
    JPanel panel;

    Font font = new Font("Arial", Font.BOLD, 20);

    double number1, number2, result;
    char operation;

    public Calculator() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("Calculator");
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField();
        textField.setFont(font);
        textField.addFocusListener(this);
        textField.addKeyListener(this);
        frame.add(textField, BorderLayout.NORTH);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        frame.add(panel, BorderLayout.CENTER);

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(font);
        }

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        equalButton = new JButton("=");

        functionButtons[0] = addButton;
        functionButtons[1] = subtractButton;
        functionButtons[2] = multiplyButton;
        functionButtons[3] = divideButton;
        functionButtons[4] = equalButton;

        for (int i = 0; i < 5; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(font);
        }

        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(divideButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(multiplyButton);
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(subtractButton);
        panel.add(numberButtons[0]);
        panel.add(equalButton);
        panel.add(addButton);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText() + i);
            }
        }

        for (int i = 0; i < 5; i++) {
            if (e.getSource() == functionButtons[i]) {
                if (i != 4) {
                    number1 = Double.parseDouble(textField.getText());
                    textField.setText("");
                    switch (i) {
                        case 0:
                            operation = '+';
                            break;
                        case 1:
                            operation = '-';
                            break;
                        case 2:
                            operation = '*';
                            break;
                        case 3:
                            operation = '/';
                            break;
                    }
                } else {
                    if (!textField.getText().isEmpty()) {
                        number2 = Double.parseDouble(textField.getText());
                        calculate();
                    }
                }
            }
        }
    }

    private void calculate() {
        try {
            switch (operation) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    if (number2 != 0) {
                        result = number1 / number2;
                    } else {
                        textField.setText("Error: Division by zero");
                        return;
                    }
                    break;
            }
            textField.setText(String.valueOf(result));
        } catch (Exception ex) {
            textField.setText("Error");
        }
    }

    public void focusGained(FocusEvent e) {
    }

    public void focusLost(FocusEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!textField.getText().isEmpty()) {
                number2 = Double.parseDouble(textField.getText());
                calculate();
            }
        }
    }

    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        new Calculator();
    }
}