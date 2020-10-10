package ru.rtu.main.Practice10.Calc;

import javax.swing.*;
import java.awt.event.*;

public class CalcForm {
    private JButton plus;
    private JButton minus;
    private JButton divide;
    private JButton multiply;
    private JPanel operationsPanel;
    private JPanel mainCalcPanel;
    private JTextField calcField;
    double a;
    double b;
    boolean check;

    public JPanel getMainCalcPanel() {
        return mainCalcPanel;

    }

    CalcForm() {


        calcField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if ((e.getKeyCode() == KeyEvent.VK_ENTER) && (calcField.getText() != null) && (a == 0)) {
                    try {
                        a = Double.parseDouble(calcField.getText());
                    } catch (Exception error) {
                        System.out.println("Only numbers are allowed in calc!");
                    }
                    calcField.setText("");
                } else if ((e.getKeyCode() == KeyEvent.VK_ENTER) && (calcField.getText() != null)) {
                    try {
                        b = Double.parseDouble(calcField.getText());
                    } catch (Exception error) {
                        System.out.println("Only numbers are allowed in calc!");
                    }
                    calcField.setText("");
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {

            }
        });


        clickButton(plus, () -> {
            calcField.setText(String.valueOf(a + b));
        });
        clickButton(minus, () -> {
            calcField.setText(String.valueOf(a - b));
        });
        clickButton(multiply, () -> {
            calcField.setText(String.valueOf(a * b));
        });
        clickButton(divide, () -> {
            calcField.setText(String.valueOf(a / b));
        });


    }

    public void clickButton (JButton button, buttonInterpreter l)
    {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.doIt();
            }
        });
    }
}
