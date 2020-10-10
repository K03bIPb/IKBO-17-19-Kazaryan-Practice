package ru.rtu.main.Practice10.Classwork;

import javax.swing.*;

public class Loader {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(new MyForm().getPanel1());
    }
}
