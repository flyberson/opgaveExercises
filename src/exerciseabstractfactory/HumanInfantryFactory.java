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
       
      
       
        switch (techlevel) {
            case 0:
                RockHauler rh = new RockHauler(2, 0, 10, 2);
               
                rh.setRace(1);
                return rh;
            case 1:
                SpearThrower st = new SpearThrower(3, 2, 10, 3);
                st.setRace(1);
                return st;
            case 2:
                Archer a = new Archer(4, 2, 10, 4);
           a.setRace(1);
                return a;
            case 3:
                CrossbowMan cbm = new CrossbowMan(4, 2, 10, 5);
            cbm.setRace(1);
                return cbm;
            case 4:
                Musketeer m = new Musketeer(5, 2, 10, 5);
               m.setRace(1);
                return m;
            default:
                break;
        }
        return null;
}
}
