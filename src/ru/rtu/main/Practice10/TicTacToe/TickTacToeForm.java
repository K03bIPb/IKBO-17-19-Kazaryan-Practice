package ru.rtu.main.Practice10.TicTacToe;

import ru.rtu.main.Practice10.buttonInterpreter;

import javax.swing.*;
import java.awt.event.*;

public class TickTacToeForm {
    private JPanel mainTickTacToePanel;
    private JPanel panelNorth;
    private JPanel panelCenter;
    private JPanel panelSouth;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private boolean whichPlayer; //player 1 is cross player by default and his value is false


    public TickTacToeForm() {
        setWhichPlayer(false); // 0 - cross player by default
        clickAllButtonsActions();
    }
    public JPanel getMainTickTackToePanel() {
        return mainTickTacToePanel;
    }
    private boolean isAnybodyWin(){
        //wins horizontal
        if (!button1.getText().equals("") && (button1.getText().equals(button2.getText())) &&  (button1.getText().equals(button3.getText()))){
            if (whichPlayer) System.out.println("Cross player win!");
            else System.out.println("Zero player win!");
            return true;
        }
        if (!button4.getText().equals("") && (button4.getText().equals(button5.getText())) &&  (button4.getText().equals(button6.getText()))){
            if (whichPlayer) System.out.println("Cross player win!");
            else System.out.println("Zero player win!");
            return true;
        }
        if (!button7.getText().equals("") && (button7.getText().equals(button8.getText())) &&  (button7.getText().equals(button9.getText()))){
            if (whichPlayer) System.out.println("Cross player win!");
            else System.out.println("Zero player win!");
            return true;
        }
        //wins vertical
        if (!button1.getText().equals("") && (button1.getText().equals(button4.getText())) &&  (button4.getText().equals(button7.getText()))){
            if (whichPlayer) System.out.println("Cross player win!");
            else System.out.println("Zero player win!");
            return true;
        }
        if (!button2.getText().equals("") && (button2.getText().equals(button5.getText())) &&  (button5.getText().equals(button8.getText()))){
            if (whichPlayer) System.out.println("Cross player win!");
            else System.out.println("Zero player win!");
            return true;
        }
        if (!button3.getText().equals("") && (button3.getText().equals(button6.getText())) &&  (button6.getText().equals(button9.getText()))){
            if (whichPlayer) System.out.println("Cross player win!");
            else System.out.println("Zero player win!");
            return true;
        }
        //cross wins
        if (!button1.getText().equals("") && (button1.getText().equals(button5.getText())) &&  (button5.getText().equals(button9.getText()))){
            if (whichPlayer) System.out.println("Cross player win!");
            else System.out.println("Zero player win!");
            return true;
        }
        if (!button3.getText().equals("") && (button3.getText().equals(button5.getText())) &&  (button5.getText().equals(button7.getText()))){
            if (whichPlayer) System.out.println("Cross player win!");
            else System.out.println("Zero player win!");
            return true;
        }
        return false;
    }
    private boolean getWhichPlayer(){
        return whichPlayer;
    }
    private void setWhichPlayer(boolean whichPlayer){
        this.whichPlayer = whichPlayer;
    }
    private boolean isAllFieldsFull(){
        boolean res;
        if (!button1.getText().equals("") && !button2.getText().equals("") && !button3.getText().equals("") && !button4.getText().equals("") && !button5.getText().equals("") && !button6.getText().equals("") && !button7.getText().equals("") && !button8.getText().equals("")&& !button9.getText().equals("")) {
            res = true;
            System.out.println("Tie!");
        }
        else res = false;

        return res;
    }
    private void clickAllButtonsActions(){
        clickOnTextArea(button1, () -> {
            if (button1.getText().equals("")) {

                if (!getWhichPlayer()) {
                    button1.setText("X");
                    setWhichPlayer(true);
                } else {
                    button1.setText("0");
                    setWhichPlayer(false);
                }

            }
            if (isAnybodyWin()) {
                clearAllFields();
                setWhichPlayer(false);
            }
            if(isAllFieldsFull()) {
                clearAllFields();
                setWhichPlayer(false);
            }
        });
        clickOnTextArea(button2, () -> {
            if (button2.getText().equals("")) {
                if (!getWhichPlayer()) {
                    button2.setText("X");
                    setWhichPlayer(true);
                } else {
                    button2.setText("0");
                    setWhichPlayer(false);
                }
            }
            if (isAnybodyWin()) {
                clearAllFields();
                setWhichPlayer(false);
            }
            if(isAllFieldsFull()) {
                clearAllFields();
                setWhichPlayer(false);
            }
        });
        clickOnTextArea(button3, () -> {
            if (button3.getText().equals("")) {
                if (!getWhichPlayer()) {
                    button3.setText("X");
                    setWhichPlayer(true);
                } else {
                    button3.setText("0");
                    setWhichPlayer(false);
                }
            }
            if (isAnybodyWin()) {
                clearAllFields();
                setWhichPlayer(false);
            }
            if(isAllFieldsFull()) {
                clearAllFields();
                setWhichPlayer(false);
            }
        });
        clickOnTextArea(button4, () -> {
            if (button4.getText().equals("")) {
                if (!getWhichPlayer()) {
                    button4.setText("X");
                    setWhichPlayer(true);
                } else {
                    button4.setText("0");
                    setWhichPlayer(false);
                }
            }
            if (isAnybodyWin()) {
                clearAllFields();
                setWhichPlayer(false);
            }
            if(isAllFieldsFull()) {
                clearAllFields();
                setWhichPlayer(false);
            }
        });
        clickOnTextArea(button5, () -> {
            if (button5.getText().equals("")) {
                if (!getWhichPlayer()) {
                    button5.setText("X");
                    setWhichPlayer(true);
                } else {
                    button5.setText("0");
                    setWhichPlayer(false);
                }
            }
            if (isAnybodyWin()) {
                clearAllFields();
                setWhichPlayer(false);
            }
            if(isAllFieldsFull()) {
                clearAllFields();
                setWhichPlayer(false);
            }
        });
        clickOnTextArea(button6, () -> {
            if (button6.getText().equals("")) {
                if (!getWhichPlayer()) {
                    button6.setText("X");
                    setWhichPlayer(true);
                } else {
                    button6.setText("0");
                    setWhichPlayer(false);
                }
            }
            if (isAnybodyWin()) {
                clearAllFields();
                setWhichPlayer(false);
            }
            if(isAllFieldsFull()) {
                clearAllFields();
                setWhichPlayer(false);
            }
        });
        clickOnTextArea(button7, () -> {
            if (button7.getText().equals("")) {
                if (!getWhichPlayer()) {
                    button7.setText("X");
                    setWhichPlayer(true);
                } else {
                    button7.setText("0");
                    setWhichPlayer(false);
                }
            }
            if (isAnybodyWin()) {
                clearAllFields();
                setWhichPlayer(false);
            }
            if(isAllFieldsFull()) {
                clearAllFields();
                setWhichPlayer(false);
            }
        });
        clickOnTextArea(button8, () -> {
            if (button8.getText().equals("")) {
                if (!getWhichPlayer()) {
                    button8.setText("X");
                    setWhichPlayer(true);
                } else {
                    button8.setText("0");
                    setWhichPlayer(false);
                }
            }
            if (isAnybodyWin()) {
                clearAllFields();
                setWhichPlayer(false);
            }
            if(isAllFieldsFull()) {
                clearAllFields();
                setWhichPlayer(false);
            }
        });
        clickOnTextArea(button9, () -> {
            if (button9.getText().equals("")) {
                if (!getWhichPlayer()) {
                    button9.setText("X");
                    setWhichPlayer(true);
                } else {
                    button9.setText("0");
                    setWhichPlayer(false);
                }
            }
            if (isAnybodyWin()) {
                clearAllFields();
                setWhichPlayer(false);
            }
            if(isAllFieldsFull()) {
                clearAllFields();
                setWhichPlayer(false);
            }
        });
    }
    private void clearAllFields(){
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
    }
    private void clickOnTextArea(JButton jButton, buttonInterpreter l) {
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.doIt();
            }
        });
    }
}
