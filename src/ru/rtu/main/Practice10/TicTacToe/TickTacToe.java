package ru.rtu.main.Practice10.TicTacToe;


import javax.swing.*;

public class TickTacToe {
        public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.setVisible(true);
            frame.setSize(700, 365);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.add(new TickTacToeForm().getMainTickTackToePanel());
        }

}
