/*
 */
package exerciseabstractfactory;

/**
 *
 * @author flyberson
 */
public class HumanInfantryFactory extends InfantryFactory{
    int techlevel;
    int range;
    int hits;
    int damage;
    int armor;

    public InfantryUnit createUnit(int techlevel){
       
        System.out.println("here1");
       
        switch (techlevel) {
            case 0:
                RockHauler rh = new RockHauler(2, 0, 10, 2);
                System.out.println("here2");
                
                return rh;
            case 1:
                SpearThrower st = new SpearThrower(3, 2, 10, 3);
                return st;
            case 2:
                Archer a = new Archer(4, 2, 10, 4);
                System.out.println("here3");
                return a;
            case 3:
                CrossbowMan cbm = new CrossbowMan(4, 2, 10, 5);
                return cbm;
            case 4:
                Musketeer m = new Musketeer(5, 2, 10, 5);
                return m;
            default:
                break;
        }
        return null;
}
}
