package ru.job4j.gui;

import javax.swing.*;
import java.awt.*;

public class Window {
    /**
     * Creating frame
     */
    public static void main(String[] args) {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int widthScreen = (int) size.getWidth();
        int heightScreen = (int) size.getHeight();
        JFrame window = new JFrame();
        window.setSize(widthScreen, heightScreen);
        window.setResizable(true);
        window.getContentPane().setBackground(Color.black);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        window.setCursor(Cursor.HAND_CURSOR);
        window.setFocusable(true);
        window.setVisible(true);


    }
}
