// This class was created by xen on the 10/29/2020 

package clocks;

import actions.Collision;
import game.Snake;

public class GameClock extends Thread {

    public static boolean isRunning = true;

    public void run() {
        try {
            while (isRunning) {
                sleep(200);
                Snake.move();
                Snake.waitToMove = false;

                Collision.collidePickUp();

                if (Collision.collideSelf()) {
                    Snake.tails.clear();
                    Snake.score = 0;
                }

                if (Collision.collideWall()) {
                    Snake.tails.clear();
                    Snake.head.setX(7);
                    Snake.head.setY(7);
                    Snake.score = 0;
                }

            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

}
