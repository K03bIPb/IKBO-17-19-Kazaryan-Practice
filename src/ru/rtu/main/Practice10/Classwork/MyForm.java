package ru.rtu.main.Practice10.Classwork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyForm {
    private JPanel drawPanel;
    private JButton button1;
    private JTextArea textArea1;
    private JButton drawButton;

    JPanel getPanel1(){
        return drawPanel;
    }
    MyForm() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(textArea1.getText());
            }
        });
        textArea1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textArea1.setBackground(Color.yellow);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        textArea1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == '6') {
                    textArea1.setText(textArea1.getText() + "Hello World!");
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        drawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics2D graphics2D = (Graphics2D) drawPanel.getGraphics();
                graphics2D.setColor(Color.red);
                graphics2D.fillRect(70, 19, 59, 59);
            }
        });

    }
}
