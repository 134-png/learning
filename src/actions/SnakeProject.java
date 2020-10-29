// This class was created by xen on the 10/29/2020 

package actions;

import clocks.GameClock;
import gui.Gui;

public class SnakeProject {

    public static void main(String[] args) {

        Gui gui = new Gui();
        GameClock gameClock = new GameClock();

        gui.create();
        gameClock.start();

        System.out.println(">> 'Snake-Game' wurde gestartet!");

    }

}
