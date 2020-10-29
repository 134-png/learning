// This class was created by xen on the 10/29/2020 

package gui;

import game.Snake;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Field;

public class Draw extends JLabel {

    Point point;

    protected void paintComponent(Graphics graphics) {

        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);

        // Draw Background
        graphics.setColor(Color.LIGHT_GRAY);
        graphics.fillRect(0, 0, Gui.width, Gui.height);

        // Draw Snake Tails
        graphics.setColor(new Color(51, 204, 51));
        for (int i = 0; i < Snake.tails.size(); i++) {
            point = Snake.pointToCoordinates(Snake.tails.get(i).getX(), Snake.tails.get(i).getY());
            graphics.fillRect(point.x, point.y, 32, 32);
        }

        // Draw Snake Head
        graphics.setColor(new Color(8, 153, 8));
        point = Snake.pointToCoordinates(Snake.head.getX(), Snake.head.getY());
        graphics.fillRect(point.x, point.y, 32, 32);

        // Draw PickUp
        graphics.setColor(new Color(204, 51, 0));
        point = Snake.pointToCoordinates(Snake.pickUp.getX(), Snake.pickUp.getY());
        graphics.fillRect(point.x, point.y, 32, 32);

        // Draw Grid
        graphics.setColor(Color.GRAY);
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                graphics.drawRect(i * 32 + Gui.xoff, j * 32 + Gui.yoff, 32, 32);
            }
        }

        // Draw Border
        graphics.setColor(Color.BLACK);
        graphics.drawRect(Gui.xoff, Gui.yoff, 512, 512);

        // Draw Score
        graphics.setFont(new Font("Arial", Font.BOLD, 20));
        graphics.drawString("Score » " + Snake.score, 5, 25);
        graphics.drawString("Best » " + Snake.bestScore, 655, 25);

        // Finish
        repaint();

    }

}
