/*
 */
package exercisegameoflife;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author flyberson
 */
public class Game {

    ArrayList<Cell> al;
    Cell c1 = new Cell();
    Cell c2 = new Cell();
    Cell c3 = new Cell();
    Cell c4 = new Cell();
    Cell c5 = new Cell();
    Cell c6 = new Cell();
    Cell c7 = new Cell();

    public Game() {
        this.al = new ArrayList<>();
        c1.setAlive(true);
        c2.setAlive(true);
        c3.setAlive(true);
        c4.setAlive(false);
        c5.setAlive(false);
        c6.setAlive(false);
        c7.setAlive(false);
    }

    public void draw(Graphics g) {
        for (Cell cell : al) {
            g.drawString(cell.toString(), 0, 0);
        }
    }

    public void update() {
        for (int i = 0; i < al.size(); i++) {
            Cell cl = al.get(i);
            if (cl.isAlive() == true) {
                i++;
                cl = al.get(i);
                cl.setLivingNeighbours(cl.getLivingNeighbours() + 1);
                i--;
                if (i-- > 0) {
                    i--;
                    cl = al.get(i);
                    cl.setLivingNeighbours(cl.getLivingNeighbours() + 1);
                    i++;

                }
            }

        }
        {

        }
    }

}
