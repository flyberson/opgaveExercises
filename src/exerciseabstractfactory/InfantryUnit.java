/*
 */
package exerciseabstractfactory;

import javax.swing.SwingConstants;

/**
 *
 * @author flyberson
 */
public abstract class InfantryUnit {

    int range;
    int armor;
    int hits;
    int damage;
    int race;

    public int getRace() {
        return race;
    }

    public void setRace(int race) {
        this.race = race;
    }

    public InfantryUnit(int range, int armor, int hits, int damage) {
        this.range = range;
        this.armor = armor;
        this.hits = hits;
        this.damage = damage;
    }

    public void takeDamage(int damage) {
        int reduction = (int) (Math.random() * armor);
        System.out.println(armor);
        if (damage > reduction) {
            hits = hits - (damage - reduction);
            System.out.println("Armor blocked = " + reduction);
        } else {

            System.out.println("Blocked");
        }

    }

    public void attack(InfantryUnit unit) {
        int attackdamage = (int) (Math.random() * damage) + 1;
        unit.takeDamage(attackdamage);
    }

    public boolean alive() {
        boolean alive = true;
        if (hits < 0) {
            alive = false;
        }
        return alive;
    }

    @Override
    public String toString() {
        return "InfantryUnit{" + "range=" + range + ", armor=" + armor + ", hits=" + hits + ", damage=" + damage + '}';
    }

}
