// This class was created by xen on the 10/29/2020 

package gui;

import actions.KeyHandler;

import javax.swing.*;

public class Gui {

    JFrame jFrame;
    Draw draw;

    public static int width = 800, height = 600;
    public static int xoff = 130, yoff = 20;

    public void create() {

        jFrame = new JFrame("Snake Game * by xen");

        jFrame.setSize(width, height);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.addKeyListener(new KeyHandler());


        draw = new Draw();
        draw.setBounds(0, 0, width, height);
        draw.setVisible(true);
        jFrame.add(draw);

        jFrame.requestFocus();
        jFrame.setVisible(true);

    }

}
