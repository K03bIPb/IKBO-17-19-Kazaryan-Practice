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
    private JButton gameModeP1P2;
    private JButton statsButton;
    private JButton gameModeAI;
    public int cross;
    public int zero;
    public int tie;
    private boolean whichPlayer; //player 1 is cross player by default and his value is false
    JButton[] buttons = new JButton[9];
    public void fillButtonsMas(){
        buttons[0] = button1;
        buttons[1] = button2;
        buttons[2] = button3;
        buttons[3] = button4;
        buttons[4] = button5;
        buttons[5] = button6;
        buttons[6] = button7;
        buttons[7] = button8;
        buttons[8] = button9;
    }
    public void updateStats(){
        statsButton.setText("Cross: " + cross + " Zero: " + zero + " Tie: " + tie);
    }
    public TickTacToeForm() {
        cross = 0;
        zero = 0;
        tie = 0;

        fillButtonsMas();
        setWhichPlayer(false); // 0 - cross player by default
        setGameMode(false); // false - P1 vs P2 mode by default
        gameModeControl();


    }
    public void setGameMode(boolean gameMode) {
    }
    public JPanel getMainTickTackToePanel() {
        return mainTickTacToePanel;
    }
    private void removeActionListeners(JButton jButton){
        for (int i = 0; i < jButton.getActionListeners().length; i++) {
            jButton.removeActionListener(jButton.getActionListeners()[i]);
        }

    }
    private void gameModeControl(){
        gameModeP1P2.addActionListener(e -> {
            for (JButton button : buttons) {
                removeActionListeners(button);
            }
            gameModeP1P2.setEnabled(false);
            gameModeAI.setEnabled(true);
            gameModePlayers();
            clearAllFields();
            cross = 0;
            zero = 0;
            tie = 0;
        });
        gameModeAI.addActionListener(e -> {
            for (JButton button : buttons) {
                removeActionListeners(button);
            }
            gameModeP1P2.setEnabled(true);
            gameModeAI.setEnabled(false);
            gameModeAI();

            clearAllFields();
            cross = 0;
            zero = 0;
            tie = 0;
        });

    }
    private void setWhichPlayer(boolean whichPlayer){
        this.whichPlayer = whichPlayer;
    }
    private boolean isAnybodyWin(){
        updateStats();
        //wins horizontal
        if (!button1.getText().equals("") && (button1.getText().equals(button2.getText())) &&  (button1.getText().equals(button3.getText()))){
            if (whichPlayer) {
                System.out.println("Cross player win!");
                cross++;
            }
            else {
                System.out.println("Zero player win!");
                zero++;
            }
            return true;
        }
        if (!button4.getText().equals("") && (button4.getText().equals(button5.getText())) &&  (button4.getText().equals(button6.getText()))){
            if (whichPlayer) {
                System.out.println("Cross player win!");
                cross++;
            }
            else {
                System.out.println("Zero player win!");
                zero++;
            }
            return true;
        }
        if (!button7.getText().equals("") && (button7.getText().equals(button8.getText())) &&  (button7.getText().equals(button9.getText()))){
            if (whichPlayer) {
                System.out.println("Cross player win!");
                cross++;
            }
            else {
                System.out.println("Zero player win!");
                zero++;
            }
            return true;
        }
        //wins vertical
        if (!button1.getText().equals("") && (button1.getText().equals(button4.getText())) &&  (button4.getText().equals(button7.getText()))){
            if (whichPlayer) {
                System.out.println("Cross player win!");
                cross++;
            }
            else {
                System.out.println("Zero player win!");
                zero++;
            }
            return true;
        }
        if (!button2.getText().equals("") && (button2.getText().equals(button5.getText())) &&  (button5.getText().equals(button8.getText()))){
            if (whichPlayer) {
                System.out.println("Cross player win!");
                cross++;
            }
            else {
                System.out.println("Zero player win!");
                zero++;
            }
            return true;
        }
        if (!button3.getText().equals("") && (button3.getText().equals(button6.getText())) &&  (button6.getText().equals(button9.getText()))){
            if (whichPlayer) {
                System.out.println("Cross player win!");
                cross++;
            }
            else {
                System.out.println("Zero player win!");
                zero++;
            }
            return true;
        }
        //cross wins
        if (!button1.getText().equals("") && (button1.getText().equals(button5.getText())) &&  (button5.getText().equals(button9.getText()))){
            if (whichPlayer) {
                System.out.println("Cross player win!");
                cross++;
            }
            else {
                System.out.println("Zero player win!");
                zero++;
            }
            return true;
        }
        if (!button3.getText().equals("") && (button3.getText().equals(button5.getText())) &&  (button5.getText().equals(button7.getText()))){
            if (whichPlayer) {
                System.out.println("Cross player win!");
                cross++;
            }
            else {
                System.out.println("Zero player win!");
                zero++;
            }
            return true;
        }
        return false;
    }
    private boolean getWhichPlayer(){
        return whichPlayer;
    }
    private boolean isAllFieldsEmpty(){
        boolean res;
        res = button1.getText().equals("") && button2.getText().equals("") && button3.getText().equals("") && button4.getText().equals("") && button5.getText().equals("") && button6.getText().equals("") && button7.getText().equals("") && button8.getText().equals("") && button9.getText().equals("");
        return res;
    }
    private boolean isAllFieldsFull(){
        boolean res;
        if (!button1.getText().equals("") && !button2.getText().equals("") && !button3.getText().equals("") && !button4.getText().equals("") && !button5.getText().equals("") && !button6.getText().equals("") && !button7.getText().equals("") && !button8.getText().equals("")&& !button9.getText().equals("")) {
            res = true;
            System.out.println("Tie!");
            tie++;
        }
        else res = false;
        updateStats();
        return res;
    }
    private void randomAIMove(){
        boolean done = false;
        while (!done) {
            int a = (int) ( (Math.random() * (9 - 1 + 1)) + 1);
            switch (a) {
                case 1:
                    if (button1.getText().equals("")) {
                        button1.setText("0");
                        done = true;
                    } else a = (int) ( (Math.random() * (9 - 1 + 1)) + 1);
                    break;
                case 2:
                    if (button2.getText().equals("")) {
                        button2.setText("0");
                        done = true;
                    } else a = (int) ( (Math.random() * (9 - 1 + 1)) + 1);
                    break;
                case 3:
                    if (button3.getText().equals("")) {
                        button3.setText("0");
                        done = true;
                    }
                    else a = (int) ( (Math.random() * (9 - 1 + 1)) + 1);
                    break;
                case 4:
                    if (button4.getText().equals("")) {
                        button4.setText("0");
                        done = true;
                    }
                    else a = (int) ( (Math.random() * (9 - 1 + 1)) + 1);
                    break;
                case 5:
                    if (button5.getText().equals("")) {
                        button5.setText("0");
                        done = true;
                    }
                    else a = (int) ( (Math.random() * (9 - 1 + 1)) + 1);
                    break;
                case 6:
                    if (button6.getText().equals("")) {
                        button6.setText("0");
                        done = true;
                    }
                    else a = (int) ( (Math.random() * (9 - 1 + 1)) + 1);
                    break;
                case 7:
                    if (button7.getText().equals("")) {
                        button7.setText("0");
                        done = true;
                    }
                    else a = (int) ( (Math.random() * (9 - 1 + 1)) + 1);
                    break;
                case 8:
                    if (button8.getText().equals("")) {
                        button8.setText("0");
                        done = true;
                    }
                    else a = (int) ( (Math.random() * (9 - 1 + 1)) + 1);
                    break;
                case 9:
                    if (button9.getText().equals("")) {
                        button9.setText("0");
                        done = true;
                    }
                    else a = (int) ( (Math.random() * (9 - 1 + 1)) + 1);
                    break;
                default:
                    System.out.println("Something gone wrong :(");
                    break;
            }
        }
    }
    private void gameModePlayers(){
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
    private void gameModeAI() {
        clickOnTextArea(button1, () -> {
            if (button1.getText().equals("")) {
                button1.setText("X");
                whichPlayer = true;

                if (isAnybodyWin()) {
                    clearAllFields();

                }
                if (isAllFieldsFull()) {
                    clearAllFields();
                }
                if (!isAllFieldsEmpty()){
                    randomAIMove();
                    whichPlayer = false;
                }
                if (isAnybodyWin()) {
                    clearAllFields();

                }
                if (isAllFieldsFull()) {
                    clearAllFields();
                }
            }

        });
        clickOnTextArea(button2, () -> {
            if (button2.getText().equals("")) {
                button2.setText("X");
                whichPlayer = true;

                if (isAnybodyWin()) {
                    clearAllFields();

                }
                if (isAllFieldsFull()) {
                    clearAllFields();

                }
                if (!isAllFieldsEmpty()) {
                    randomAIMove();
                    whichPlayer = false;
                }
                if (isAnybodyWin()) {
                    clearAllFields();


                }
                if (isAllFieldsFull()) {
                    clearAllFields();

                }
            }
        });
        clickOnTextArea(button3, () -> {
            if (button3.getText().equals("")) {
                button3.setText("X");
                whichPlayer = true;
                if (isAnybodyWin()) {
                    clearAllFields();

                }
                if (isAllFieldsFull()) {
                    clearAllFields();

                }
                if (!isAllFieldsEmpty()) {
                    randomAIMove();
                    whichPlayer = false;
                }
                if (isAnybodyWin()) {
                    clearAllFields();

                }
                if (isAllFieldsFull()) {
                    clearAllFields();

                }
            }
        });
        clickOnTextArea(button4, () -> {
            if (button4.getText().equals("")) {
                button4.setText("X");
                whichPlayer = true;
                if (isAnybodyWin()) {
                    clearAllFields();

                }
                if (isAllFieldsFull()) {
                    clearAllFields();

                }
                if (!isAllFieldsEmpty()) {
                    randomAIMove();
                    whichPlayer = false;
                }
                if (isAnybodyWin()) {
                    clearAllFields();

                }
                if (isAllFieldsFull()) {
                    clearAllFields();

                }
            }
        });
        clickOnTextArea(button5, () -> {
            if (button5.getText().equals("")) {
                button5.setText("X");
                whichPlayer = true;
                if (isAnybodyWin()) {
                    clearAllFields();

                }
                if (isAllFieldsFull()) {
                    clearAllFields();

                }
                if (!isAllFieldsEmpty()) {
                    randomAIMove();
                    whichPlayer = false;
                }
                if (isAnybodyWin()) {
                    clearAllFields();

                }
                if (isAllFieldsFull()) {
                    clearAllFields();

                }
            }
        });
        clickOnTextArea(button6, () -> {
            if (button6.getText().equals("")) {
                button6.setText("X");
                whichPlayer = true;

                if (isAnybodyWin()) {
                    clearAllFields();

                }
                if (isAllFieldsFull()) {
                    clearAllFields();

                }
                if (!isAllFieldsEmpty()) {
                    randomAIMove();
                    whichPlayer = false;
                }
                if (isAnybodyWin()) {
                    clearAllFields();

                }
                if (isAllFieldsFull()) {
                    clearAllFields();

                }
            }
        });
        clickOnTextArea(button7, () -> {
            if (button7.getText().equals("")) {
                button7.setText("X");
                whichPlayer = true;

                if (isAnybodyWin()) {
                    clearAllFields();

                }
                if (isAllFieldsFull()) {
                    clearAllFields();

                }
                if (!isAllFieldsEmpty()) {
                    randomAIMove();
                    whichPlayer = false;
                }
                if (isAnybodyWin()) {
                    clearAllFields();

                }
                if (isAllFieldsFull()) {
                    clearAllFields();

                }
            }
        });
        clickOnTextArea(button8, () -> {
            if (button8.getText().equals("")) {
                button8.setText("X");
                whichPlayer = true;
                if (isAnybodyWin()) {
                    clearAllFields();

                }
                if (isAllFieldsFull()) {
                    clearAllFields();

                }
                if (!isAllFieldsEmpty()) {
                    randomAIMove();
                    whichPlayer = false;
                }
                if (isAnybodyWin()) {
                    clearAllFields();

                }
                if (isAllFieldsFull()) {
                    clearAllFields();

                }
            }
        });
        clickOnTextArea(button9, () -> {
            if (button9.getText().equals("")) {
                button9.setText("X");
                whichPlayer = true;
                if (isAnybodyWin()) {
                    clearAllFields();

                }
                if (isAllFieldsFull()) {
                    clearAllFields();

                }
                if (!isAllFieldsEmpty()) {
                    randomAIMove();
                    whichPlayer = false;
                }
                if (isAnybodyWin()) {
                    clearAllFields();

                }
                if (isAllFieldsFull()) {
                    clearAllFields();

                }
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
        jButton.addActionListener(e -> l.doIt());
    }

}
