package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Contents extends JPanel implements ActionListener {

    int x, y;

    private Timer t;

    public Contents(){
        super.setDoubleBuffered(true);
        t = new Timer(7, this);
        t.start();

    }

    static KeyListener listener = new KeyListener() {
        public void keyPressed(KeyEvent event) {
            if(event.getKeyChar()== 'w'){
                event.consume();
            }
            if(event.getKeyChar()== 's'){
                event.consume();
            }
            if(event.getKeyChar()== 'a'){
                event.consume();
            }
        }

        public void keyReleased(KeyEvent event) {
            if(event.getKeyChar()==KeyEvent.VK_M){
                event.consume();
            }
            if(event.getKeyChar()==KeyEvent.VK_N){

                event.consume();
            }
            if(event.getKeyChar()==KeyEvent.VK_H){
                event.consume();
            }
        }

        public void keyTyped(KeyEvent event) {
        }

    };

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        }


    public static int xV = 0;
    public static int yV = 0;

    public void move(){
        x = x + xV;
        y = y + yV;
    }

    public void actionPerformed(ActionEvent e) {
        move();


        repaint();
    }
}

