package ru.rtu.main.Practice10.Calc;

import javax.swing.*;

public class Calc {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(new CalcForm().getMainCalcPanel());


    }
}
