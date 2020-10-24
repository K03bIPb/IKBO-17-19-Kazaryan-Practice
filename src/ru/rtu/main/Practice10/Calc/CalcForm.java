package ru.rtu.main.Practice10.Calc;

import ru.rtu.main.Practice10.buttonInterpreter;

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
    private JButton modDivide;
    private JTextArea consoleArea;
    double a;
    double b;
    boolean newCalc = Boolean.FALSE;


    public JPanel getMainCalcPanel() {
        return mainCalcPanel;

    }

    public void printIntro(){
        consoleArea.setText("K03bIPb's calc:\n Just a small calc. \n Print first value then press enter then press second then press enter again.\n If you want to calc anything else press enter again to reset");
    }

    CalcForm() {
        printIntro();
        calcField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if ((e.getKeyCode() == KeyEvent.VK_ENTER) && (calcField.getText() != null) && (a == 0)) {
                    try {
                        a = Double.parseDouble(calcField.getText());
                        consoleArea.setText(consoleArea.getText() + "\n" + calcField.getText());
                    } catch (Exception error) {
                        consoleArea.setText(consoleArea.getText() + "\nOnly numbers are allowed in calc!");
                    }
                    calcField.setText("");
                } else if ((e.getKeyCode() == KeyEvent.VK_ENTER) && (calcField.getText() != null) && (b == 0)) {
                    try {
                        b = Double.parseDouble(calcField.getText());
                        consoleArea.setText(consoleArea.getText() + "\n" + calcField.getText());
                    } catch (Exception error) {
                        consoleArea.setText(consoleArea.getText() + "\nOnly numbers are allowed in calc!");
                    }
                    calcField.setText("");
                } else if ((e.getKeyCode() == KeyEvent.VK_ENTER) && (newCalc)){
                    a = 0;
                    b = 0;
                    calcField.setText("");
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {

            }

        });


        clickButton(plus, () -> {
            calcField.setText(String.valueOf(a + b));
            newCalc = true;
            consoleArea.setText(consoleArea.getText() + "\n" + "+");
            consoleArea.setText(consoleArea.getText() + "\n" + calcField.getText() +  "\n");
        });
        clickButton(minus, () -> {
            calcField.setText(String.valueOf(a - b));
            newCalc = true;
            consoleArea.setText(consoleArea.getText() + "\n" + "-");
            consoleArea.setText(consoleArea.getText() + "\n" + calcField.getText() +  "\n");
        });
        clickButton(multiply, () -> {
            calcField.setText(String.valueOf(a * b));
            newCalc = true;
            consoleArea.setText(consoleArea.getText() + "\n" + "*");
            consoleArea.setText(consoleArea.getText() + "\n" + calcField.getText() +  "\n");
        });
        clickButton(divide, () -> {
            calcField.setText(String.valueOf(a / b));
            newCalc = true;
            consoleArea.setText(consoleArea.getText() + "\n" + "/");
            consoleArea.setText(consoleArea.getText() + "\n" + calcField.getText() +  "\n");
        });
        clickButton(modDivide, () -> {
            calcField.setText(String.valueOf(a % b));
            newCalc = true;
            consoleArea.setText(consoleArea.getText() + "\n" + "%");
            consoleArea.setText(consoleArea.getText() + "\n" + calcField.getText() +  "\n");
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
